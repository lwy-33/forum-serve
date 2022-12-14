package com.example.forumserve.dao;

import com.example.forumserve.mybatis.entity.game;
import com.example.forumserve.mybatis.entity.gametype;
import com.example.forumserve.mybatis.entity.user;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface gameDao {
    public List<game> findAllGame();
    public List<game> findByVague(@Param("gameName") String gameName,@Param("gameTypeId")Integer gameTypeId);
    public void delGameById(Integer gameId);
    public void addGame(game game);
    public void updateGame(game game);
    public void delGameByIds(List<Integer> gameIds);
}
