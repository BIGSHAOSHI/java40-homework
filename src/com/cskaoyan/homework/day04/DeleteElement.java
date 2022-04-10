package com.cskaoyan.homework.day04;

import java.util.Arrays;

/**
 * since 2022/3/24 19:18
 * authored by BIGSHAOSHI
 ***/

public class DeleteElement {
    public static String[][] deleteSameElement(String[] strings, String str) {
        int count = 0;
        for (int i = 0; i < strings.length - count; i++) {
            if (strings[i] == str) {
                for (int j = i; j < strings.length - 1; j++) {
                    strings[j] = strings[j + 1];
                }
                count++;
                i--;
            }
        }
        String[] resStrings = new String[strings.length - count];
        System.arraycopy(strings, 0, resStrings, 0, resStrings.length);
        String[] resCount = new String[]{String.valueOf(count)};

        //返回二维数组：其中 [0] 为 删除元素后的最终数组  [1] 为删除元素的个数以字符串形式存储在[0]号位
        return new String[][]{resStrings, resCount};

    }

    public static void main(String[] args) {
        String[] strings = {"123", "adc","a", "123", "sda", "asa", "weqw","123"};
        String str = "123";
        System.out.println("删除前：" + Arrays.toString(strings));
        String[][] returnDoubleArrays = deleteSameElement(strings, str);
        strings = returnDoubleArrays[0];
        int count = Integer.parseInt(returnDoubleArrays[1][0]);
        System.out.print("删" + count + "个\""+str+"\"");
        System.out.println("后：" + Arrays.toString(strings));
    }
}
