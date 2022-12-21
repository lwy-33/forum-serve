package com.example.forumserve.dao;

import com.example.forumserve.mybatis.entity.couect;

public interface couectDao {
    public void addCouect(couect couect);
    public couect stateOfJudgment(couect couect);
    public void delCouect(couect couect);
}
