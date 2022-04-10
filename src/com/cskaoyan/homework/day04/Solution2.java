package com.cskaoyan.homework.day04;

/**
 * @author 王世杰
 * @created 2022/3/24 13:27
 */

public class Solution2 {
    public static void method(int a, int b) {
        System.out.println("a = 20");
        System.out.println("b = 40");
        System.exit(1);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        method(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
