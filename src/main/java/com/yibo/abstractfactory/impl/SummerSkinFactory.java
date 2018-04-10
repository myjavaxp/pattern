package com.yibo.abstractfactory.impl;

import com.yibo.abstractfactory.Button;
import com.yibo.abstractfactory.ComboBox;
import com.yibo.abstractfactory.SkinFactory;
import com.yibo.abstractfactory.TextField;

public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button getButton() {
        return new SummerButton();
    }

    @Override
    public ComboBox getComboBox() {
        return new SummerComboBox();
    }

    @Override
    public TextField getTextField() {
        return new SummerTextField();
    }
}
