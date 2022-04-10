package com.cskaoyan.homework.day14;

import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {
        String str = "a b c,d";
        String str1 = "a B c,d";
        String[] split = str.split(" ");
//        System.out.println(Arrays.toString(split));
        System.out.println(str.equalsIgnoreCase(str1));
    }
}
