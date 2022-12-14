package com.example.forumserve.service.impl;

import com.example.forumserve.dao.userDao;
import com.example.forumserve.mybatis.entity.user;
import com.example.forumserve.service.Service.userService;
import com.example.forumserve.utils.md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.List;
@Service
public class userImpl implements userService {

    @Autowired
    public userDao userAut;

    @Override
    public List<user> seleAll() {
        return userAut.seleAll();
    }

    @Override
    public user PasswordVerification(user da) throws NoSuchAlgorithmException {
        da.setBy2("1");
        md5Util md5=new md5Util();
        //通过MD5修改密码
        da.setPassword(md5.md5Util(da.getUsername(),da.getPassword()));
//        System.out.println(da.toString());
        user data=userAut.getUser(da);//DAO读取sql数据返回
        return data;
    }

    @Override
    public List<user> getAllUserByPage(Integer curPage, Integer pageSize,String username,String sex,String nickname) {
        return userAut.getAllUserByPage(curPage,pageSize,username,sex,nickname);
    }

    @Override
    public Integer getAllCount() {return userAut.getAllCount();}

    @Override
    public List<user> getAllAdminByPage(Integer curPage, Integer pageSize) {
        return userAut.getAllAdminByPage(curPage,pageSize);
    }

    @Override
    public Integer getAllAdminCount() {return userAut.getAllAdminCount();}

    @Override
    public void delUserById(Integer userId) {userAut.delUserById(userId);}

    @Override
    public void addUser(user user) throws NoSuchAlgorithmException {
        md5Util md5=new md5Util();
        user.setPassword(md5.md5Util(user.getUsername(),user.getPassword()));
        userAut.addUser(user);
    }

    @Override
    public void updateUser(user user) throws NoSuchAlgorithmException {
        md5Util md5=new md5Util();
        user.setPassword(md5.md5Util(user.getUsername(),user.getPassword()));
        userAut.updateUser(user);
    }

    @Override
    public user userByUserId(Integer userId) {
        return userAut.userByUserId(userId);
    }

    @Override
    public user findById(Integer userId) {
        return userAut.findById(userId);
    }

    @Override
    public void register(user user) throws NoSuchAlgorithmException {
        md5Util md5=new md5Util();
        user.setPassword(md5.md5Util(user.getUsername(),user.getPassword()));
        userAut.register(user);
    }

    @Override
    public user findByUserName(String username) {
        return userAut.findByUserName(username);
    }

    @Override
    public void modifyPassword(user user) throws NoSuchAlgorithmException {
        md5Util md5=new md5Util();
        user.setPassword(md5.md5Util(user.getUsername(),user.getPassword()));
        userAut.modifyPassword(user);
    }


}
