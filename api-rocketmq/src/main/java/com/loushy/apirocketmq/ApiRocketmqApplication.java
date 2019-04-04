package com.loushy.apirocketmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.loushy")
@EnableDiscoveryClient
@EnableFeignClients
public class ApiRocketmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiRocketmqApplication.class, args);
    }

}
