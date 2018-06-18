package com.cloud.computing.cloud.service;

import com.cloud.computing.cloud.dao.UserDao;
import com.cloud.computing.cloud.model.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public UserDO getUser(String id) {
        return userDao.selectByPrimaryKey(id);
    }
}
