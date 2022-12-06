package com.example.forumserve.dao;

import com.example.forumserve.mybatis.entity.comment;

public interface commentDao {
    public void incrementalThumbs(Integer commentId);//赞计数器加一
    public  void DecrementThumbs(Integer commentId);//赞计数器减1
    public comment idGetComment(Integer commentId);//按照id找全部评论信息
}
