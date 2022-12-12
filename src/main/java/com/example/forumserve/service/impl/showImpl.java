package com.example.forumserve.service.impl;

import com.example.forumserve.dao.showDao;
import com.example.forumserve.mybatis.entity.game;
import com.example.forumserve.mybatis.entity.recommendedUser;
import com.example.forumserve.mybatis.entity.showTitleEntity;
import com.example.forumserve.mybatis.entity.user;
import com.example.forumserve.service.Service.showService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class showImpl implements showService {

    @Autowired
    public showDao sd;

    @Override
    public List<showTitleEntity> TitleIdByTitle(Integer userId,Integer gameId) {
        List<showTitleEntity> da=sd.TitleIdByTitle(userId,gameId);
        return da;
    }

    @Override
    public List<recommendedUser> showRecommendedUsers(Integer userId) {
        return sd.showRecommendedUsers(userId);
    }

    @Override
    public List<game> showAllGame() {
        return sd.showAllGame();
    }
}
