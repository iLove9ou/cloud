package com.cloud.service.controller;


import com.cloud.service.model.UserDO;
import com.cloud.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUser")
    public UserDO getUser(@RequestBody UserDO userDO) {
        return userService.getUser(userDO.getId().toString());
    }
}
