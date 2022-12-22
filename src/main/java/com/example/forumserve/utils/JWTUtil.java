package com.example.forumserve.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.example.forumserve.mybatis.entity.user;

import java.util.Calendar;
import java.util.Map;
import java.util.Set;

public class JWTUtil {
    private static String SING="This_a_order";//密令
//    public String createToken(user da){//生成令牌
//        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.SECOND,120);//，密令时间为120s
//        JWTCreator.Builder builder =  JWT.create().withExpiresAt(calendar.getTime());
//        builder.withClaim("username", da.getUsername());
//        builder.withClaim("password", da.getPassword());
//        builder.withClaim("roleId", da.getRoleId());
//        String token = builder.sign(Algorithm.HMAC256(order));
//        return token;
//
//    }
    public static String createToken(Map<String,String> payload){
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.SECOND,12000);//密令时间为120s
        //创建jwt builder
        JWTCreator.Builder builder= JWT.create().withExpiresAt(calendar.getTime());//指定令牌过期时间
        Set<String> keys=payload.keySet();
        for(String key:keys){
            String value=payload.get(key);
            builder.withClaim(key,value);
        }
        String token=builder.sign(Algorithm.HMAC256(SING));
        return token;
    }

    public static DecodedJWT verifyToken(String token){
        //验证token的合法性
        JWTVerifier jwtVerifier=JWT.require(Algorithm.HMAC256(SING)).build();
        DecodedJWT decodedJWT=jwtVerifier.verify(token);
        return decodedJWT;
    }
}
