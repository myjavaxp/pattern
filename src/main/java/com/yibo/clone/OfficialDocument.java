package com.yibo.clone;

public interface OfficialDocument extends Cloneable {
    OfficialDocument clone();
    void display();
}