package service.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.model.UserDO;
import service.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUser")
    public UserDO getUser(@RequestBody UserDO userDO) {
        return userService.getUser(userDO.getId().toString());
    }
}
