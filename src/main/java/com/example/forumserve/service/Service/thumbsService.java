package com.example.forumserve.service.Service;

import com.example.forumserve.mybatis.entity.thumbs;

import java.util.List;

public interface thumbsService {
    public void addThumbs(thumbs da);
    public List<thumbs> judgeThumbs(thumbs da);
    public void delThumbs(thumbs da);//取消点赞
}
