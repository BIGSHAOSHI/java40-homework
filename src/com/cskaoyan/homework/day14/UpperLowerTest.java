package com.cskaoyan.homework.day14;

public class UpperLowerTest {

    public static void main(String[] args) {
        String res = upperLower("lengendary");
        System.out.println(res);
    }

    public static String upperLower(String str){
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i%2 == 0){
                res.append(String.valueOf(str.charAt(i)).toUpperCase());
            }else {
                res.append(String.valueOf(str.charAt(i)).toLowerCase());
            }
        }
        return res.toString();
    }
}
