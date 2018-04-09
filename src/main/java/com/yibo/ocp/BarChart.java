package com.yibo.ocp;

public class BarChart implements Chart {
    @Override
    public void display() {
        System.out.println("显示饼状图");
    }

    public BarChart() {
        System.out.println("创建饼状图");
    }
}