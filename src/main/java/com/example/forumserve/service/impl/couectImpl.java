package com.example.forumserve.service.impl;

import com.example.forumserve.dao.couectDao;
import com.example.forumserve.mybatis.entity.couect;
import com.example.forumserve.service.Service.couectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class couectImpl implements couectService {
    @Autowired
    private couectDao cd;

    @Override
    public Integer favoriteEvents(couect couect) {
        if(cd.stateOfJudgment(couect)!=null){
//            收藏过
            System.out.println("收藏过滤");
            cd.delCouect(couect);
            return 204;
        }else{
            System.out.println("要加收藏");
            cd.addCouect(couect);
            return 206;
        }

    }
}
