package com.yibo.factory;

public class DatabaseLoggerFactory extends LoggerFactory {
    @Override
    public Logger getLogger() {
        return new DatabaseLogger();
    }

    @Override
    public Logger getLogger(String arg) {
        return null;
    }

    @Override
    public Logger getLogger(Object obj) {
        return null;
    }
}