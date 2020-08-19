package com.aqsf.manager.service;

import com.aqsf.manager.entity.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> selectAllDept();

    void addDept(Dept dept);

    Dept selectDeptById(Integer id);

    void updateDept(Dept dept);
}
