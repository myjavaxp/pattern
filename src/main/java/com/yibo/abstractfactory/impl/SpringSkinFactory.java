package com.yibo.abstractfactory.impl;

import com.yibo.abstractfactory.Button;
import com.yibo.abstractfactory.ComboBox;
import com.yibo.abstractfactory.SkinFactory;
import com.yibo.abstractfactory.TextField;

public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button getButton() {
        return new SpringButton();
    }

    @Override
    public ComboBox getComboBox() {
        return new SpringComboBox();
    }

    @Override
    public TextField getTextField() {
        return new SpringTextField();
    }
}
