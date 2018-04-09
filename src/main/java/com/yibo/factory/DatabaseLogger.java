package com.yibo.factory;

public class DatabaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("数据库操作日志");
    }
}