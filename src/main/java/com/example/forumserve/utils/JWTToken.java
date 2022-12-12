package com.example.forumserve.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.example.forumserve.mybatis.entity.user;

import java.util.Calendar;

public class JWTToken {
    private String order="This_a_order";//密令
    public String createToken(user da){//生成令牌
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND,120);//，密令时间为120s
        JWTCreator.Builder builder =  JWT.create().withExpiresAt(calendar.getTime());
        builder.withClaim("username", da.getUsername());
        builder.withClaim("password", da.getPassword());
        builder.withClaim("roleId", da.getRoleId());
        String token = builder.sign(Algorithm.HMAC256(order));
        return token;

    }
}
