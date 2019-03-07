package com.hziee.heavneye.model.dto;

import com.hziee.heavneye.model.po.Scanner;
import lombok.Data;

/**
 * Description: TODO
 *
 * @author MessiahJK
 * @version V1.0
 * @date 2018/10/25 21:20
 */
@Data
public class ScannerInDto {

    /**
     * code码
     */
    String code;
    /**
     * 用户名
     */
    String userId;

    /**
     * 活动id
     */
    int activityId;

    /**
     * 活动名
     */
    String activityName;

    /**
     * 额外参数
     */
    String exparam;

    public Scanner toScanner() {
        Scanner scanner = new Scanner();
        scanner.setUserId(this.userId);
        scanner.setActivityId(this.activityId);
        scanner.setActivityName(this.activityName);
        scanner.setExparam(this.exparam);
        return scanner;
    }
}
