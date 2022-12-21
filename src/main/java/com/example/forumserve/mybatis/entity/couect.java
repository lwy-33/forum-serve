package com.example.forumserve.mybatis.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class couect {
    private Integer couectId;
    private Integer userId;
    private Integer titleId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date couectTime;
    private String by1;
    private String by2;
    private String by3;

    @Override
    public String toString() {
        return "couect{" +
                "couectId=" + couectId +
                ", userId=" + userId +
                ", titleId=" + titleId +
                ", couectTime=" + couectTime +
                ", by1='" + by1 + '\'' +
                ", by2='" + by2 + '\'' +
                ", by3='" + by3 + '\'' +
                '}';
    }

    public Integer getCouectId() {
        return couectId;
    }

    public void setCouectId(Integer couectId) {
        this.couectId = couectId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTitleId() {
        return titleId;
    }

    public void setTitleId(Integer titleId) {
        this.titleId = titleId;
    }

    public Date getCouectTime() {
        return couectTime;
    }

    public void setCouectTime(Date couectTime) {
        this.couectTime = couectTime;
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

    public couect() {
    }

    public couect(Integer couectId, Integer userId, Integer titleId, Date couectTime, String by1, String by2, String by3) {
        this.couectId = couectId;
        this.userId = userId;
        this.titleId = titleId;
        this.couectTime = couectTime;
        this.by1 = by1;
        this.by2 = by2;
        this.by3 = by3;
    }
}
