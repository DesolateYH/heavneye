package com.hziee.heavneye.model.po;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * 用户
 *
 * @author MessiahJK
 * @date 2018/9/18
 * @time 15:51
 */

@Data
@Entity
@Table(name = "sc.user")
public class User {
    /**
     * id
     * 自增主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    /**
     * openId
     */
    String openId;

    /**
     * 学号
     */
    String stuId;

    /**
     * 姓名
     */
    String name;

    /**
     * 班级
     */
    String classes;

    /**
     * 角色
     * 0管理员
     * 1学生
     * 2扫码员
     * 3活动创办者
     */
    String role;

    /**
     * 加密盐
     */
    String salt;

    /**
     * 密码
     */
    String pwd;

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
