package com.loushy.servicerocketmq.dao;

import com.loushy.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface UserDao {

    void insertUser(User user);

    Map selectUsers();
}
