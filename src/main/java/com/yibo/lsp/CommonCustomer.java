package com.yibo.lsp;

public class CommonCustomer extends Customer {
    public CommonCustomer() {
        System.out.println("普通客户");
        setEmail("default@qq.com");
        setName("default");
    }
}