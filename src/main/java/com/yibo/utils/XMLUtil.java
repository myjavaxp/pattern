package com.yibo.utils;

import com.yibo.exception.NoSuchBeanException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    public static Object getBean(String className) throws Exception {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(new File("/Users/yibo/IdeaProjects/pattern/src/main/resources/config.xml"));
        Element element = document.getElementById(className);
        if (null == element) {
            throw new NoSuchBeanException("没有名字为:" + className + "的类");
        }
        String name = element.getAttribute("class");
        Class<?> c = Class.forName(name);
        return c.newInstance();
    }
}