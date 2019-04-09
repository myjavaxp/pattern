package com.yibo.factory.simpleFactory;

public abstract class Product {
    //公共方法的实现
    public void methodSame() {
        System.out.println("产品公共方法");
    }

    //声明抽象业务方法
    public abstract void methodDiff();

    /**
     * 抽象父类集成静态工厂方法
     *
     * @param arg 子类类型参数
     * @return 子类对象
     */
    public static Product factoryMethod(String arg) {
        Product product = null;
        if ("A".equalsIgnoreCase(arg)) {
            product = new ProductA();
        } else if ("B".equalsIgnoreCase(arg)) {
            product = new ProductB();
        }
        return product;
    }
}