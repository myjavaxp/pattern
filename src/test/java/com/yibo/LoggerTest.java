package com.yibo;

import com.yibo.factory.FileLoggerFactory;
import com.yibo.factory.Logger;
import com.yibo.factory.LoggerFactory;
import org.junit.Test;

public class LoggerTest {
    @Test
    public void testLogger(){
        LoggerFactory loggerFactory=new FileLoggerFactory();
        Logger logger=loggerFactory.getLogger();
        logger.writeLog();
    }
}