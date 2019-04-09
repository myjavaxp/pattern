package com.yibo.buiderPattern;

import java.io.Serializable;
import java.util.StringJoiner;

public class Actor implements Serializable {
    private static final long serialVersionUID = -3242317772715093964L;
    private String type;
    private String sex;
    private String face;
    private String costume;
    private String hairstyle;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getCostume() {
        return costume;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }

    public String getHairstyle() {
        return hairstyle;
    }

    public void setHairstyle(String hairstyle) {
        this.hairstyle = hairstyle;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Actor.class.getSimpleName() + "[", "]")
                .add("type='" + type + "'")
                .add("sex='" + sex + "'")
                .add("face='" + face + "'")
                .add("costume='" + costume + "'")
                .add("hairstyle='" + hairstyle + "'")
                .toString();
    }
}