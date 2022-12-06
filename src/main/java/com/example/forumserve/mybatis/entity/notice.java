package com.example.forumserve.mybatis.entity;

import java.util.Date;

public class notice {
    private Integer noticeId;
    private Integer userId;
    private Integer beuserId;
    private String noticeContent;
    private Date noticeTime;
    private String by1;
    private String by2;
    private String  by3;

    @Override
    public String toString() {
        return "notice{" +
                "noticeId=" + noticeId +
                ", userId=" + userId +
                ", beuserId=" + beuserId +
                ", noticeContent='" + noticeContent + '\'' +
                ", noticeTime=" + noticeTime +
                ", by1='" + by1 + '\'' +
                ", by2='" + by2 + '\'' +
                ", by3='" + by3 + '\'' +
                '}';
    }

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBeuserId() {
        return beuserId;
    }

    public void setBeuserId(Integer beuserId) {
        this.beuserId = beuserId;
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    public Date getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(Date noticeTime) {
        this.noticeTime = noticeTime;
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

    public notice(Integer noticeId, Integer userId, Integer beuserId, String noticeContent, Date noticeTime, String by1, String by2, String by3) {
        this.noticeId = noticeId;
        this.userId = userId;
        this.beuserId = beuserId;
        this.noticeContent = noticeContent;
        this.noticeTime = noticeTime;
        this.by1 = by1;
        this.by2 = by2;
        this.by3 = by3;
    }

    public notice() {
    }
}
