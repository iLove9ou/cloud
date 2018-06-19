package com.cloud.service.service;


import com.cloud.service.dao.UserDao;
import com.cloud.service.model.UserDO;
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
