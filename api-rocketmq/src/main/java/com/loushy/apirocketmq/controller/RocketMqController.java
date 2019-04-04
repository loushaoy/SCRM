package com.loushy.apirocketmq.controller;

import com.alibaba.fastjson.JSONObject;
import com.loushy.apirocketmq.service.RocketMqService;
import com.loushy.entity.User;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class RocketMqController {
    private  static  final Logger LOGGER = LoggerFactory.getLogger(RocketMqController.class);
    @Resource
    RocketMqService service;

    @Resource
    DefaultMQProducer defaultMQProducer;

    //两个例子对比 Tag-insert 和 Tag-update 的区别

    @RequestMapping("/insertUser")
    public String insertUser(User user) throws MQClientException, RemotingException, MQBrokerException, InterruptedException{ //不同模块中的类相互使用要在pom文件中添加依赖
        LOGGER.info("开始发送注册信息");
        Message message = new Message("Topic","Tag-insert",JSONObject.toJSON(user).toString().getBytes());
        SendResult result = defaultMQProducer.send(message);
        LOGGER.info("消息发送相应信息:"+result.toString());
        return service.insertUser(JSONObject.toJSON(user).toString());
    }

    @RequestMapping("/updateUser")
    public String updateUser(User user) throws MQClientException, RemotingException, MQBrokerException, InterruptedException{
        LOGGER.info("开始发修改册信息");
        Message message = new Message("Topic","Tag-update",JSONObject.toJSON(user).toString().getBytes());
        SendResult result = defaultMQProducer.send(message);
        LOGGER.info("消息发送相应信息:"+result.toString());
        return service.insertUser(JSONObject.toJSON(user).toString());
    }
}
