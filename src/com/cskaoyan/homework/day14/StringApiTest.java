package com.cskaoyan.homework.day14;

import java.util.Arrays;

public class StringApiTest {

    public static void main(String[] args) {
        String str1 = "王世杰666";
        String str2 = "卫屹柔666";
        String str4 = "wangshijie666";
        String str5 = "WANGSHIJIE666";
        String str6 = "666";
        String str7 = "aaa";
        String str8 = "王世杰";

        System.out.println(str1.equals(str2)); //false
        System.out.println(str4.equalsIgnoreCase(str5)); //true
        System.out.println(str1.contains(str6)); //true
        System.out.println(str4.startsWith("w")); //true
        System.out.println(str1.endsWith(str6)); //true
        System.out.println(str6.isEmpty()); //false
        System.out.println(str5.length()); //13
        System.out.println(str1.charAt(0)); //'王'
        System.out.println(str4.indexOf('i')); //6
        System.out.println(str4.indexOf('i', 7)); //8
        System.out.println(str4.indexOf(str6)); //10
        System.out.println(str5.indexOf(str6, 11)); //-1
        System.out.println(str1.substring(3));//666
        System.out.println(str1.substring(3,5));// 66
        System.out.println(Arrays.toString(str1.toCharArray()));// '王','世','杰','6','6','6'
        System.out.println(Arrays.toString(str7.getBytes()));// '97' '97' '97'

        char[] chars = {'王','世','杰','6','6','6'};
        System.out.println(String.valueOf(chars));//"王世杰666"
        System.out.println(String.valueOf(96));//96

        System.out.println(str5.toLowerCase().equals(str4));//true
        System.out.println(str4.toUpperCase().equals(str5));//true
        System.out.println(str8.concat(str6));//”王世杰666“
        System.out.println(str1.replace('6', '7'));//"王世杰777"
        System.out.println(str1.replace("666", "777"));//"王世杰777"

        System.out.println(" abc ".trim());//"abc"
        System.out.println(Arrays.toString("i am very good".split(" "))); //["i","am","very","good"]
        System.out.println(str1.compareTo(str2));//3
        System.out.println(str5.compareToIgnoreCase(str4));//13

    }

}
