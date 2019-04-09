package com.yibo.factory.abstractFactory;

public interface SkinFactory {
    Button getButton();
    ComboBox getComboBox();
    TextField getTextField();
}
