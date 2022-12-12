package com.example.forumserve.service.Service;

import com.example.forumserve.mybatis.entity.game;
import com.example.forumserve.mybatis.entity.recommendedUser;
import com.example.forumserve.mybatis.entity.showTitleEntity;
import com.example.forumserve.mybatis.entity.user;

import java.util.List;

public interface showService {
    public List<showTitleEntity> TitleIdByTitle(Integer userId,Integer gameId);
    public List<recommendedUser> showRecommendedUsers(Integer userId);
    public List<game> showAllGame();
}
