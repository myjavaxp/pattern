package com.yibo.lsp;

public class VIPCustomer extends Customer {
    public VIPCustomer() {
        System.out.println("VIP客户");
        setEmail("default@vip.qq.com");
        setName("default");
    }
}