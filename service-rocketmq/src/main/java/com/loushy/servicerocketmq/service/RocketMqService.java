package com.loushy.servicerocketmq.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;
import com.loushy.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RocketMqService {

    @RequestMapping("/insertUser")
    public String insertUser(@RequestParam(value = "user")String user){
        User u =JSON.parseObject(user,User.class);
        return u.toString();
    }
}
