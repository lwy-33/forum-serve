package com.example.forumserve.mybatis.entity;

public class gametype {
    private Integer typeId;
    private String typeName;
    private String by1;

    @Override
    public String toString() {
        return "gametype{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                ", by1='" + by1 + '\'' +
                '}';
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getBy1() {
        return by1;
    }

    public void setBy1(String by1) {
        this.by1 = by1;
    }

    public gametype(Integer typeId, String typeName, String by1) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.by1 = by1;
    }

    public gametype() {
    }
}
