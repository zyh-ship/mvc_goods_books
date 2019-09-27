package cn.itcast.goods.category.service;

	

import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.itcast.goods.category.dao.UserDao;

import java.sql.SQLException;

public class UserService {
    UserDao userDao = new UserDao();

    public boolean ajaxFindloginname(String loginname) {
        try {
            return userDao.ajaxFindloginname(loginname);
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    public boolean ajaxFindEmail(String email) {
        try {
            return userDao.ajaxFindEmail(email);
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
}