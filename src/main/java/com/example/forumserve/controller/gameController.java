package com.example.forumserve.controller;

import com.example.forumserve.mybatis.entity.game;
import com.example.forumserve.service.Service.gameService;
import com.example.forumserve.utils.returnMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/game")
public class gameController {
    @Autowired
    private gameService gameAut;
    @GetMapping("/findAllGame")
    public Map<String,Object> findAllGame(){
        Map<String,Object> map=new HashMap<>();
        List<game> gameList=gameAut.findAllGame();
        System.out.println(gameList);
        if(gameList!=null && gameList.size()>0){
            map.put("code",200);
            map.put("msg","获取数据成功");
            map.put("dataobject",gameList);
        }else{
            map.put("code",400);
            map.put("msg","获取数据成功");
        }
        return  map;
    }

    @GetMapping("/findByVague")
    public Map<String,Object> findByVague(String gameName,Integer gameTypeId){
        return new returnMap().returnMap(200,gameAut.findByVague(gameName,gameTypeId));
    }

    @GetMapping("/delGameById")
    public Map<String,Object> delGameById(Integer gameId){
        Map<String,Object> map=new HashMap<>();
        gameAut.delGameById(gameId);
        map.put("code",200);
        map.put("msg","删除成功");
        return map;
    }
    @PostMapping("/editGame")
    public Map<String,Object> editGame(@RequestBody game game) {
        Map<String,Object> map=new HashMap<>();
        if(game.getGameId()!=null){
            gameAut.updateGame(game);
            map.put("code",200);
            map.put("msg","修改游戏成功");
        }else {
            gameAut.addGame(game);
            map.put("code",200);
            map.put("msg","添加游戏成功");
        }
        return map;
    }

    @PostMapping("/delGameByIds")
    public Map<String,Object> delGameByIds(@RequestBody List<Integer> gameIds){
        Map<String,Object> map=new HashMap<>();
        gameAut.delGameByIds(gameIds);
        map.put("code",200);
        map.put("msg","批量删除成功");
        return map;
    }
}
