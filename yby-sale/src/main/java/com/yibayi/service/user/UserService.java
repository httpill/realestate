package com.yibayi.service.user;

import com.yibayi.bean.entity.User;

public interface UserService {

    User currentUser();

    User findUser(Long id);
}
