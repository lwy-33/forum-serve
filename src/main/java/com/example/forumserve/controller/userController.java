package com.example.forumserve.controller;

import cn.hutool.core.io.FileUtil;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.example.forumserve.utils.JWTUtil;
import com.example.forumserve.utils.returnMap;
import com.example.forumserve.mybatis.entity.user;
import com.example.forumserve.service.Service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
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
        return new returnMap().returnMap(200,userAut.seleAll());
    }
    @PostMapping("PasswordVerification")
    public Map<String,Object> PasswordVerification(@RequestBody user da) throws NoSuchAlgorithmException {
        System.out.println(da);
        Map<String,Object> map=new HashMap<>();
        user u=userAut.PasswordVerification(da);
        if(u!=null){
            Map<String,String> payload=new HashMap<>();
            payload.put("id",u.getUserId().toString());
            payload.put("username",u.getUsername());
            String token= JWTUtil.createToken(payload);
            map.put("code",200);
            map.put("msg","登陆成功");
            map.put("token",token);
            map.put("dataobject",u);
        }else{
            map.put("code",400);
            map.put("msg","用户名户密码错误");
            map.put("token",null);
            map.put("userId",null);
            map.put("username",null);
        }
        return map;
        //return new returnMap().returnMap(200,userAut.PasswordVerification(da));
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
        return new returnMap().returnMap(200,userAut.getAllCount());
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
        return new returnMap().returnMap(200,userAut.getAllAdminCount());
    }

    @GetMapping("/delUserById")
    public Map<String,Object> delUserById(Integer userId){
        Map<String,Object> map=new HashMap<>();
        userAut.delUserById(userId);
        map.put("code",200);
        map.put("msg","删除成功");
        return map;
    }

    @GetMapping("/file/{fileUUID}")
    public void download(@PathVariable String fileUUID, HttpServletResponse response) throws IOException, IOException {
        //根据文件的位翼标识码获取文件
        File uploadFile = new File("D:\\userImage\\userImage\\" + fileUUID);
        ServletOutputStream os = response.getOutputStream();
        response.addHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileUUID, "UTF-8"));
        response.setContentType("application/octet-stream");

        //读取文件的字节流
        os.write(FileUtil.readBytes(uploadFile));
        os.flush();
        os.close();
    }

    @PostMapping("/editUser")
    public Map<String,Object> editUser(@RequestBody user user) throws NoSuchAlgorithmException {
        Map<String,Object> map=new HashMap<>();
        if(user.getUserId()!=null){
            userAut.updateUser(user);
            map.put("code",200);
            map.put("msg","修改用户信息成功");
        }else {
            userAut.addUser(user);
            map.put("code",200);
            map.put("msg","添加用户信息成功");
        }
        return map;
    }

    @GetMapping("/getUserInfo")
    public Map<String,Object> getUserInfo(HttpServletRequest request){
        Map<String,Object> map=new HashMap<>();
        String token=request.getHeader("token");
        DecodedJWT decodedJWT= JWTUtil.verifyToken(token);
        String strId=decodedJWT.getClaim("id").asString();
        int id=Integer.parseInt( strId);
        user userInfo=userAut.findById(id);
        map.put("code",200);
        map.put("msg","查找用户信息成功");
        map.put("dataobject",userInfo);
        System.out.println("token:"+token);
        return map;
    }

    @PostMapping("/register")
    public Map<String,Object> register(@RequestBody user user) throws NoSuchAlgorithmException {
        Map<String,Object> map=new HashMap<>();
        if(userAut.findByUserName(user.getUsername())==null){
            userAut.register(user);
            map.put("code",200);
            map.put("msg","注册成功");
        }else {
            map.put("code",200);
            map.put("msg","该用户已存在");
        }
        return map;
    }

    @PostMapping("/modifyPassword")
    public Map<String,Object> modifyPassword(@RequestBody user user) throws NoSuchAlgorithmException {
        Map<String,Object> map=new HashMap<>();
        userAut.modifyPassword(user);
        map.put("code",200);
        map.put("msg","修改密码成功");
        map.put("dataobject",null);
        return map;
    }

    @GetMapping("userByUserId")
    public Map<String,Object> userByUserId(Integer userId){
//        根据用户id获取用户信息
        return new returnMap().returnMap(200,userAut.userByUserId(userId));
    }

}
