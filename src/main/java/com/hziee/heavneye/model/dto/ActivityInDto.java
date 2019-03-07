package com.hziee.heavneye.model.dto;

import com.hziee.heavneye.model.po.Activity;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @author MessiahJK
 * @date 2018/9/27
 * @time 0:49
 */
@Data
public class ActivityInDto {


    /**
     * code码
     */
    String code;
    /**
     * 活动名称
     */
    String name;
    /**
     * 时长
     */
    double duration;

    /**
     * 活动开始时间
     */
    Timestamp startTime;

    /**
     * 活动结束时间
     */
    Timestamp finishTime;

    /**
     * 活动单位
     */
    String unit;

    /**
     * 活动地点
     */
    String location;

    /**
     * 活动类型
     */
    String type;

    /**
     * 活动分数
     */
    String fraction;

    /**
     * 活动信息
     */
    String message;


    /**
     * 额外参数
     */
    String exparam;

    public Activity toActivity() {
        Activity activity = new Activity();
        activity.setName(this.name);
        activity.setDuration(this.duration);
        activity.setStartTime(this.startTime);
        activity.setFinishTime(this.finishTime);
        activity.setUnit(this.unit);
        activity.setLocation(this.location);
        activity.setType(this.type);
        activity.setFraction(this.fraction);
        activity.setMessage(this.message);
        return activity;
    }
}
