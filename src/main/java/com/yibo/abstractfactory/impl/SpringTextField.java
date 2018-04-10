package com.yibo.abstractfactory.impl;

import com.yibo.abstractfactory.TextField;

public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示浅绿色文本框");
    }
}
