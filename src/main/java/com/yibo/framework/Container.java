package com.yibo.framework;

import java.util.List;

public interface Container {
    List<Class> getIndexedClass(String packageName);
    void initBean(String className);
}