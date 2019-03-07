package com.hziee.heavneye.model.po;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * 活动
 *
 * @author MessiahJK
 * @date 2018/9/18
 * @time 18:33
 */
@Data
@Entity
@Table(name = "sc.activity")
public class Activity {
    /**
     * id
     * 自增主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

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
     * 活动状态（默认值为Pending）
     * Pending
     * Running
     * Passed
     * Pause
     */
    String status = "Pending";

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
