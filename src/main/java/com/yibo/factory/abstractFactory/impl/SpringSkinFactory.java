package com.yibo.factory.abstractFactory.impl;

import com.yibo.factory.abstractFactory.Button;
import com.yibo.factory.abstractFactory.ComboBox;
import com.yibo.factory.abstractFactory.SkinFactory;
import com.yibo.factory.abstractFactory.TextField;

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
