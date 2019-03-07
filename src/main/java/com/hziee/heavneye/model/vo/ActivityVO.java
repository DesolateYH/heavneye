package com.hziee.heavneye.model.vo;

import com.hziee.heavneye.model.po.Activity;
import lombok.Data;

/**
 * @author MessiahJK
 * @date 2018/9/22
 * @time 23:58
 */
@Data
public class ActivityVO {
    /**
     * 活动id
     */
    Integer id;

    /**
     * 活动名称
     */
    String name;
    /**
     * 时长
     */
    Double duration;

    /**
     * 活动开始时间
     */
    Long startTime;

    /**
     * 活动结束时间
     */
    Long finishTime;

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
     * 活动状态（默认值为Pending）
     * Pending
     * Running
     * Passed
     * Pause
     */
    String status;

    /**
     * 额外参数
     */
    String exparam;

    long created;

    Long modified;

    public ActivityVO(Activity activity) {
        this.id = activity.getId();
        this.name = activity.getName();
        this.duration = activity.getDuration();
        try {
            this.startTime = activity.getStartTime().getTime();
            this.finishTime = activity.getFinishTime().getTime();
        } catch (Exception e) {

        }
        this.created = activity.getCreated().getTime();
        this.modified = activity.getModified().getTime();

        this.unit = activity.getUnit();
        this.location = activity.getLocation();
        this.type = activity.getType();
        this.fraction = activity.getFraction();
        this.message = activity.getMessage();
        this.status = activity.getStatus();
        this.exparam = activity.getExparam();
    }
}
