package com.hziee.heavneye.model.vo;

import com.hziee.heavneye.model.po.UserActivity;
import lombok.Data;

/**
 * Description: TODO
 *
 * @author MessiahJK
 * @version V1.0
 * @date 2018/10/15 16:44
 */
@Data
public class UserActivityVO {
    Integer id;
    /**
     * 用户学号
     */
    String stuId;
    /**
     * 扫码员学号
     */
    String scannerId;
    /**
     * 活动id
     */
    Integer activityId;
    /**
     * 活动名称
     */
    String activityName;
    /**
     * 活动类型
     */
    String activityType;
    /**
     * 时长
     */
    Double duration;
    /**
     * 额外参数
     */
    String exparam;
    /**
     * 创建时间
     */
    Long created;
    /**
     * 修改时间
     */
    Long modified;

    public UserActivityVO() {

    }

    public UserActivityVO(UserActivity userActivity) {
        this.id = userActivity.getId();
        this.stuId = userActivity.getStuId();
        this.scannerId = userActivity.getScannerId();
        this.activityId = userActivity.getActivityId();
        this.activityName = userActivity.getActivityName();
        this.activityType = userActivity.getActivityType();
        this.duration = userActivity.getDuration();
        this.exparam = userActivity.getExparam();
        this.created = userActivity.getCreated().getTime();
        this.modified = userActivity.getCreated().getTime();
    }
}
