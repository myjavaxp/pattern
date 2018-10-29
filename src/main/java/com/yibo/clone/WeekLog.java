package com.yibo.clone;

import java.io.*;
import java.util.Date;
import java.util.StringJoiner;

public class WeekLog implements Serializable {
    private static final long serialVersionUID = 1593086963993765593L;
    private Attachment attachment;
    private String name;
    private Date date;
    private String content;

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

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

    public WeekLog deepClone() throws IOException, ClassNotFoundException, OptionalDataException {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        //将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (WeekLog) ois.readObject();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", WeekLog.class.getSimpleName() + "[", "]")
                .add("attachment=" + attachment)
                .add("name='" + name + "'")
                .add("date=" + date)
                .add("content='" + content + "'")
                .toString();
    }
}