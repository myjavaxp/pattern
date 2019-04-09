package com.yibo.factory.abstractFactory.impl;

import com.yibo.factory.abstractFactory.ComboBox;

public class SummerComboBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("显示蓝色组合框");
    }
}
