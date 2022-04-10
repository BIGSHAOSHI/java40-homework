package com.cskaoyan.homework.day14;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        Integer[] ints = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        choseSort(ints);
        System.out.println(Arrays.toString(ints));
    }

    //选择排序！
    public static void choseSort(Integer[] integers) {
        int minIndex;
        int temp;
        int len = integers.length;
        for (int i = 0; i < len; i++) {
            minIndex = i;
            for (int j = i+1; j < len; j++) {
                if (integers[j] < integers[j - 1]) {
                    minIndex = j;
                }
            }
            temp = integers[i];
            integers[i] = integers[minIndex];
            integers[minIndex] = temp;
        }
    }

    //快速排序
    public static void insertSort(Integer[] integers){


    }


}
