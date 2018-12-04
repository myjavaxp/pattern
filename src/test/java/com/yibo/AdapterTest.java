package com.yibo;

import com.yibo.adapt.ScoreOperation;
import com.yibo.utils.XMLUtil;
import org.junit.Test;

public class AdapterTest {
    @Test
    public void testAdapter() {
        ScoreOperation scoreOperation = (ScoreOperation) XMLUtil.getBean("operationAdapter");
        int[] scores = {112, 42332, 11, 432, 43, 765, 87, 876};
        System.out.println("成绩排序：");
        int[] result = scoreOperation.sort(scores);
        for (int i : result) {
            System.out.print(i + ",");
        }
        System.out.println();
        System.out.println("查找成绩11：");
        int score = scoreOperation.search(result, 11);
        if (score != -1) {
            System.out.println("找到11");
        } else {
            System.out.println("未找到11");
        }
        System.out.println("查找成绩99：");
        score = scoreOperation.search(result, 99);
        if (score != -1) {
            System.out.println("找到99");
        } else {
            System.out.println("未找到99");
        }
    }
}