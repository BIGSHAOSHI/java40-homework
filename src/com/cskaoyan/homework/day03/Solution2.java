package com.cskaoyan.homework.day03;

import java.util.Scanner;

/**
 * 现在你去参加歌唱比赛。
 * 有10个评委打分，规则是去掉最高分和最低分，求平均分是最终成绩。
 * 请编码计算出你的最终成绩~
 *
 * @author 王世杰
 * @created 2022/3/23 12:59
 */

public class Solution2 {

    public static double[] getScore() {
        double[] score = new double[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入10个评委给出的成绩");
        for (int i = 0; i < score.length; i++) {
            score[i] = scanner.nextDouble();
        }
        scanner.close();
        return score;
    }

    public static int getMaxIndex(double[] arr) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int getMinIndex(double[] arr) {
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static double[] removeByIndex(int index, double[] arr) {
        double[] arr2 = new double[arr.length - 1];
        for (int i = 0; i < arr2.length; i++) {
            if (i < index) {
                arr2[i] = arr[i];
            } else
                arr2[i] = arr[i + 1];
        }
        return arr2;
    }

    public static double getAverage(double[] arr) {
        double sum = 0;
        for (double v : arr)
            sum += v;
        return sum / arr.length;
    }

    public static void main(String[] args) {
        double[] score = getScore();
        double[] usefulScore = removeByIndex(getMinIndex(removeByIndex(getMaxIndex(score), score)), removeByIndex(getMaxIndex(score), score));
        double average = getAverage(usefulScore);
        System.out.println("去掉一个最小值和一个最大值后的最终成绩为：" + average);
    }
}
