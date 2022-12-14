package com.example.forumserve.service.Service;

import com.example.forumserve.mybatis.entity.game;
import com.example.forumserve.mybatis.entity.gametype;

import java.util.List;

public interface gametypeService {
    public List<gametype> findAllGameType();
    public void delGameTypeById(Integer gameTypeId);
    public void addGameType(gametype gametype);
    public void updateGameType(gametype gametype);
    public List<gametype> findByVague(String typeName);
}
