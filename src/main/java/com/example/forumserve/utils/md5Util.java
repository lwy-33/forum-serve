package com.example.forumserve.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/*
时间：22.11.28
简介：该工具类是用MD5对密码进行加盐加密的操作
加密简介：第一次MD5加密后的数据据在第6个数据加用户名，然后二次加密

例如：
传入：
usernamezhangsan
pass:123
第一次加密：42767516990368493138776584305024125808
加盐后：427675zhangsan16990368493138776584305024125808
二次加密后(传出):189559904686457635282879602292132023881
189559904686457635282879602292132023881


传入：@账号；@输入的明文
传出：@加盐加密后的密文

 */
public class md5Util {

    public static String md5Util(String username,String pass) throws NoSuchAlgorithmException {
        System.out.println("传入：\nusername"+username+"\npass:"+pass);
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(pass.getBytes());//1次加密
        byte[] bs1 = md5.digest();
        String str1 = new BigInteger(1, bs1).toString();
        System.out.println("第一次加密：" + str1);
        StringBuffer str2 = new StringBuffer(str1);
        String str3 = new String(str2.insert(6, username));
        System.out.println("加盐后：" + str3);
        md5.update(str3.getBytes());//2次加密
        byte[] bs2 = md5.digest();
        String str4 = new BigInteger(1, bs2).toString();
        System.out.println("二次加密后(传出):" + str4);
        return str4;


    }
}
