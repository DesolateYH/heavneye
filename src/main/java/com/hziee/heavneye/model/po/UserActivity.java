package com.hziee.heavneye.model.po;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author MessiahJK
 * @date 2018/9/20
 * @time 10:04
 */
@Data
@Entity
@Table(name = "sc.user.activity")
public class UserActivity {
    /**
     * id
     * 自增主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
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
    int activityId;
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
    double duration;
    /**
     * 额外参数
     */
    String exparam;

    /**
     * 创建时间
     */
    @CreationTimestamp
    Timestamp created;

    /**
     * 修改时间
     */
    @UpdateTimestamp
    Timestamp modified;
}
