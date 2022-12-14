package com.example.forumserve.service.impl;

import com.example.forumserve.dao.gameDao;
import com.example.forumserve.mybatis.entity.game;
import com.example.forumserve.mybatis.entity.gametype;
import com.example.forumserve.service.Service.gameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class gameImpl implements gameService {
    @Autowired
    private gameDao gameAut;
    @Override
    public List<game> findAllGame() {return gameAut.findAllGame();}

    @Override
    public List<game> findByVague(String gameName, Integer gameTypeId) {
        return gameAut.findByVague(gameName,gameTypeId);
    }

    @Override
    public void delGameById(Integer gameId) {
        gameAut.delGameById(gameId);
    }

    @Override
    public void addGame(game game) {
        gameAut.addGame(game);
    }

    @Override
    public void updateGame(game game) {
        gameAut.updateGame(game);
    }

    @Override
    public void delGameByIds(List<Integer> gameIds) {
        gameAut.delGameByIds(gameIds);
    }
}
