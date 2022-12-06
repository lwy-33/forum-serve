package com.example.forumserve.mybatis.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class thumbs {
    private Integer thumbsId;
    private Integer userId;
    private Integer bethumbsId;
    private Integer bethumbsTypeId;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss",timezone = "GMT+8")
    private Date thumbsTime;
    private String by1;
    private String by2;
    private String by3;

    @Override
    public String toString() {
        return "thumbs{" +
                "thumbsId=" + thumbsId +
                ", userId=" + userId +
                ", bethumbsId=" + bethumbsId +
                ", bethumbsTypeId=" + bethumbsTypeId +
                ", thumbsTime=" + thumbsTime +
                ", by1='" + by1 + '\'' +
                ", by2='" + by2 + '\'' +
                ", by3='" + by3 + '\'' +
                '}';
    }

    public Integer getThumbsId() {
        return thumbsId;
    }

    public void setThumbsId(Integer thumbsId) {
        this.thumbsId = thumbsId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getbethumbsId() {
        return bethumbsId;
    }

    public void setbethumbsId(Integer bethumbsId) {
        this.bethumbsId = bethumbsId;
    }

    public Integer getBethumbsTypeId() {
        return bethumbsTypeId;
    }

    public void setBethumbsTypeId(Integer bethumbsTypeId) {
        this.bethumbsTypeId = bethumbsTypeId;
    }

    public Date getThumbsTime() {
        return thumbsTime;
    }

    public void setThumbsTime(Date thumbsTime) {
        this.thumbsTime = thumbsTime;
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

    public thumbs(Integer thumbsId, Integer userId, Integer bethumbsId, Integer bethumbsTypeId, Date thumbsTime, String by1, String by2, String by3) {
        this.thumbsId = thumbsId;
        this.userId = userId;
        this.bethumbsId = bethumbsId;
        this.bethumbsTypeId = bethumbsTypeId;
        this.thumbsTime = thumbsTime;
        this.by1 = by1;
        this.by2 = by2;
        this.by3 = by3;
    }

    public thumbs() {
    }
}
