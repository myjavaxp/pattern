package com.yibo.abstractfactory.impl;

import com.yibo.abstractfactory.TextField;

public class SummerTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示浅蓝色文本框");
    }
}
