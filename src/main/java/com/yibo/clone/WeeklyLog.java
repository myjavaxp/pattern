package com.yibo.clone;

import java.util.Date;
import java.util.StringJoiner;

public class WeeklyLog implements Cloneable {
    private String name;
    private Date date;
    private String content;
    private Attachment attachment;

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

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
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
        return new StringJoiner(", ", WeeklyLog.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("date=" + date)
                .add("content='" + content + "'")
                .add("attachment=" + attachment)
                .toString();
    }
}