package com.example.forumserve.mybatis.entity;

/*
参照前台：
user:{username:"455",userImage:"非常666",newMessage:4,personal:"简介"},
  UnreadCount:3,
  //whetherToPayAttention是否关注；whetherToCollect是否收藏；likeOrNot是否点赞
  titleList:[{titleId:1,titleName:"vdsgfgfdr的封建时代发的时间方便vbdf",gameName:"王者荣耀",by3:8,releaseTime:"2022-11-22 00:00:00",user:{nickname:"ygmz",userImage:'1'},commentCount:4,
      thumbsCount:98,whetherToPayAttention:false,whetherToCollect:true,likeOrNot:false},
    {titleId:2,titleName:"der",gameName:"和平暖暖",releaseTime:"2022-1-22 00:00:00",by3:8,user:{nickname:"广泛的",userImage:'4'},commentCount:89,
      thumbsCount:8,whetherToPayAttention:true,whetherToCollect:false,likeOrNot: true}],
  recommendedUsers:[{userId:5,nickname:"xli",personal:"功夫老爸",whetherToPayAttention:false}],
//  whetherToPayAttention是否关注

 */
public class showTitleEntity {
    private title title;
    private user user;
    private Integer whetherToPayAttention;
    private Integer whetherToCollect;
    private Integer likeOrNot;

    @Override
    public String toString() {
        return "showTitleEntity{" +
                "title=" + title +
                ", user=" + user +
                ", whetherToPayAttention=" + whetherToPayAttention +
                ", whetherToCollect=" + whetherToCollect +
                ", likeOrNot=" + likeOrNot +
                '}';
    }

    public com.example.forumserve.mybatis.entity.title getTitle() {
        return title;
    }

    public void setTitle(com.example.forumserve.mybatis.entity.title title) {
        this.title = title;
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

    public Integer getWhetherToCollect() {
        return whetherToCollect;
    }

    public void setWhetherToCollect(Integer whetherToCollect) {
        this.whetherToCollect = whetherToCollect;
    }

    public Integer getLikeOrNot() {
        return likeOrNot;
    }

    public void setLikeOrNot(Integer likeOrNot) {
        this.likeOrNot = likeOrNot;
    }

    public showTitleEntity(com.example.forumserve.mybatis.entity.title title, com.example.forumserve.mybatis.entity.user user, Integer whetherToPayAttention, Integer whetherToCollect, Integer likeOrNot) {
        this.title = title;
        this.user = user;
        this.whetherToPayAttention = whetherToPayAttention;
        this.whetherToCollect = whetherToCollect;
        this.likeOrNot = likeOrNot;
    }

    public showTitleEntity() {
    }
}
