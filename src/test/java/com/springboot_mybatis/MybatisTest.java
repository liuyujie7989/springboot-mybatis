package com.springboot_mybatis;

import com.springboot_mybatis.dao.UserMapper;
import com.springboot_mybatis.po.User;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

/**
 * @program: springboot-test
 * @description:
 * @author: liuyishou
 * @create: 2020-06-08 23:27
 **/
//@RunWith(SpringRunner.class) springboot 2.2之后 集成的junit5 无需加改注解
@SpringBootTest(classes = SpringbootMybatisApplication.class)
public class MybatisTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public  void userTest() {
        List<User> userList = userMapper.queryUserList();
        System.out.println(userList);
    }
}
