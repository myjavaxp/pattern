package com.yibo.abstractfactory.impl;

import com.yibo.abstractfactory.ComboBox;

public class SpringComboBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("显示绿色组合框");
    }
}
