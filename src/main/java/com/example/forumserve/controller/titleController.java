package com.example.forumserve.controller;

import com.example.forumserve.mybatis.entity.game;
import com.example.forumserve.mybatis.entity.title;
import com.example.forumserve.mybatis.entity.user;
import com.example.forumserve.service.Service.titleService;
import com.example.forumserve.utils.returnMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/title")
public class titleController {
    @Autowired
    private titleService titleAut;
    @GetMapping("/findAllTitleByPage")
    public Map<String,Object> findAllTitleByPage(@RequestParam(value = "curPage")Integer curPage,
                                               @RequestParam(value = "pageSize")Integer pageSize,
                                               @RequestParam(value = "titleName")String titleName,
                                               @RequestParam(value = "userId")Integer userId,
                                               @RequestParam(value = "gameId")Integer gameId){
        Map<String,Object> map=new HashMap<>();
        List<title> titleList=titleAut.findAllTitleByPage((curPage-1)*pageSize, pageSize,titleName,userId,gameId);
        if(titleList!=null && titleList.size()>0){
            map.put("code",200);
            map.put("msg","获取数据成功");
            map.put("dataobject",titleList);
        }else{
            map.put("code",400);
            map.put("msg","获取数据成功");
        }
        return  map;
    }

    @GetMapping("/getAllTitleCount")
    public Map<String,Object> getAllTitleCount(){
        return new returnMap().returnMap(200,titleAut.getAllTitleCount());
    }

    @GetMapping("/delTitleById")
    public Map<String,Object> delTitleById(Integer titleId){
        Map<String,Object> map=new HashMap<>();
        titleAut.delTitleById(titleId);
        map.put("code",200);
        map.put("msg","删除成功");
        return map;
    }
    @PostMapping("/editTitle")
    public Map<String,Object> editTitle(@RequestBody title title) {
        Map<String,Object> map=new HashMap<>();
        if(title.getTitleId()!=null){
            titleAut.updateTitle(title);
            map.put("code",200);
            map.put("msg","修改游戏成功");
        }else {
            titleAut.addTitle(title);
            map.put("code",200);
            map.put("msg","添加游戏成功");
        }
        return map;
    }

    @PostMapping("/delTitleByIds")
    public Map<String,Object> delTitleByIds(@RequestBody List<Integer> titleIds){
        Map<String,Object> map=new HashMap<>();
        titleAut.delTitleByIds(titleIds);
        map.put("code",200);
        map.put("msg","批量删除成功");
        return map;
    }
}
