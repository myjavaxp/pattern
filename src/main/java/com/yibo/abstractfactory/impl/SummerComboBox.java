package com.yibo.abstractfactory.impl;

import com.yibo.abstractfactory.ComboBox;

public class SummerComboBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("显示蓝色组合框");
    }
}
