package com.example.forumserve.service.impl;

import com.example.forumserve.dao.noticeDao;
import com.example.forumserve.service.Service.noticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class noticeImpl implements noticeService {
    @Autowired
    public noticeDao nd;

    @Override
    public Integer loadNotification(Integer userId) {
        return nd.loadNotification(userId);
    }
}
