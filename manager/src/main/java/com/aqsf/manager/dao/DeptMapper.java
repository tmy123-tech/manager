package com.aqsf.manager.dao;

import com.aqsf.manager.entity.Dept;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
@Component("deptMapper")
public interface DeptMapper {
    //查询所有
    List<Dept> selectAllDept();

    //添加部门
    void addDept(Dept dept);

    //id查询
    Dept selectDeptById(Integer id);

    //修改部门信息
    void updateDept(Dept dept);
}
