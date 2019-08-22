package com.yibayi.core.temp.shiro.dao;

import com.yibayi.core.temp.shiro.bean.Pageable;
import com.yibayi.core.temp.shiro.po.AdminCustom;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AdminCustomMapper {

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
	 * 详情
	 */
	AdminCustom detail(Long id);

	/**
	 * 根据账号查找
	 */
	AdminCustom getByAccount(@Param("account") String account);

}
