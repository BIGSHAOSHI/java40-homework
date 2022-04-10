package com.cskaoyan.homework.day03;

import java.util.Scanner;

/**
 * 定义一个double类型的数组，让数组中每个元素（包括首位元素）都除以首位元素，
 * 得到的结果过作为该位置上的新元素。请在原先数组数组上操作，并打印新数组。
 * 例如数组[ 2.0 , 4.0 , 6.0 , 4.0 ] 经过方法运算得到新数组 [ 1.0 ,2.0 , 3.0 ,2.0 ]
 * 注：注意元素取值的变化。
 *
 * @author 王世杰
 * @created 2022/3/23 12:48
 */

public class Solution {

    public static double[] divisionFirst(double[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = arr[i] / arr[0];
        }
        return arr;
    }

    public static void printArr(double[] arr) {
        for (double v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    private static double[] getArr() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数组长度：");
        int arrLength = scanner.nextInt();
        double[] arr = new double[arrLength];
        System.out.print("请输入"+arrLength+"个数：");
        for (int i = 0; i < arrLength; i++) {
            arr[i] = scanner.nextDouble();
        }
        scanner.close();
        return arr;
    }

    public static void main(String[] args) {
        double[] arr = getArr();
        System.out.print("操作后的新数组为：");
        printArr(divisionFirst(arr));
    }
}
