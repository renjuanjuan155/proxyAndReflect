package com.example.aopzhujie.controller;

import com.example.aopzhujie.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Date 2020/12/28 16:12
 * @Created by meijunjie
 */
@RestController
public class UserController {



    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public List<User> getUser(){

        List<User> userList = new ArrayList<User>();
        User user1 = new User();
        user1.setId(1);
        user1.setName("夏明");
        user1.setPassword("123456");
        userList.add(user1);
        return userList;

    }
}
