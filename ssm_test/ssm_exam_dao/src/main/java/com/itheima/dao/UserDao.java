package com.itheima.dao;

import com.itheima.domain.User;

public interface UserDao {
    /**
     * 用户登录
     * @param
     * @param
     */
    public User login(String username, String password);
}
