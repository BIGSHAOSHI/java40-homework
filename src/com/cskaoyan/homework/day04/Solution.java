package com.cskaoyan.homework.day04;

import java.util.Arrays;
import java.util.Scanner;

/**
 * since 2022/3/24 18:41
 * authored by BIGSHAOSHI
 ***/

public class Solution {

    public static double[] inputScores() {
        double[] scores = new double[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            scores[i] = sc.nextDouble();
        }
        sc.close();
        return scores;
    }

    public static double getAverageScore(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    //定义一个String数组，输出该数组的长度，并用多种方式遍历打印数组元素（常见的方式遍历即可）
    public static void printArr1(String[] strings) {
        System.out.println("the length of the array is " + strings.length);
        System.out.print("the String array are：");
        System.out.print("[");
        for (String str : strings) {
            System.out.print(str+", ");
        }
        System.out.println("\b\b]");
    }
    
    public static void printArr2(String[] strings){
        System.out.println("the length of the array is " + strings.length);
        System.out.print("the String array are：");
        System.out.print("[");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i]+", ");
        }
        System.out.println("\b\b]");

    }

    public static void main(String[] args) {
        System.out.println("input ten scores:");
        double[] scores = inputScores();
        System.out.println("the ten scores are: " + Arrays.toString(scores));
        System.out.println("the average score is :" + getAverageScore(scores));
        String[] strings = {"张三","李四","王二麻子","张全蛋"};
        printArr1(strings);
        printArr2(strings);
    }
}
