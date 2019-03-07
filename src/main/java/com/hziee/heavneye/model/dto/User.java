package com.hziee.heavneye.model.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
    @Data
    @Entity
    public class User {

        //指定主键;
        @Id
        //指定主键的生成策略;MySQL默认为自增;
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;
        private String name;
        private String gender;
        private Integer age;
    }

