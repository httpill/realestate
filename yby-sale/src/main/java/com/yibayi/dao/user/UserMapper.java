package com.yibayi.dao.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yibayi.bean.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
