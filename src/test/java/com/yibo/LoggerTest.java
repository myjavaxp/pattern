package com.yibo;

import com.yibo.factory.FileLoggerFactory;
import com.yibo.factory.Logger;
import com.yibo.factory.LoggerFactory;
import com.yibo.utils.XMLUtil;
import org.junit.Test;

public class LoggerTest {
    @Test
    public void testLogger() {
        LoggerFactory loggerFactory = new FileLoggerFactory();
        Logger logger = loggerFactory.getLogger();
        logger.writeLog();
    }

    @Test
    public void testXML() {
        LoggerFactory loggerFactory = null;
        try {
            loggerFactory = (LoggerFactory) XMLUtil.getBean("fileLoggerFactory");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (loggerFactory != null) {
            Logger logger = loggerFactory.getLogger();
            logger.writeLog();
        }
    }

    @Test
    public void testFactory() {
        LoggerFactory loggerFactory = (LoggerFactory) XMLUtil.getBean("databaseLoggerFactory");
        if (loggerFactory != null) {
            loggerFactory.writeLog();
        }
    }
}