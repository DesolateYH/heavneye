package com.hziee.heavneye.controller;


import com.hziee.heavneye.Msg;
import com.hziee.heavneye.model.User;
import com.hziee.heavneye.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class UserController {

    @Autowired
    UserServiceImpl userServiceImpl;


    @GetMapping("/doLogin")
    public Msg doLogin(User user) {
        User user1 =  userServiceImpl.getUser(user.getPassword(),user.getUsername());
        if(user1 == null){
            return Msg.statu400();
        }else{
            return Msg.statu200();
        }

    }


    @RequestMapping("doRegist")
    public Msg doRegist(User user){
        userServiceImpl.insertUser(user);
        if(user == null){
            return Msg.statu400();
        }else{
            return Msg.statu200();
        }
    }
}
