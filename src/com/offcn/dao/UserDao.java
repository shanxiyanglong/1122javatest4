package com.offcn.dao;

import com.offcn.bean.User;

public interface UserDao {
    //通过用户名和密码查询用户
    User selectUserByUsernameAndPassword(String username, String password);
}
