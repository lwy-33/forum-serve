package com.example.forumserve.controller;

import com.example.forumserve.mybatis.entity.gametype;
import com.example.forumserve.mybatis.entity.user;
import com.example.forumserve.service.Service.gametypeService;
import com.example.forumserve.utils.returnMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/gametype")
public class gametypeController {
    @Autowired
    private gametypeService gametypeAut;
    @GetMapping("/findAllGameType")
    public Map<String,Object> findAllGameType(){
        return new returnMap().returnMap(200,gametypeAut.findAllGameType());
    }

    @GetMapping("/delGameTypeById")
    public Map<String,Object> delGameTypeById(Integer gameTypeId){
        Map<String,Object> map=new HashMap<>();
        gametypeAut.delGameTypeById(gameTypeId);
        map.put("code",200);
        map.put("msg","删除成功");
        return map;
    }
    @PostMapping("/editGameType")
    public Map<String,Object> editUser(@RequestBody gametype gametype) {
        Map<String,Object> map=new HashMap<>();
        if(gametype.getTypeId()!=null){
            gametypeAut.updateGameType(gametype);
            map.put("code",200);
            map.put("msg","修改游戏类别成功");
        }else {
            gametypeAut.addGameType(gametype);
            map.put("code",200);
            map.put("msg","添加游戏类别成功");
        }
        return map;
    }

    @GetMapping("/findByVague")
    public Map<String,Object> findByVague(String typeName){return new returnMap().returnMap(200,gametypeAut.findByVague(typeName));}
}
