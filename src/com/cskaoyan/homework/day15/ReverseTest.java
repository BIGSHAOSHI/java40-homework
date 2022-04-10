package com.cskaoyan.homework.day15;
/*
判断一个字符串是否是对称字符串,例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"是对称字符串
提示: 判断一个字符串是否是对称的字符串，我只需要把 第一个和最后一个比较 第二个和倒数第二个比较 ...
可以借助StringBuffer
 */

import sun.font.TrueTypeFont;

import java.util.Scanner;

public class ReverseTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            String str = sc.nextLine();
            String strReverse = new StringBuilder(str).reverse().toString();
            if(str.equals(strReverse)){
                System.out.println(str+"是对称字符！");
            }else{
                System.out.println(str+"不是对称字符！");
            }
            if (str.equals("88")){
                flag = false;
            }
        }
    }

}
