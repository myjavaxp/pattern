package com.yibo.bean;

public interface PersonFactory<P extends Person> {
    P create(String name,String number);
}
