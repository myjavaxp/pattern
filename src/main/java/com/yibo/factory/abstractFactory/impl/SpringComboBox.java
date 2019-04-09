package com.yibo.factory.abstractFactory.impl;

import com.yibo.factory.abstractFactory.ComboBox;

public class SpringComboBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("显示绿色组合框");
    }
}
