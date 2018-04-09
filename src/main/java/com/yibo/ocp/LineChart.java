package com.yibo.ocp;
public class LineChart implements Chart {
    @Override
    public void display() {
        System.out.println("展示折线图");
    }

    public LineChart() {
        System.out.println("创建折线图");
    }
}