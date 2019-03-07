package com.hziee.heavneye.model.dto;

import com.hziee.heavneye.model.po.Scanner;
import lombok.Data;

/**
 * Description:
 *
 * @author MessiahJK
 * @version V1.0
 * @date 2018/11/12 15:22
 */
@Data
public class ScannerInDtoArrays {
    /**
     * code码
     */
    private String code;

    /**
     * 用户名
     */
    private String[] userId;

    /**
     * 活动id
     */
    private int[] activityId;

    /**
     * 活动名
     */
    private String activityName;

    /**
     * 额外参数
     */
    private String exparam;

    public Scanner[] toScannerArrays() {
        Scanner[] scanners = new Scanner[userId.length];
        for (int i = 0; i < userId.length; i++) {
            Scanner scanner = new Scanner();
            scanner.setUserId(this.userId[i]);
            scanner.setActivityId(this.activityId[i]);
            scanner.setActivityName(this.activityName);
            scanner.setExparam(this.exparam);
            scanners[i] = scanner;
        }
        return scanners;
    }
}
