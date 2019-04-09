package com.yibo.factory.abstractFactory.impl;

import com.yibo.factory.abstractFactory.Button;
import com.yibo.factory.abstractFactory.ComboBox;
import com.yibo.factory.abstractFactory.SkinFactory;
import com.yibo.factory.abstractFactory.TextField;

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
