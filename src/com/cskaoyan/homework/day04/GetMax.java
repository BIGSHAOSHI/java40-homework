package com.cskaoyan.homework.day04;

import java.util.Arrays;

/**
 * @author 王世杰
 * @created 2022/3/24 12:20
 */

public class GetMax {
    // 求不限定个数参数的最大值（要求使用可变参数，使用int类型即可）

    public static int getMax(int... number) {
        int maxNum = number[0];
        for (int num : number) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(Arrays.toString(nums) + "中最大值为：" + getMax(nums));
    }

}
