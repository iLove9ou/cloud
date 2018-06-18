package service.dao;


import org.apache.ibatis.annotations.Mapper;
import service.model.UserDO;

@Mapper
public interface UserDao {

    public UserDO selectByPrimaryKey(String id);
}
