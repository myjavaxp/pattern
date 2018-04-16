package com.yibo;

import com.yibo.clone.Attachment;
import com.yibo.clone.WeekLog;
import com.yibo.clone.WeeklyLog;
import org.junit.Test;

import java.util.Date;

public class CloneTest {
    @Test
    public void testClone() {
        WeeklyLog log_previous, log_new;
        log_previous = new WeeklyLog(); //创建原型对象
        Attachment attachment = new Attachment(); //创建附件对象
        log_previous.setAttachment(attachment);  //将附件添加到周报中
        log_new = log_previous.clone(); //调用克隆方法创建克隆对象
        System.out.println(log_previous);
        //比较周报
        System.out.println("周报是否相同？ " + (log_previous == log_new));
        //比较附件
        System.out.println("附件是否相同？ " + (log_previous.getAttachment() == log_new.getAttachment()));

    }

    @Test
    public void testDeepClone() {
        WeekLog log_previous, log_new = null;
        log_previous = new WeekLog(); //创建原型对象
        Attachment attachment = new Attachment(); //创建附件对象
        attachment.setName("原附件");
        log_previous.setAttachment(attachment);  //将附件添加到周报中
        log_previous.setContent("原内容");
        log_previous.setDate(new Date());
        log_previous.setName("原周报");
        try {
            log_new = log_previous.deepClone(); //调用深克隆方法创建克隆对象
        } catch (Exception e) {
            System.err.println("克隆失败！");
        }
        System.out.println(log_previous);
        System.out.println("------");
        System.out.println(log_new);
        System.out.println("------");
        //比较周报
        System.out.println("周报是否相同？ " + (log_previous == log_new));
        //比较附件
        assert log_new != null;
        System.out.println("附件是否相同？ " + (log_previous.getAttachment() == log_new.getAttachment()));
    }
}