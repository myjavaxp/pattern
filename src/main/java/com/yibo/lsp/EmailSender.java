package com.yibo.lsp;

public class EmailSender {
    public static void send(Customer customer){
        if(null==customer){
            throw new RuntimeException("客户不能为空");
        }
        if(null==customer.getEmail()||null==customer.getName()){
            throw new RuntimeException("客户信息不全");
        }
        System.out.println(customer.getName()+"::"+customer.getEmail());
    }
}