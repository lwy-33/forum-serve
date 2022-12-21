package com.example.forumserve.service.impl;

import com.example.forumserve.dao.commentDao;
import com.example.forumserve.dao.couectDao;
import com.example.forumserve.dao.noticeDao;
import com.example.forumserve.dao.userDao;
import com.example.forumserve.mybatis.entity.comment;
import com.example.forumserve.mybatis.entity.couect;
import com.example.forumserve.mybatis.entity.notice;
import com.example.forumserve.service.Service.commentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class commentImpl implements commentService {
    @Autowired
    private commentDao cd;

    @Autowired
    private noticeDao nd;

    @Autowired
    private userDao ud;

    @Override
    public List<comment> GetCommentById(Integer userId,Integer becommentId,Integer becommentTypeId) {
        return cd.GetCommentById(userId,becommentId,becommentTypeId);
    }

    @Override
    public void addComment(comment data) {
        cd.addComment(data);//数据库加数据

        //发通知
        //1获取接收人Id

        Integer beUserId=cd.acquireReceivingUser(data.getBecommentId());
        String beUserNickName=ud.idGetUser(beUserId).getNickname();
        notice n=new notice(0,data.getUserId(),beUserId,beUserNickName+"给你回复了："+data.getCommentContent(),data.getCommentTime(),null,null,null);
        nd.addNotice(n);
    }
}
