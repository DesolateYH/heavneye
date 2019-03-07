package com.hziee.heavneye.model.po;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * 字典表
 *
 * @author MessiahJK
 * @date 2018/9/18
 * @time 0:59
 */
@Data
@Entity
@Table(name = "sc.dicinfo")
public class DicInfo {
    /**
     * id
     * 自增主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    /**
     * 字典名称
     */
    String dicname;

    /**
     * 条目代码
     */
    String code;

    /**
     * 条目值
     */
    String value;

    /**
     * 有效性
     */
    String invalid;

    /**
     * 参数
     */
    String param;

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
