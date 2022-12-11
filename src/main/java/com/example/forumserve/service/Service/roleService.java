package com.example.forumserve.service.Service;

import com.example.forumserve.mybatis.entity.role;

import java.util.List;

public interface roleService {
    public List<role> findAll();
    public List<role> _findAll();
}
