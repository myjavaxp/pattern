package com.yibo.clone;

import com.google.common.base.MoreObjects;

import java.io.Serializable;

public class Attachment implements Serializable {
    private static final long serialVersionUID = -1734954440284466589L;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download() {
        System.out.println("下载附件，文件名为:" + name);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .toString();
    }
}