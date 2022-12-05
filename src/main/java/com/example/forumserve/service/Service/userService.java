package com.example.forumserve.service.Service;

import com.example.forumserve.dao.userDao;
import com.example.forumserve.mybatis.entity.user;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.List;
@Service
public interface userService {
    public List<user> seleAll();
    public user PasswordVerification(user da) throws NoSuchAlgorithmException;
    public List<user> getAllUserByPage(Integer curPage, Integer pageSize);
}
