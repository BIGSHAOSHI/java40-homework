package com.cskaoyan.homework.day07.arrytool;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 需求一：在昨天自己的作业，数组工具类的基础上，私有化它的构造方法
 * 需求二：
 * 定义一个Scanner工具类ScannerUtils，提供以下方法：
 * 1，键盘录入字符串
 * 2，键盘录入int整数
 * 3，键盘录入一个Person对象（Person类中有age和name属性）
 * 不要忘记私有化构造器
 *
 * @author 王世杰
 * @created 2022/3/26 13:57
 */

public class ToolTest {

    public static void main(String[] args) {
        double[] numbers = getNumbers();
        double[] reveseNumbers = Arrays.copyOf(numbers, numbers.length);
        ArrayTool.printNum(numbers);
        System.out.println("数组的最大值为：" + ArrayTool.getMax(numbers));
        System.out.println("数组的最小值为：" + ArrayTool.getMin(numbers));
        System.out.println("翻转数组为：");
        ArrayTool.reverse(reveseNumbers);
        ArrayTool.printNum(reveseNumbers);
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要查询的元素：");
        double searchNumber = scanner.nextDouble();
        scanner.close();
        System.out.println(searchNumber + "是数组第" + ArrayTool.searchFirstSite(numbers, searchNumber) + "个元素");
        System.out.println(searchNumber + "是数组第" + ArrayTool.searchLastSite(numbers, searchNumber) + "个元素");
    }

    private static double[] getNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数组长度：");
        int len = scanner.nextInt();
        double[] numbers = new double[len];
        System.out.print("请连续输入" + len + "个数：");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }
        scanner.close();
        return numbers;
    }
}

/*
 * 1，键盘录入字符串
 * 2，键盘录入int整数
 * 3，键盘录入一个Person对象（Person类中有age和name属性）
 * 不要忘记私有化构造器
 */

class ArrayTool {

    private ArrayTool() {
    }

    public static void printNum(double[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }

    public static double getMax(double[] numbers) {
        double max = numbers[0];
        for (double number : numbers) {
            if (number > max)
                max = number;
        }
        return max;
    }

    public static double getMin(double[] numbers) {
        double min = numbers[0];
        for (double number : numbers) {
            if (number < min)
                min = number;
        }
        return min;
    }

    public static void reverse(double[] numbers) {
        double temp;
        for (int i = 0; i < numbers.length / 2; i++) {
            temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
    }

    public static int searchFirstSite(double[] numbers, double searchNumber) {
        for (int i = 0; i < numbers.length; i++) {
            if (searchNumber == numbers[i]) {
                return i + 1;
            }
        }
        return -1;
    }

    public static int searchLastSite(double[] numbers, double searchNumber) {
        int lastSite = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (searchNumber == numbers[i]) {
                lastSite = i + 1;
            }
        }
        return lastSite;
    }
}