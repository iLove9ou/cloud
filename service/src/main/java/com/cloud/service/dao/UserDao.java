package com.cloud.service.dao;


import com.cloud.service.model.UserDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    public UserDO selectByPrimaryKey(String id);
}
