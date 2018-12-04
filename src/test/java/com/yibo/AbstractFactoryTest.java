package com.yibo;

import com.yibo.abstractfactory.Button;
import com.yibo.abstractfactory.ComboBox;
import com.yibo.abstractfactory.SkinFactory;
import com.yibo.abstractfactory.TextField;
import com.yibo.abstractfactory.impl.SummerSkinFactory;
import com.yibo.utils.XMLUtil;
import org.junit.Test;

public class AbstractFactoryTest {
    @Test
    public void testAbstractFactory() {
        SkinFactory skinFactory = (SummerSkinFactory) XMLUtil.getBean("summerSkinFactory");
        Button button = skinFactory.getButton();
        ComboBox comboBox = skinFactory.getComboBox();
        TextField textField = skinFactory.getTextField();
        button.display();
        comboBox.display();
        textField.display();
    }

    @Test
    public void testXMLUtil() {
        XMLUtil.getBeanNameList().forEach(System.out::println);
    }
}