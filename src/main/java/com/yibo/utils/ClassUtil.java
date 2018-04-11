package com.yibo.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ClassUtil {
    private static List<String> getClassNames(String filePath, List<String> classNames){
        File file=new File(filePath);
        File[] childFiles = file.listFiles();
        List<String> myClassName=new ArrayList<>();
        assert childFiles != null;
        for(File childFile:childFiles){
            if(childFile.isDirectory()){
                myClassName.addAll(getClassNames(childFile.getPath(),myClassName));
            }else{
                String childFilePath = childFile.getPath();
                childFilePath = childFilePath.substring(childFilePath.indexOf("/classes") + 9, childFilePath.lastIndexOf("."));
                childFilePath = childFilePath.replace("/", ".");
                myClassName.add(childFilePath);
            }
        }
        return myClassName;
    }
    public static List<String> getAllClassNames(String packageName){
        String filePath=packageName.replace(".","/");
        List<String> classNames=new ArrayList<>();
        if(filePath.contains("test-classes")){
            String compileFilePath=filePath.replace("test-classes","classes");
            classNames.addAll(getClassNames(compileFilePath, new ArrayList<>()));
        }else{
            classNames.addAll(getClassNames(filePath, new ArrayList<>()));
        }
        return classNames;
    }
}
