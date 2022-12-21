package com.example.forumserve.dao;

import com.example.forumserve.mybatis.entity.user;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface userDao {
    public List<user> seleAll();//获取全部用户信息
    public user getUser(user da);//用用户名获取用户信息\模糊查询
    public List<user> getAllUserByPage(@Param("curPage")Integer curPage,
                                       @Param("pageSize")Integer pageSize,
                                       @Param("username")String username,
                                       @Param("sex")String sex,
                                       @Param("nickname")String nickname);//分页查询用户信息
    public Integer getAllCount();//获取信息总数
    public List<user> getAllAdminByPage(@Param("curPage")Integer curPage,@Param("pageSize")Integer pageSize);//分页查询管理员信息
    public Integer getAllAdminCount();
    public void delUserById(Integer userId);
    public user idGetUser(Integer id);
    public void addUser(user user);
    public void updateUser(user user);
    public user userByUserId(Integer userId);
}
