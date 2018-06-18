package com.cloud.computing.cloud.dao;

import com.cloud.computing.cloud.model.UserDO;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserDao {

    public UserDO selectByPrimaryKey(String id);
}
