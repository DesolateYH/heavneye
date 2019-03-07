package com.hziee.heavneye.controller;

import com.hziee.heavneye.service.UserService;
import com.hziee.heavneye.model.dto.User;
import com.hziee.heavneye.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by john on 2017-10-01.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public User addUser(){
        User user = new User();
        user.setId(2);
        user.setGender("男");
        user.setAge(12);
        user.setName("古美門");
        return userService.addUser(user);
    }

    /**
     * 查询所有用户;
     * @return
     */
    @RequestMapping("/findAll")
    public Iterable<User> getAll(){
        return userService.getAll();

    }

    /**
     * 查询单个用户;
     * @return
     */
   /* @RequestMapping("/findById")
    public User finById(){
        return userService.findByIdUser(2);

    }

    @RequestMapping("/delete")
    public String deleteUser(){
        Integer id = 2;
        userService.deleteUser(id);
        return "success";
    }*/
}
