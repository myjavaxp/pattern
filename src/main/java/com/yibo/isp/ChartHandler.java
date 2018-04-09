package com.yibo.isp;

import com.yibo.lsp.Customer;
import com.yibo.ocp.Chart;

import java.util.List;

/**
 * 图表处理
 */
public interface ChartHandler {
    Chart createChart(List<Customer> customerList);
    void displayChart(Chart chart);
}