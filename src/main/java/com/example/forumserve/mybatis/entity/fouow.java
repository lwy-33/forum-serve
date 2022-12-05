package com.example.forumserve.mybatis.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

public class fouow {
    private Integer fouowId;
    private Integer beuser;
    private Integer userId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Integer fouwTime;
    private String by1;
    private String by2;
    private String by3;

    @Override
    public String toString() {
        return "fouow{" +
                "fouowId=" + fouowId +
                ", beuser=" + beuser +
                ", userId=" + userId +
                ", fouwTime=" + fouwTime +
                ", by1='" + by1 + '\'' +
                ", by2='" + by2 + '\'' +
                ", by3='" + by3 + '\'' +
                '}';
    }

    public Integer getFouowId() {

        return fouowId;
    }

    public void setFouowId(Integer fouowId) {
        this.fouowId = fouowId;
    }

    public Integer getBeuser() {
        return beuser;
    }

    public void setBeuser(Integer beuser) {
        this.beuser = beuser;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getFouwTime() {
        return fouwTime;
    }

    public void setFouwTime(Integer fouwTime) {
        this.fouwTime = fouwTime;
    }

    public String getBy1() {
        return by1;
    }

    public void setBy1(String by1) {
        this.by1 = by1;
    }

    public String getBy2() {
        return by2;
    }

    public void setBy2(String by2) {
        this.by2 = by2;
    }

    public String getBy3() {
        return by3;
    }

    public void setBy3(String by3) {
        this.by3 = by3;
    }

    public fouow() {
    }

    public fouow(Integer fouowId, Integer beuser, Integer userId, Integer fouwTime, String by1, String by2, String by3) {
        this.fouowId = fouowId;
        this.beuser = beuser;
        this.userId = userId;
        this.fouwTime = fouwTime;
        this.by1 = by1;
        this.by2 = by2;
        this.by3 = by3;
    }
}
