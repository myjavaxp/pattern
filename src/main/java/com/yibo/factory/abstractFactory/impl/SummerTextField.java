package com.yibo.factory.abstractFactory.impl;

import com.yibo.factory.abstractFactory.TextField;

public class SummerTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示浅蓝色文本框");
    }
}
