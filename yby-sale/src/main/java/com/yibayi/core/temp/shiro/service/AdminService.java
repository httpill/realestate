package com.yibayi.core.temp.shiro.service;

import com.yibayi.core.temp.shiro.bean.Page;
import com.yibayi.core.temp.shiro.bean.Pageable;
import com.yibayi.core.temp.shiro.po.Admin;
import com.yibayi.core.temp.shiro.po.AdminCustom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 管理员
 */
public interface AdminService {

	/**
	 * 保存
	 */
	String save(Admin admin, String ip, Admin current);

	/**
	 * 后台更新
	 */
	String update(Admin admin, String ip, Admin current);

	/**
	 * 详情
	 */
	AdminCustom detail(Long id);

	/**
	 * 逻辑删除
	 */
	int delete(Long id);

	/**
	 * 获取列表
	 */
	List<AdminCustom> list(@Param("custom") AdminCustom custom, @Param("pageable") Pageable pageable);

	/**
	 * 获取总数
	 */
	long total(AdminCustom custom);

	/**
	 * 分页
	 */
	Page<AdminCustom> page(AdminCustom custom, Pageable pageable);

	/**
	 * 根据账号查找
	 */
	AdminCustom getByAccount(String account);
}