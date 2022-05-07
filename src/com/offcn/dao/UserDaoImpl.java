package com.offcn.dao;

import com.offcn.bean.User;
import com.offcn.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;


public class UserDaoImpl implements UserDao {
    @Override
    public User selectUserByUsernameAndPassword(String username, String password) {
        QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
        User user = new User();
        String sql = "SELECT * from user WHERE username = ? and password = ?";
        try {
            user = qr.query(sql, new BeanHandler<>(User.class), username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
