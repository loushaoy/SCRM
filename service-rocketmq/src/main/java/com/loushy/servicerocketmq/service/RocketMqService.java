package com.loushy.servicerocketmq.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;
import com.loushy.entity.User;
import com.loushy.servicerocketmq.dao.UserDao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class RocketMqService {

    @Resource
    UserDao userDao;

    @RequestMapping("/insertUser")
    public boolean insertUser(@RequestParam(value = "user")String userJson){
        System.out.println("------------------------------------分割线--------------------------------------");
        User user =JSON.parseObject(userJson,User.class);
        userDao.insertUser(user);
        return true;
    }
}
