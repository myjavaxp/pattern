package com.yibo.factory.abstractFactory.impl;

import com.yibo.factory.abstractFactory.TextField;

public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示浅绿色文本框");
    }
}