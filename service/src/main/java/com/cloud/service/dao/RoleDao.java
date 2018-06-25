package com.cloud.service.dao;

import com.cloud.service.model.entity.UserDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleDao {
    public UserDO selectByPrimaryKey(String id);
}
