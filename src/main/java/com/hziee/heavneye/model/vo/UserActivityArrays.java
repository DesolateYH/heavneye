package com.hziee.heavneye.model.vo;

import com.hziee.heavneye.model.po.UserActivity;
import lombok.Data;

/**
 * 用于接收活动章数组
 *
 * @author MessiahJK
 * @date 2018/9/21
 * @time 0:25
 */
@Data
public class UserActivityArrays {
    /**
     * 数组长度，用于验证
     */
    private int num;
    /**
     * UserActivity的数组，用于接收活动
     */
    private UserActivity[] activityArray;
    /**
     * 获取openId的code码
     */
    private String code;
}
