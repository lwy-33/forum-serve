package com.example.forumserve.controller;

import com.example.forumserve.utils.returnMap;
import com.example.forumserve.mybatis.entity.thumbs;
import com.example.forumserve.service.Service.thumbsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/thumbs")
public class thumbsController {
    @Autowired
    private thumbsService thumbsservice;

    @PostMapping("/addThumbs")
    public Map<String,Object> addThumbs(@RequestBody thumbs da) {
//        判断是否点过
//        查询是否有点赞记录
        System.out.println(thumbsservice.judgeThumbs(da));
        if(thumbsservice.judgeThumbs(da).size()==0){//
            System.out.println("没被点赞");
            //要实现一次点赞为添加，计数器++，通知
            thumbsservice.addThumbs(da);

        }else{//
            System.out.println("已经被赞了");
            //取消他的点赞，并计数器--，通知
            thumbsservice.delThumbs(da);
        }
        return new returnMap().returnMap(200,null);

    }

}
