package com.springboot_mybatis.controller;

import com.springboot_mybatis.dao.UserMapper;
import com.springboot_mybatis.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: springboot-test
 * @description:
 * @author: liuyishou
 * @create: 2020-06-08 23:08
 **/
@RestController
public class UserController {
    @Autowired
    public UserMapper userMapper;

    @RequestMapping("/getUserData")
    public List<User> getUserData() {
        List<User> users = userMapper.queryUserList();
        return users;
    }
}
