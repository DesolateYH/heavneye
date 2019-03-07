package com.hziee.heavneye.model.vo;

import com.hziee.heavneye.model.po.Scanner;
import lombok.Data;

/**
 * @author MessiahJK
 * @date 2018/9/24
 * @time 1:36
 */
@Data
public class ScannerVO {
    /**
     * id值
     */
    Integer id;
    /**
     * 用户id
     */
    String userId;

    /**
     * 用户名
     */
    String userName;

    /**
     * 活动id
     */
    Integer activityId;

    /**
     * 活动名
     */
    String activityName;

    /**
     * 额外参数
     */
    String exparam;

    public ScannerVO(Scanner scanner) {
        super();
        this.id = scanner.getId();
        this.userId = scanner.getUserId();
        this.activityId = scanner.getActivityId();
        this.activityName = scanner.getActivityName();
        this.exparam = scanner.getExparam();
    }

    public ScannerVO() {
        super();
    }
}
