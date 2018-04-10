package com.yibo.utils;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    public static Object getBean(String className) {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setNamespaceAware(true);
        documentBuilderFactory.setValidating(true);
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(new File("/Users/yibo/IdeaProjects/pattern/src/main/resources/config.xml"));
            String name = document.getElementById(className).getFirstChild().getNodeValue();
            Class<?> c = Class.forName(name);
            return c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}