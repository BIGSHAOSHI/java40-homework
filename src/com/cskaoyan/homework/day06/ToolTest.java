package com.cskaoyan.homework.day06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 自己编写数组工具类
 * 工具类：指的是类中方法全部是静态方法的类，工具类在使用时无需创建对象（静态方法无需对象调用）
 * 以下方法的实现，都是我们上课写过的代码，如果觉得自己很熟练了，直接抄代码即可
 * 如果觉得不熟悉或者想再练习一遍，再写一遍也可以~
 * <p>
 * 写一个数组的工具类ArrayTool, 要求提供如下方法：
 * 遍历，求最大值，最小值，逆置数组元素
 * 查询（在数组中查找指定元素，若不存在，待查找元素返回-1，若存在返回元素在数组中首次出现的位置)
 * 查询（在数组中查找指定元素，若不存在，待查找元素返回-1，若存在返回元素在数组中最后一次出现的位置)
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
        scanner.close();
        double[] numbers = new double[len];
        System.out.print("请连续输入" + len + "个数：");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }
        return numbers;
    }
}

class ArrayTool {

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