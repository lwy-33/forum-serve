package com.example.forumserve.mybatis.entity;

public class game {
    private Integer gameId;
    private String gameName;
    private Integer gameTyoeId;
    private Integer gameIcon;
    private String by1;
    private String by2;
    private String by3;

    @Override
    public String toString() {
        return "game{" +
                "gameId=" + gameId +
                ", gameName='" + gameName + '\'' +
                ", gameTyoeId=" + gameTyoeId +
                ", gameIcon=" + gameIcon +
                ", by1='" + by1 + '\'' +
                ", by2='" + by2 + '\'' +
                ", by3='" + by3 + '\'' +
                '}';
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public Integer getGameTyoeId() {
        return gameTyoeId;
    }

    public void setGameTyoeId(Integer gameTyoeId) {
        this.gameTyoeId = gameTyoeId;
    }

    public Integer getGameIcon() {
        return gameIcon;
    }

    public void setGameIcon(Integer gameIcon) {
        this.gameIcon = gameIcon;
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

    public game(Integer gameId, String gameName, Integer gameTyoeId, Integer gameIcon, String by1, String by2, String by3) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.gameTyoeId = gameTyoeId;
        this.gameIcon = gameIcon;
        this.by1 = by1;
        this.by2 = by2;
        this.by3 = by3;
    }

    public game() {
    }
}
