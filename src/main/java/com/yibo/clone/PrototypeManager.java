package com.yibo.clone;

import java.util.Hashtable;

public class PrototypeManager {
    private Hashtable<String,OfficialDocument> hashtable=new Hashtable<>();
    private static PrototypeManager prototypeManager=new PrototypeManager();
    private PrototypeManager(){
        hashtable.put("far",new FAR());
        hashtable.put("srs",new SRS());
    }
    public void addOfficialDocument(String key,OfficialDocument officialDocument){
        hashtable.put(key,officialDocument);
    }
    public OfficialDocument getOfficialDocument(String key){
        return hashtable.get(key).clone();
    }
    public static PrototypeManager getPrototypeManager(){
        return prototypeManager;
    }
}