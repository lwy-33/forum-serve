package com.example.forumserve.controller;

import com.example.forumserve.mybatis.entity.couect;
import com.example.forumserve.service.Service.couectService;
import com.example.forumserve.utils.returnMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/couect")
public class couectController {
    @Autowired
    private couectService cs;

    @PostMapping("favoriteEvents")
    public Map<String ,Object> addCouect(@RequestBody couect couect){
        Calendar calendar= Calendar.getInstance();
        couect.setCouectTime(calendar.getTime());
        return new returnMap().returnMap(cs.favoriteEvents(couect));
    }



}
