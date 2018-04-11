package com.yibo.single;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class BeanRegistry {
    private ConcurrentHashMap<Class,String> beans;
    private Set<String> beanNames=new HashSet<>();
    private Set<String> syncBeanNames=Collections.synchronizedSet(beanNames);
    private BeanRegistry(){
        beans=new ConcurrentHashMap<>();
    }
    private static class HolderClass{
        private static final BeanRegistry BEAN_REGISTRY=new BeanRegistry();
    }

    public ConcurrentHashMap<Class, String> getBeans() {
        return beans;
    }
    public void addBean(Class clazz,String beanName){
        if(syncBeanNames.add(beanName)){
            beans.put(clazz,beanName);
        }
    }
    public static BeanRegistry getInstance(){
        return HolderClass.BEAN_REGISTRY;
    }
}