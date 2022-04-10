package com.cskaoyan.homework.day04;

import java.util.Arrays;

/**
 * @author 王世杰
 * @created 2022/3/24 12:26
 */

public class MergeArrays {
    public static int[] mergeArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;

        for (; index3 < nums1.length; index3++) {
            nums[index3] = nums1[index1++];
        }
        for (; index3 < nums1.length + nums2.length; index3++) {
            nums[index3] = nums2[index2++];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 3, 5, 7, 9, 111, 222 };
        int[] nums2 = { 2, 4, 6, 8, 10 };
        int[] mergerNums = mergeArrays(nums1, nums2);
        System.out.println("合并前的两个数组：");
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println("合并后的数组：");
        // System.out.println(Arrays.toString(mergerNums));
        mergerNums = BubbleSort.bubbleSort(mergerNums);
        System.out.println(Arrays.toString(mergerNums));

    }
}
