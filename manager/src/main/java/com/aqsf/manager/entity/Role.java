package com.aqsf.manager.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Role implements Serializable {
    private Integer id;
    private Integer parentId;//父节点id
    private String name;
    private Integer type;//角色类型
    private String remarks;//备注信息
    private Integer createBy;//创建人
    private Date createTime;
    private Date updateTime;

}
