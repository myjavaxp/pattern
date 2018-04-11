package com.yibo;

import com.yibo.clone.WeeklyLog;
import org.junit.Test;

import java.util.Date;

public class CloneTest {
    @Test
    public void testClone() {
        WeeklyLog log_previous = new WeeklyLog();
        log_previous.setContent("天天加班");
        log_previous.setDate(new Date());
        log_previous.setName("张无忌");
        System.out.println(log_previous);
        System.out.println(log_previous.clone());
    }
}