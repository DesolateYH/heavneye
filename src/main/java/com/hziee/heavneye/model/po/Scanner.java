package com.hziee.heavneye.model.po;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * 扫码员
 *
 * @author MessiahJK
 * @date 2018/9/18
 * @time 16:33
 */
@Data
@Entity
@Table(name = "sc.scanner")
public class Scanner {
    /**
     * id
     * 自增主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

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
