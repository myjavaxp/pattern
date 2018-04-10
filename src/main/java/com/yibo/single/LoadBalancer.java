package com.yibo.single;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoadBalancer {
    private List<String> serverList;
    private LoadBalancer(){
        serverList=new ArrayList<>();
    }
    public static LoadBalancer getInstance(){
        return HolderClass.loadBalancer;
    }
    public void addServer(String server){
        serverList.add(server);
    }
    public void removeServer(String server){
        serverList.remove(server);
    }
    public String getServer(){
        Random random=new Random();
        int i=random.nextInt(serverList.size());
        return serverList.get(i);
    }
    private static class HolderClass{
        private static final LoadBalancer loadBalancer=new LoadBalancer();
    }
}
