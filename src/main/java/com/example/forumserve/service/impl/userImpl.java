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
        System.out.println(da.toString());
        user data=userAut.getUser(da).get(0);//DAO读取sql数据返回
        if(data.getPassword().equals(da.getPassword())){
            //密码正确
            data.setPassword("0");
        }else{
            data.setPassword("1");
        }
        return data;
    }

    @Override
    public List<user> getAllUserByPage(Integer curPage, Integer pageSize) {
        return userAut.getAllUserByPage(curPage,pageSize);
    }

    @Override
    public Integer getAllCount() {return userAut.getAllCount();}

}
