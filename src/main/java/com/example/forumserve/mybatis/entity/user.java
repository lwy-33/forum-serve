package com.example.forumserve.mybatis.entity;
/*
用户表
备用属性介绍
by2:
1.判断模糊查询（0）和用户登录(1)
by3:
模糊查询中：bebrowseCount（下区间）和by3（上区间）区间查询
 */
public class user {
    private Integer userId;
    private String password;
    private String nickname;
    private String sex;
    private String email;
    private Integer roleId;
    private String userImage;
    private Integer bebrowseCount;
    private String personal;
    private String username;
    private String by2;
    private Integer by3;
    private String by4;

    @Override
    public String toString() {
        return "user{" +
                "userId=" + userId +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", roleId=" + roleId +
                ", userImage='" + userImage + '\'' +
                ", bebrowseCount=" + bebrowseCount +
                ", personal='" + personal + '\'' +
                ", username='" + username + '\'' +
                ", by2='" + by2 + '\'' +
                ", by3='" + by3 + '\'' +
                ", by4='" + by4 + '\'' +
                '}';
    }

    public user() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public Integer getBebrowseCount() {
        return bebrowseCount;
    }

    public void setBebrowseCount(Integer bebrowseCount) {
        this.bebrowseCount = bebrowseCount;
    }

    public String getPersonal() {
        return personal;
    }

    public void setPersonal(String personal) {
        this.personal = personal;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBy2() {
        return by2;
    }

    public void setBy2(String by2) {
        this.by2 = by2;
    }

    public Integer getBy3() {
        return by3;
    }

    public void setBy3(Integer by3) {
        this.by3 = by3;
    }

    public String getBy4() {
        return by4;
    }

    public void setBy4(String by4) {
        this.by4 = by4;
    }

    public user(Integer userId, String password, String nickname, String sex, String email, Integer roleId, String userImage, Integer bebrowseCount, String personal, String username, String by2, Integer by3, String by4) {
        this.userId = userId;
        this.password = password;
        this.nickname = nickname;
        this.sex = sex;
        this.email = email;
        this.roleId = roleId;
        this.userImage = userImage;
        this.bebrowseCount = bebrowseCount;
        this.personal = personal;
        this.username = username;
        this.by2 = by2;
        this.by3 = by3;
        this.by4 = by4;
    }
}
