package com.aqsf.manager.service.impl;

import com.aqsf.manager.dao.DeptMapper;
import com.aqsf.manager.entity.Dept;
import com.aqsf.manager.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("deptService")
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> selectAllDept() {
        return deptMapper.selectAllDept();
    }

    @Override
    public void addDept(Dept dept) {
        deptMapper.addDept(dept);
    }

    @Override
    public Dept selectDeptById(Integer id) {
      return deptMapper.selectDeptById(id);
    }

    @Override
    public void updateDept(Dept dept) {
        dept.setCreate(new Date());
       deptMapper.updateDept(dept);
    }
}
