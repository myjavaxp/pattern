package com.yibo.clone;

public class FAR implements OfficialDocument {
    @Override
    public OfficialDocument clone() {
        OfficialDocument officialDocument = null;
        try {
            officialDocument = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return officialDocument;
    }

    @Override
    public void display() {
        System.out.println("《可行性分析报告》");
    }
}