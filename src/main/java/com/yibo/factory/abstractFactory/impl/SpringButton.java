package com.yibo.factory.abstractFactory.impl;

import com.yibo.factory.abstractFactory.Button;

public class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("显示浅绿色按钮");
    }
}
