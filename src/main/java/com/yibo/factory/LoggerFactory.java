package com.yibo.factory;

public abstract class LoggerFactory {
    public abstract Logger getLogger();
    public abstract Logger getLogger(String arg);
    public abstract Logger getLogger(Object obj);
    public void writeLog(){
        Logger logger=getLogger();
        logger.writeLog();
    }
}