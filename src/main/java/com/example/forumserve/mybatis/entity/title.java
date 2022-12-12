package com.example.forumserve.mybatis.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.xml.crypto.Data;
import java.util.Date;

public class title {
    private Integer titleId;
    private String titleName;
    private String titleContent;
    private Integer userId;
    private Integer gameId;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss",timezone = "GMT+8")
    private Date releaseTime;
    private Integer commentCount;
    private Integer thumbsCount;
    private Integer by3;

    @Override
    public String toString() {
        return "title{" +
                "titleId=" + titleId +
                ", titleName='" + titleName + '\'' +
                ", titleContent='" + titleContent + '\'' +
                ", userId=" + userId +
                ", gameId=" + gameId +
                ", releaseTime=" + releaseTime +
                ", commentCount='" + commentCount + '\'' +
                ", thumbsCount=" + thumbsCount +
                ", by3=" + by3 +
                '}';
    }

    public Integer getTitleId() {
        return titleId;
    }

    public void setTitleId(Integer titleId) {
        this.titleId = titleId;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getTitleContent() {
        return titleContent;
    }

    public void setTitleContent(String titleContent) {
        this.titleContent = titleContent;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getThumbsCount() {
        return thumbsCount;
    }

    public void setThumbsCount(Integer thumbsCount) {
        this.thumbsCount = thumbsCount;
    }

    public Integer getBy3() {
        return by3;
    }

    public void setBy3(Integer by3) {
        this.by3 = by3;
    }

    public title() {
    }

    public title(Integer titleId, String titleName, String titleContent, Integer userId, Integer gameId, Date releaseTime, Integer commentCount, Integer thumbsCount, Integer by3) {
        this.titleId = titleId;
        this.titleName = titleName;
        this.titleContent = titleContent;
        this.userId = userId;
        this.gameId = gameId;
        this.releaseTime = releaseTime;
        this.commentCount = commentCount;
        this.thumbsCount = thumbsCount;
        this.by3 = by3;
    }
}
