package com.example.forumserve.dao;

import com.example.forumserve.mybatis.entity.thumbs;

import java.util.List;

public interface thumbsDao {
    public void addThumbs(thumbs da);//添加点赞信息
    public List<thumbs> judgeThumbs(thumbs da);//判断是否对该帖子或评论点赞
    public void delThumbs(thumbs da);//取消点赞
}

