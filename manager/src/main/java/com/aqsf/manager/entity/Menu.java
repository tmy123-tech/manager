package com.aqsf.manager.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Menu implements Serializable {
    private Integer id;
    private Integer parentId;
    private String name;
    private String url;
    private String permission;//权限
    private Integer type;
    private String icon;//菜单图标
    private Integer sort;//排序
    private Integer status;
}
