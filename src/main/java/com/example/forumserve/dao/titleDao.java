package com.example.forumserve.dao;

import com.example.forumserve.mybatis.entity.thumbs;
import com.example.forumserve.mybatis.entity.title;

public interface titleDao {
    public void incrementalThumbs(Integer titleId);//点赞递增，当用户点赞帖子时触发
    public title idGetTitle(Integer titleId); //根据titleID找到用户，用途：1、通知时查找用户
    public void DecrementThumbs(Integer titleId);
}
