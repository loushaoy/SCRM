package com.loushy.servicerocketmq;

import com.loushy.entity.User;
import com.loushy.servicerocketmq.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceRocketmqApplicationTests {

    @Resource
    UserDao userDao;

    @Test
    public void contextLoads() {
        User user = new User();
        user.setUsername("123");
        user.setPassword("****");
        userDao.insertUser(user);
    }

}
