package com.yibo.utils;

import com.yibo.exception.NoSuchBeanException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XMLUtil {
    public static Object getBean(String beanName) throws Exception {
        Document document = getDocument();
        Element element = document.getElementById(beanName);
        if (null == element) {
            throw new NoSuchBeanException("没有名字为:" + beanName + "的类");
        }
        String name = element.getAttribute("class");
        Class<?> c = Class.forName(name);
        return c.newInstance();
    }

    public static <T> T getBean(String beanName, Class<T> clazz) throws Exception {
        Document document = getDocument();
        Element element = document.getElementById(beanName);
        if (null == element) {
            throw new NoSuchBeanException("没有名字为:" + beanName + "的类");
        }
        String name = element.getAttribute("class");
        Class<?> c = Class.forName(name);
        if (clazz == c) {
            return clazz.newInstance();
        }
        throw new NoSuchBeanException("没有类型为:" + clazz.getSimpleName() + "的类");
    }

    private static Document getDocument() throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        return documentBuilder.parse(new File("/Users/yibo/IdeaProjects/pattern/src/main/resources/config.xml"));
    }

    public static List<String> getBeanNameList() throws Exception {
        Document document = getDocument();
        NodeList nodeList = document.getElementsByTagName("bean");
        List<String> beanNameList = new ArrayList<>();
        int length = nodeList.getLength();
        for (int i = 0; i < length; i++) {
            String bean = nodeList.item(i).getAttributes().getNamedItem("id").getTextContent();
            beanNameList.add(bean);
        }
        return beanNameList;
    }
}