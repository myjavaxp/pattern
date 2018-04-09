package com.yibo.factory;

public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger getLogger() {
        return new DatabaseLogger();
    }
}