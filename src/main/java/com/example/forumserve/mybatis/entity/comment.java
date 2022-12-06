package com.example.forumserve.mybatis.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class comment {
    private Integer commentId;
    private Integer userId;
    private Integer becommentTypeId;
    private Integer becommentId;
    private String commentContent;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss",timezone = "GMT+8")
    private Date commentTime;
    private Integer thumbsCount;
    private String by2;
    private String by3;

    @Override
    public String toString() {
        return "comment{" +
                "commentId=" + commentId +
                ", userId=" + userId +
                ", becommentTypeId=" + becommentTypeId +
                ", becommentId=" + becommentId +
                ", commentContent='" + commentContent + '\'' +
                ", commentTime=" + commentTime +
                ", thumbsCount=" + thumbsCount +
                ", by2='" + by2 + '\'' +
                ", by3='" + by3 + '\'' +
                '}';
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBecommentTypeId() {
        return becommentTypeId;
    }

    public void setBecommentTypeId(Integer becommentTypeId) {
        this.becommentTypeId = becommentTypeId;
    }

    public Integer getBecommentId() {
        return becommentId;
    }

    public void setBecommentId(Integer becommentId) {
        this.becommentId = becommentId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public Integer getThumbsCount() {
        return thumbsCount;
    }

    public void setThumbsCount(Integer thumbsCount) {
        this.thumbsCount = thumbsCount;
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

    public comment() {
    }

    public comment(Integer commentId, Integer userId, Integer becommentTypeId, Integer becommentId, String commentContent, Date commentTime, Integer thumbsCount, String by2, String by3) {
        this.commentId = commentId;
        this.userId = userId;
        this.becommentTypeId = becommentTypeId;
        this.becommentId = becommentId;
        this.commentContent = commentContent;
        this.commentTime = commentTime;
        this.thumbsCount = thumbsCount;
        this.by2 = by2;
        this.by3 = by3;
    }
}
