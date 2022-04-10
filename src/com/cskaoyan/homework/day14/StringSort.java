package com.cskaoyan.homework.day14;

import java.util.Arrays;
import java.util.Random;

public class StringSort {

    public static void main(String[] args) {
        System.out.println("随机：");
        String[] strings = getStringS();
        stringSort(strings);
        System.out.println("题目例子：");
        String[] strs = {"UxoEl", "If3js", "9SSwC", "czHuA", "lZLBF", "IhynX", "VgjrY", "dJAIW"};
        stringSort(strs);

    }

    private static void stringSort(String[] strs) {
        System.out.println(Arrays.toString(strs));
        String temp;
        for (int i = 0; i < strs.length; i++) {
            for (int j = 1; j < strs.length - i; j++) {
                if (strs[j].toUpperCase().charAt(0) < strs[j - 1].toUpperCase().charAt(0)) {
                    exch(strs, j);
                }
            }
        }
        System.out.println(Arrays.toString(strs));
    }

    private static void exch(String[] strs, int j) {
        String temp;
        temp = strs[j];
        strs[j] = strs[j - 1];
        strs[j - 1] = temp;
    }

    private static String[] getStringS() {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        String[] res = new String[8];
        for (int i = 0; i < 8; i++) {
            StringBuilder st = new StringBuilder();
            for (int j = 0; j < 5; j++) {
                int number = random.nextInt(62);
                st.append(str.charAt(number));
            }
            res[i] = st.toString();
        }
        return res;
    }
}

