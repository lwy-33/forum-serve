package com.example.forumserve.service.impl;

import com.example.forumserve.dao.roleDao;
import com.example.forumserve.mybatis.entity.role;
import com.example.forumserve.service.Service.roleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class roleImpl implements roleService {
    @Autowired
    private roleDao roleAut;
    @Override
    public List<role> findAll() {return roleAut.findAll();}
    public List<role> _findAll() {return roleAut._findAll();}
}
