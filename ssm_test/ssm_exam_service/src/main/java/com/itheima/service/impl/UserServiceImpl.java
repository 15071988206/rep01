package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    /**
     * 用户登录
     * @param
     * @return
     */
    @Override
    public User login(String username, String password) {
        return userDao.login(username,password);
    }



}
