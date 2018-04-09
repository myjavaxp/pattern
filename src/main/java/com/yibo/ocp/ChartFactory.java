package com.yibo.ocp;

public class ChartFactory {
    public static Chart getChart(String type) throws UnSupportedChartException {
        if ("histogram".equalsIgnoreCase(type)) {
            return new HistogramChart();
        } else if ("pie".equalsIgnoreCase(type)) {
            return new PieChart();
        } else if ("line".equalsIgnoreCase(type)) {
            return new LineChart();
        } else if ("bar".equalsIgnoreCase(type)) {
            return new BarChart();
        } else {
            throw new UnSupportedChartException();
        }
    }
}

class UnSupportedChartException extends Exception {

    private static final long serialVersionUID = 6855650487928058507L;

    @Override
    public String getMessage() {
        return "不受支持的图表类型";
    }
}