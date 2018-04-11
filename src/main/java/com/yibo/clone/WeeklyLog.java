package com.yibo.clone;

import java.util.Date;

public class WeeklyLog implements Cloneable {
    private String name;
    private Date date;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public WeeklyLog clone() {
        Object object;
        try {
            object = super.clone();
            return (WeeklyLog) object;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "WeeklyLog{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", content='" + content + '\'' +
                '}';
    }
}