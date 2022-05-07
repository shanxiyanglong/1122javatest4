package com.offcn.service;

import com.offcn.bean.User;
import com.offcn.dao.UserDao;
import com.offcn.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
    UserDao ud = new UserDaoImpl();
    @Override
    public User selectUserByUsernameAndPassword(String username, String password) {
        return ud.selectUserByUsernameAndPassword(username,password);
    }
}
