package com.yibo.bean;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = -6719085041419135017L;
    private String name;
    private String number;

    public Person() {
        name="默认名字";
        number="0";
    }

    public Person(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}