package com.hziee.heavneye.model.po;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Description: TODO
 *
 * @author MessiahJK
 * @version V1.0
 * @date 2018/11/7 18:35
 */
@Data
@Entity
@Table(name = "sc.record")
public class Record {
    /**
     * id
     * 自增主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    /**
     * 学号
     */
    String stuId;

    /**
     * 姓名
     */
    String stuName;

    /**
     * 组织
     */
    String groupName;

    /**
     * 职位
     */
    String position;

    /**
     * 任期
     */
    String term;

    /**
     * 状态
     * active/passed
     */
    String status;

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
