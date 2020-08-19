package com.aqsf.manager.controller;

import com.aqsf.manager.entity.Dept;
import com.aqsf.manager.service.DeptService;
import com.aqsf.manager.utils.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DeptController {
    @Autowired
    private DeptService deptService;
    //查询所有部门

    @RequestMapping("dept/deptAll")
    @ResponseBody
    public JsonObject selectAllDept(){
        List<Dept> list = deptService.selectAllDept();
        //返回值对象信息
        JsonObject object = new JsonObject();
        object.setCode(0);
        object.setMsg("ok");
        object.setCount((long) list.size());
        object.setData(list);
        return object;
    }

    //页面渲染
    @RequestMapping("/dept")
    public String deptIndex(){
        return "page/dept";
    }

    @RequestMapping("addDept")
    public String addDept(@PathVariable("type") Integer type,@PathVariable("parent_id") Integer parent_id, Model model){
        model.addAttribute("type",type);
        model.addAttribute("parent_id",parent_id);
        return "page/addDept";
    }
}
