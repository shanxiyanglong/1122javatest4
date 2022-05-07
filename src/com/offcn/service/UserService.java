package com.offcn.service;

import com.offcn.bean.User;

public interface UserService {
    //通过用户名和密码查询用户
    User selectUserByUsernameAndPassword(String username, String password);
}
