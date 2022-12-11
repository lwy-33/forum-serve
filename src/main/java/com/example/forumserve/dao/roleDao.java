package com.example.forumserve.dao;

import com.example.forumserve.mybatis.entity.role;

import java.util.List;

public interface roleDao {
    public role findById(Integer roleId);
    public List<role> findAll();
    public List<role> _findAll();
}
