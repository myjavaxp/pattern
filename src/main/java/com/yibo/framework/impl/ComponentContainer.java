package com.yibo.framework.impl;

import com.yibo.annotation.Component;
import com.yibo.annotation.Configuration;
import com.yibo.annotation.Service;
import com.yibo.framework.Container;
import com.yibo.single.BeanRegistry;
import com.yibo.utils.ClassUtil;

import java.util.List;

public class ComponentContainer implements Container {
    private BeanRegistry beanRegistry = BeanRegistry.getInstance();

    @Override
    public List<Class> getIndexedClass(String packageName) {
        String filePath = ClassLoader.getSystemResource("").getPath() + packageName.replace(".", "/");
        List<String> classNames = ClassUtil.getAllClassNames(filePath);
        for (String className : classNames) {
            try {
                ClassLoader classLoader = ComponentContainer.class.getClassLoader();
                Class<?> loadClass = classLoader.loadClass(className);
                if (loadClass.isAnnotationPresent(Service.class)) {

                }

                if (loadClass.isAnnotationPresent(Component.class)) {

                }
                if (loadClass.isAnnotationPresent(Configuration.class)) {
                    //这里是需要加载到容器的类
                    System.out.println(loadClass.getName());
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    @Override
    public void initBean(String className) {

    }
}