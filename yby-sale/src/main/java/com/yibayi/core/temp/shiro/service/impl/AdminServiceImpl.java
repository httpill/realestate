package com.yibayi.core.temp.shiro.service.impl;

import com.yibayi.core.temp.shiro.bean.Page;
import com.yibayi.core.temp.shiro.bean.Pageable;
import com.yibayi.core.temp.shiro.constents.DictionaryCode;
import com.yibayi.core.temp.shiro.constents.StatusCode;
import com.yibayi.core.temp.shiro.constents.UserConstant;
import com.yibayi.core.temp.shiro.dao.AdminCustomMapper;
import com.yibayi.core.temp.shiro.dao.AdminMapper;
import com.yibayi.core.temp.shiro.po.Admin;
import com.yibayi.core.temp.shiro.po.AdminCustom;
import com.yibayi.core.temp.shiro.service.AdminService;
import com.yibayi.core.temp.shiro.util.RoleUtil;
import com.yibayi.core.temp.shiro.util.SNUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminMapper adminMapper;

	@Autowired
	private AdminCustomMapper customMapper;

	/**
	 * 清空敏感信息
	 */
	public AdminCustom sensitive(AdminCustom admin) {
		if (admin == null) {
			return null;
		}
		admin.setPassword("");
		admin.setSalt("");
		admin.setIdcard("");
		admin.setIdcardBackPic("");
		admin.setIdcardFrontPic("");
		admin.setPassport("");
		return admin;
	}

	public String save(Admin admin, String ip, Admin current) {
		if (StringUtils.isBlank(admin.getMobile()) || StringUtils.isBlank(admin.getPassword())) {
			return StatusCode.PARAM_ERROR;
		}
		AdminCustom affirm = this.getByAccount(admin.getMobile());
		if (affirm != null) {
			return StatusCode.ALREADY_EXIST;
		}
		// 默认头像
		admin.setPhoto(UserConstant.DEFAULT_PHOTO_PATH);
		// 用户名
		admin.setUserName(SNUtil.nextSn());
		// 昵称
		if (StringUtils.isBlank(admin.getNickName())) {
			admin.setNickName(RoleUtil.getRoleName(admin.getRoleId()) + admin.getMobile());
		}
		// 盐值
		String salt = UUID.randomUUID().toString().replace("-", "");
		// 保存盐值
		admin.setSalt(salt);
		// 密码加密
		admin.setPassword(
				new SimpleHash(UserConstant.ENCODE_RULE, admin.getPassword(), salt, UserConstant.MANAGE_ENCODE_DEGREE)
						.toString());
		// 账号状态（默认：正常）
		admin.setStatus(DictionaryCode.ACCOUNT_STATUS.NORMAL);
		Date now = new Date();
		if (current != null) {
			// 创建者ID
			admin.setCreator(current.getId());
			// 修改者ID
			admin.setModifier(current.getId());
			// 操作人角色ID
			admin.setRoleId(current.getRoleId());
		}
		// 是否删除（默认为0，未删除）
		admin.setIsDelete((byte) 0);
		// 注册IP地址
		admin.setRegisterIp(ip);
		// 创建时间
		admin.setCreateTime(now);
		// 修改时间
		admin.setUpdateTime(now);
		if (adminMapper.insertSelective(admin) < 1) {
			return StatusCode.ERROR;
		}
		return StatusCode.SUCCESS;
	}

	public String update(Admin admin, String ip, Admin current) {
		if (admin.getId() == null) {
			return StatusCode.PARAM_ERROR;
		}
		Admin affirm = adminMapper.selectByPrimaryKey(admin.getId());
		if (affirm == null) {
			return StatusCode.NOT_FOUND;
		}
		// 若密码不为空则重新设置密码
		if (StringUtils.isNoneBlank(admin.getPassword())) {
			// 盐值
			String salt = UUID.randomUUID().toString().replace("-", "");
			// 保存盐值
			admin.setSalt(salt);
			// 保存密码
			admin.setPassword(new SimpleHash(UserConstant.ENCODE_RULE, admin.getPassword(), salt,
					UserConstant.MANAGE_ENCODE_DEGREE).toString());
		} else {
			admin.setSalt(affirm.getSalt());
			admin.setPassword(affirm.getPassword());
		}
		Date now = new Date();
		if (current != null) {
			// 修改者ID
			admin.setModifier(current.getId());
			// 操作人角色ID
			admin.setRoleId(current.getRoleId());
		}
		// 修改时间
		admin.setUpdateTime(now);
		if (adminMapper.updateByPrimaryKeySelective(admin) < 1) {
			return StatusCode.ERROR;
		}
		return StatusCode.SUCCESS;
	}

	public int delete(Long id) {
		return customMapper.delete(id);
	}

	public List<AdminCustom> list(AdminCustom custom, Pageable pageable) {
		return customMapper.list(custom, pageable);
	}

	public long total(AdminCustom custom) {
		return customMapper.total(custom);
	}

	public Page<AdminCustom> page(AdminCustom custom, Pageable pageable) {
		List<AdminCustom> list = customMapper.list(custom, pageable);
		// TODO 系统暂未实现角色系统，暂时写死判断
		for (AdminCustom admin : list) {
			admin.setRoleName(RoleUtil.getRoleName(admin.getRoleId()));
		}

		Page<AdminCustom> page = new Page<AdminCustom>(list, total(custom), pageable);
		return page;
	}

	public AdminCustom detail(Long id) {
		if (id == null) {
			return null;
		}
		AdminCustom admin = customMapper.detail(id);
		return sensitive(admin);
	}

	public AdminCustom getByAccount(String account) {
		return customMapper.getByAccount(account);
	}
}
