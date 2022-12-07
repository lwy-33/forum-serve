package com.example.forumserve.controller;

import com.example.forumserve.utils.returnMap;
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

    @GetMapping("/getAllUserByPage")
    public Map<String,Object> getAllUserByPage(@RequestParam(value = "curPage")Integer curPage,
                                               @RequestParam(value = "pageSize")Integer pageSize,
                                               @RequestParam(value = "username")String username,
                                               @RequestParam(value = "sex")String sex,
                                               @RequestParam(value = "nickname")String nickname){
        Map<String,Object> map=new HashMap<>();
        List<user> userList=userAut.getAllUserByPage((curPage-1)*pageSize, pageSize,username,sex,nickname);
        if(userList!=null && userList.size()>0){
            map.put("code",200);
            map.put("msg","获取数据成功");
            map.put("dataobject",userList);
        }else{
            map.put("code",400);
            map.put("msg","获取数据成功");
        }
        return  map;
    }

    @GetMapping("/getAllCount")
    public Map<String,Object> getAllCount(){
        return new returnMap().returnMap(userAut.getAllCount());
    }

    @GetMapping("/getAllAdminByPage")
    public Map<String,Object> getAllAdminByPage(@RequestParam(value = "curPage")Integer curPage,
                                               @RequestParam(value = "pageSize")Integer pageSize){
        Map<String,Object> map=new HashMap<>();
        List<user> userList=userAut.getAllAdminByPage((curPage-1)*pageSize, pageSize);
        if(userList!=null && userList.size()>0){
            map.put("code",200);
            map.put("msg","获取数据成功");
            map.put("dataobject",userList);
        }else{
            map.put("code",400);
            map.put("msg","获取数据成功");
        }
        return  map;
    }

    @GetMapping("/getAllAdminCount")
    public Map<String,Object> getAllAdminCount(){
        return new returnMap().returnMap(userAut.getAllAdminCount());
    }

    @GetMapping("/delUserById")
    public Map<String,Object> delUserById(Integer userId){
        Map<String,Object> map=new HashMap<>();
        userAut.delUserById(userId);
        map.put("code",200);
        map.put("msg","删除成功");
        return map;
    }
}
