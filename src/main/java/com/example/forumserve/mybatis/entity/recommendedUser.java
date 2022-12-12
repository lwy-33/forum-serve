package com.example.forumserve.mybatis.entity;

public class recommendedUser {
    private user user;
    private Integer whetherToPayAttention;

    @Override
    public String toString() {
        return "recommendedUser{" +
                "user=" + user +
                ", whetherToPayAttention=" + whetherToPayAttention +
                '}';
    }

    public com.example.forumserve.mybatis.entity.user getUser() {
        return user;
    }

    public void setUser(com.example.forumserve.mybatis.entity.user user) {
        this.user = user;
    }

    public Integer getWhetherToPayAttention() {
        return whetherToPayAttention;
    }

    public void setWhetherToPayAttention(Integer whetherToPayAttention) {
        this.whetherToPayAttention = whetherToPayAttention;
    }

    public recommendedUser(com.example.forumserve.mybatis.entity.user user, Integer whetherToPayAttention) {
        this.user = user;
        this.whetherToPayAttention = whetherToPayAttention;
    }

    public recommendedUser() {
    }
}
