package com.yibo.ocp;

public class ChartDisplay {
    private Chart chart;
    public void setChart(Chart chart){
        this.chart=chart;
    }
    public void display(){
        chart.display();
    }
}