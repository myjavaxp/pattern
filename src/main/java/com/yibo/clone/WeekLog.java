package com.yibo.clone;

import com.google.common.base.MoreObjects;

import java.io.*;
import java.util.Date;

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

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("attachment", attachment)
                .add("name", name)
                .add("date", date)
                .add("content", content)
                .toString();
    }
    public WeekLog deepClone() throws IOException, ClassNotFoundException, OptionalDataException {
        ByteArrayOutputStream bao=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bao);
        oos.writeObject(this);

        //将对象从流中取出
        ByteArrayInputStream bis=new  ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois=new  ObjectInputStream(bis);
        return (WeekLog) ois.readObject();
    }
}