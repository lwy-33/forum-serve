package com.example.forumserve.controller;

import com.example.forumserve.mybatis.entity.comment;
import com.example.forumserve.service.Service.commentService;
import com.example.forumserve.utils.returnMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/comment")
public class commentController {
    @Autowired
    private commentService cs;

    @GetMapping("GetCommentById")
    public Map<String,Object> GetCommentById(Integer userId,Integer becommentId,Integer becommentTypeId){
        return new returnMap().returnMap(200,cs.GetCommentById(userId,becommentId,becommentTypeId));
    }
    @PostMapping("addComment")
    public Map<String , Object> addComment(@RequestBody comment data){
        Calendar calendar= Calendar.getInstance();//获取当前时间
        data.setCommentTime(calendar.getTime());
        cs.addComment(data);//添加评论数据


        return new returnMap().returnMap(200);
    }


}
