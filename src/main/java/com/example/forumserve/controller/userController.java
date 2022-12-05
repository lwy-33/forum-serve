package com.example.forumserve.controller;

import com.example.forumserve.mybatis.entity.returnMap;
import com.example.forumserve.mybatis.entity.user;
import com.example.forumserve.service.Service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    public userService userAut;

    @GetMapping("seleAll")
    public HashMap<String, Object> seleAll(){//获取全部用户数据
        return new returnMap().returnMap(userAut.seleAll());
    }
    @PostMapping("PasswordVerification")
    public HashMap<String,Object> PasswordVerification(@RequestBody user da) throws NoSuchAlgorithmException {
        return returnMap.returnMap(userAut.PasswordVerification(da));
    }
}
