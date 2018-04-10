package com.yibo.abstractfactory.impl;

import com.yibo.abstractfactory.Button;

public class SummerButton implements Button {
    @Override
    public void display() {
        System.out.println("显示浅蓝色按钮");
    }
}
