package com.example.forumserve.mybatis.entity;

public class role {
    private Integer roleId;
    private Integer roleName;
    private Integer by1;

    @Override
    public String toString() {
        return "role{" +
                "roleId=" + roleId +
                ", roleName=" + roleName +
                ", by1=" + by1 +
                '}';
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getRoleName() {
        return roleName;
    }

    public void setRoleName(Integer roleName) {
        this.roleName = roleName;
    }

    public Integer getBy1() {
        return by1;
    }

    public void setBy1(Integer by1) {
        this.by1 = by1;
    }

    public role(Integer roleId, Integer roleName, Integer by1) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.by1 = by1;
    }

    public role() {
    }
}
