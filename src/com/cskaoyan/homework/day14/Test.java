package com.cskaoyan.homework.day14;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        String[] strings = getRandomStringArrys();
        System.out.println("随机字符串数组为：" + Arrays.toString(strings));
        stringSort(strings);
        System.out.println("排序后的字符串数组为：" + Arrays.toString(stringSort(strings)));

    }

    private static String[] stringSort(String[] strings) {
        for (int j = 0; j < strings.length; j++) {
            for (int i = 0; i < strings.length - 1; i++) {
                if (strings[i].toLowerCase().charAt(0) > strings[i + 1].toLowerCase().charAt(0)) {
                    String tempt = strings[i];
                    strings[i] = strings[i + 1];
                    strings[i + 1] = tempt;
                }
            }
        }
        return strings;
    }

    private static String[] getRandomStringArrys() {
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        String[] result = new String[8];
        StringBuilder sb;
        for (int i = 0; i < 8; i++) {
            sb = new StringBuilder();
            for (int j = 0; j < 5; j++) {
                int num = rand.nextInt(base.length());
                sb.append(base.charAt(num));
            }
            result[i] = sb.toString();
        }
        return result;
    }

}