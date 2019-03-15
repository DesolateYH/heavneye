package com.hziee.heavneye.service;

import com.hziee.heavneye.dao.UserDao;
import com.hziee.heavneye.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl {
    @Autowired
    UserDao userDao;

    public User getUser(String username, String password) {
        return userDao.getByPasswordAndUsername(username,password);

    }

    public void insertUser(User user) {
        userDao.save(user);
    }
}
