package com.example.forumserve.dao;


import com.example.forumserve.mybatis.entity.game;
import com.example.forumserve.mybatis.entity.recommendedUser;
import com.example.forumserve.mybatis.entity.showTitleEntity;
import com.example.forumserve.mybatis.entity.user;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface showDao {//前台展示类
    public List<showTitleEntity> TitleIdByTitle(@Param("userId")Integer userId, @Param("gameId")Integer gameId);//获取首页信息
    public List<recommendedUser> showRecommendedUsers(Integer userId);
    public List<game> showAllGame();
}
