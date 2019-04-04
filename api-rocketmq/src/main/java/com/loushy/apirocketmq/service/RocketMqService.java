package com.loushy.apirocketmq.service;

import com.loushy.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Feign的特点：
 * 1.声明式REST客户端（伪RPC）
 * 2.采用了基于接口的注解。
 */

@FeignClient(value = "service-rocketmq")
public interface RocketMqService {

    @GetMapping("/insertUser")
    String insertUser(@RequestParam(value = "user")String user);
}
