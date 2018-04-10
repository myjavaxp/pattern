package com.yibo.single;

public class TaskManager {
    private volatile static TaskManager taskManager;

    private TaskManager() {
        System.out.println("任务管理器初始化");
    }

    public void displayProcesses() {
        System.out.println("显示进程");
    }

    public void displayServices() {
        System.out.println("显示服务");
    }

    public static TaskManager getInstance() {
        if (taskManager == null) {
            synchronized (TaskManager.class) {
                if (taskManager == null) {
                    taskManager = new TaskManager();
                }
            }
        }
        return taskManager;
    }
}