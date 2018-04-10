package com.yibo.factory;

public class FileLoggerFactory extends LoggerFactory {
    @Override
    public Logger getLogger() {
        return new FileLogger();
    }

    @Override
    public Logger getLogger(String arg) {
        System.out.println(arg+":Logger");
        return new FileLogger();
    }

    @Override
    public Logger getLogger(Object obj) {
        return null;
    }
}