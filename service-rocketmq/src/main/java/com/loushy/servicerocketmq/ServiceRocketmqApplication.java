package com.loushy.servicerocketmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.loushy")
@EnableEurekaClient
public class ServiceRocketmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRocketmqApplication.class, args);
    }

}
