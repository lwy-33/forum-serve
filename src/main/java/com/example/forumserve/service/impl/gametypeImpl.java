package com.example.forumserve.service.impl;

import com.example.forumserve.dao.gametypeDao;
import com.example.forumserve.mybatis.entity.gametype;
import com.example.forumserve.service.Service.gameService;
import com.example.forumserve.service.Service.gametypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class gametypeImpl implements gametypeService {
    @Autowired
    private gametypeDao gametypeAut;

    @Override
    public List<gametype> findAllGameType() {return gametypeAut.findAllGameType();}

    @Override
    public void delGameTypeById(Integer gameTypeId) {gametypeAut.delGameTypeById(gameTypeId);}

    @Override
    public void addGameType(gametype gametype) {gametypeAut.addGameType(gametype);}

    @Override
    public void updateGameType(gametype gametype) {gametypeAut.updateGameType(gametype);}

    @Override
    public List<gametype> findByVague(String typeName) {return gametypeAut.findByVague(typeName);}
}
