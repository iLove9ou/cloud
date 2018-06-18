package service.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.dao.UserDao;
import service.model.UserDO;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public UserDO getUser(String id) {
        return userDao.selectByPrimaryKey(id);
    }
}
