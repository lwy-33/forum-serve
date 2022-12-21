package com.example.forumserve.controller;

import com.example.forumserve.service.Service.noticeService;
import com.example.forumserve.utils.returnMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/notice")
public class noticeController {
    @Autowired
    public noticeService ns;

    @GetMapping("/loadNotification")
    public Map<String,Object> loadNotification(Integer userId){
        return new returnMap().returnMap(200,ns.loadNotification(userId));
    }


}
