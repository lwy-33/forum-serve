package com.example.forumserve.dao;

import com.example.forumserve.mybatis.entity.notice;

public interface noticeDao {
    public void addNotice(notice da);
    public  Integer loadNotification(Integer userId);


}
