package com.cskaoyan.homework.day15;

/*
举例： 在字符串”woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun” 中java出现了5次
提示：可以考虑使用indexOf方法，仅考虑本题举出的字符串，无需复杂考虑
 */

public class StringMatch {

    public static void main(String[] args) {
        int count = 0;
        String str = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
        for (int i = 0; i < str.length()-4; i++) {
            if (str.substring(i).indexOf("java")== 0){
                count++;
            }
        }
        System.out.println(count);
    }

}
