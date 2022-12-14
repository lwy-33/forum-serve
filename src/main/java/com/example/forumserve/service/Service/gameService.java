package com.example.forumserve.service.Service;

import com.example.forumserve.mybatis.entity.game;
import com.example.forumserve.mybatis.entity.gametype;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface gameService {
    public List<game> findAllGame();
    public List<game> findByVague(String gameName,Integer gameTypeId);
    public void delGameById(Integer gameId);
    public void addGame(game game);
    public void updateGame(game game);
    public void delGameByIds(List<Integer> gameIds);
}
