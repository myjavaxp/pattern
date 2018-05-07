package com.yibo.thread;

import java.util.concurrent.TimeUnit;

public class Run {
    public static void main(String[] args) {
        simple();
        sample();
    }

    private static void simple() {
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        };
        task.run();
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("Done!");
    }

    private static void sample() {
        Runnable runnable = () -> {
            try {
                String name = Thread.currentThread().getName();
                System.out.println("Foo " + name);
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Bar " + name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        runnable.run();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}