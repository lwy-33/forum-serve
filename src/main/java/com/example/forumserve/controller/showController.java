package com.example.forumserve.controller;

import com.example.forumserve.service.Service.showService;
import com.example.forumserve.utils.returnMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/show")
public class showController {
    @Autowired
    public showService ss;

    @GetMapping("showTitles")
    public Map<String ,Object> showTitles(Integer userId,Integer gameId){
        System.out.println(userId+"  " +gameId);
        return new returnMap().returnMap(200,ss.TitleIdByTitle(userId,gameId));
    }
    @GetMapping("/showRecommendedUsers")
    public Map<String,Object> showRecommendedUsers(Integer userId){
        return new returnMap().returnMap(200,ss.showRecommendedUsers(userId));
    }
    @GetMapping("/showAllGame")
    public Map<String,Object> showAllGame(){
        return new returnMap().returnMap(200,ss.showAllGame());
    }

}
