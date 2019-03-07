package com.hziee.heavneye.controller;

import com.hziee.heavneye.dao.ActivityRepository;
import com.hziee.heavneye.model.po.Activity;
import com.hziee.heavneye.model.vo.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service
public class CLogin {
    private final ActivityRepository activityRepository;

    @Autowired
    public CLogin(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
        System.out.println("ssssssssssssssssss" + activityRepository);
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public boolean login(String user_id, String user_password) {
        System.out.println(user_id);
        System.out.println(user_password);

        return true;
    }
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Msg changeStatus(int id, String status) {
        Activity activity;
        try {
            activity = activityRepository.findById(id);
        } catch (Exception e) {
            return Msg.statu403();
        }
        if (activity == null) {
            return Msg.statu403();
        }
        activity.setStatus(status);
        activityRepository.save(activity);
        return Msg.statu200();
    }
}
