package com.cskaoyan.homework.day04;

import java.util.Arrays;

/**
 * @author 王世杰
 * @created 2022/3/24 13:05
 */

public class BubbleSort {

    public static int[] bubbleSort(int[] nums) {
        int temp = nums[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j + 1] < nums[j]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }


    public static int[] choseSort(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            index = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[index]) {
                    index = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }
        return nums;
    }

    public static int[] insertSort(int[] nums) {
        int temp;
        for (int i = 1; i < nums.length; i++) {
            temp = nums[i];
            for (int j = i-1; j > 0; j--) {
                if (nums[j] > temp) {
                    nums[j+1] = nums[j];
                } else {
                    nums[j] = temp;
                    break;
                }
            }
        }
        return nums;


    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2323, 11, 2222, 33, 8, 111};
        System.out.println("排序前：" + Arrays.toString(nums));
        nums = insertSort(nums);
        System.out.println("排序后：" + Arrays.toString(nums));
    }
}
