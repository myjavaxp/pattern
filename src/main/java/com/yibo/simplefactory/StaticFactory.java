package com.yibo.simplefactory;

public class StaticFactory {
    public static Product getProduct(String arg) {
        Product product = null;
        if ("A".equalsIgnoreCase(arg)) {
            product = new ProductA();
        } else if ("B".equalsIgnoreCase(arg)) {
            product = new ProductB();
        }
        return product;
    }
}