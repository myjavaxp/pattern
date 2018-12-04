package com.yibo;

import com.yibo.single.LoadBalancer;
import com.yibo.single.TaskManager;
import org.junit.Test;

public class SingletonTest {
    @Test
    public void testSingleton() {
        TaskManager taskManager = TaskManager.getInstance();
        taskManager.displayProcesses();
        TaskManager tm = TaskManager.getInstance();
        tm.displayServices();
    }

    @Test
    public void testLoadBalancer() {
        LoadBalancer loadBalancer = LoadBalancer.getInstance();
        loadBalancer.addServer("Server 1");
        loadBalancer.addServer("Server 2");
        loadBalancer.addServer("Server 3");
        loadBalancer.addServer("Server 4");
        loadBalancer.addServer("Server 5");
        for (int i = 0; i < 10; i++) {
            String server = loadBalancer.getServer();
            System.out.println("分发请求至服务器:" + server);
        }
    }
}