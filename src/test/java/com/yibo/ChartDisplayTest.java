package com.yibo;
import com.yibo.ocp.BarChart;
import com.yibo.ocp.Chart;
import com.yibo.ocp.ChartDisplay;
import com.yibo.ocp.PieChart;
import org.junit.Test;

public class ChartDisplayTest {
    @Test
    public void testDisplay(){
        Chart barChart=new BarChart();
        Chart pieChart = new PieChart();
        ChartDisplay chartDisplay=new ChartDisplay();
        chartDisplay.setChart(barChart);
        chartDisplay.display();
        System.out.println("------");
        chartDisplay.setChart(pieChart);
        chartDisplay.display();
    }
}