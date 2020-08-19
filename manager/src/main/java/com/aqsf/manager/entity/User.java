package com.aqsf.manager.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    private Integer id;
    private Integer deptId;
    private String username;
    private String password;
    private Integer sex;//男 ： 0 ；女 ：1 ；
    private String tel;//联系方式
    private String identify;//身份证号
    private String email;
    private String avatar;//头像
    private Integer status;//用户状态：停用:0 ;正常：1
    private Integer delFlag;//删除标志
    private Integer createBy;//创建人
    private Date createTime;
    private Date updateTime;
}
