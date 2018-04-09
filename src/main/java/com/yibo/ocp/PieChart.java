package com.yibo.ocp;

public class PieChart implements Chart {
    @Override
    public void display() {
        System.out.println("显示饼状图");
    }

    public PieChart() {
        System.out.println("创建饼状图");
    }
}