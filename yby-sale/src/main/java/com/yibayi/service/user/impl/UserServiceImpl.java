package com.yibayi.service.user.impl;

import com.yibayi.bean.entity.User;
import com.yibayi.core.base.service.BaseService;
import com.yibayi.dao.user.UserMapper;
import com.yibayi.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseService implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User currentUser() {
        Long id = currentId();
        return userMapper.selectById(id);
    }

    @Override
    public User findUser(Long id) {
        return userMapper.selectById(id);
    }


}
