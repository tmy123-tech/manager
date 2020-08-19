package com.aqsf.manager.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Dept implements Serializable {
    private Integer id;
    private Integer parent_id;//父部门id
    private String name;
    private Integer type;
    private Integer status;
    private Integer sort;//排序
    private Integer charge_id;//创建人
    private Date create;
}
