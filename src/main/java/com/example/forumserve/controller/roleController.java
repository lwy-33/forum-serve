package com.example.forumserve.controller;

import com.example.forumserve.mybatis.entity.role;
import com.example.forumserve.service.Service.roleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/role")
public class roleController {
    @Autowired
    private roleService roleAut;
    @GetMapping("/findAll")
    public Map<String,Object> findAll(){
        Map<String,Object> map=new HashMap<>();
        List<role> roleList=roleAut.findAll();
        map.put("code","200");
        map.put("msg","查询成功");
        map.put("dataobject",roleList);
        return map;
    }
    @GetMapping("/_findAll")
    public Map<String,Object> _findAll(){
        Map<String,Object> map=new HashMap<>();
        List<role> roleList=roleAut._findAll();
        map.put("code","200");
        map.put("msg","查询成功");
        map.put("dataobject",roleList);
        return map;
    }
}
