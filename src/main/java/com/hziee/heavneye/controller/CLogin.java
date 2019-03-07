package com.hziee.heavneye.controller;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service
public class CLogin {


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public boolean login(String user_id, String user_password) {
        System.out.println(user_id);
        System.out.println(user_password);


        return true;
    }

}
