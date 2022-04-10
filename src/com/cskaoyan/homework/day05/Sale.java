package com.cskaoyan.homework.day05;

/**
 * since 2022/3/25 19:03
 * authored by BIGSHAOSHI
 ***/

public class Sale {

    public static double[] sumAndAverage(double[][] saleDates){
        double[] res = new double[2];
        for (int i = 0; i < saleDates.length; i++) {
            for (int j = 0; j < saleDates[i].length; j++) {
                res[0] += saleDates[i][j];
            }
        }
        res[1] = res[0] / 4;
        return res;
    }

    public static void main(String[] args) {
        double[][] saleDates = {{30,66, 48},{10, 33, 20},{10,99,103},{9,18,27}} ;
        double[] res = sumAndAverage(saleDates);
        System.out.println("平均每个季度的销售额为："+res[1]);
        System.out.println("销售总额为："+res[0]);
    }
}
