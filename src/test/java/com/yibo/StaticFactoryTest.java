package com.yibo;

import com.yibo.ocp.Chart;
import com.yibo.ocp.ChartFactory;
import com.yibo.simplefactory.Product;
import com.yibo.simplefactory.StaticFactory;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class StaticFactoryTest {
    @Test
    public void testStaticFactory() {
        Product product = StaticFactory.getProduct("A");
        product.methodSame();
        product.methodDiff();
        product = Product.factoryMethod("b");
        product.methodSame();
        product.methodDiff();
    }

    @Test
    public void testChartFactory() throws IOException {
        Properties properties = new Properties();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/yibo/IdeaProjects/pattern/src/main/resources/config.properties"));
        properties.load(bufferedReader);
        String type = properties.getProperty("chartType");
        Chart chart;
        try {
            chart = ChartFactory.getChart(type);
            chart.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
        bufferedReader.close();
    }
}