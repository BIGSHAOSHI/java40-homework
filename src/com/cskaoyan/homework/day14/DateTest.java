package com.cskaoyan.homework.day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class DateTest {

    public static void main(String[] args) throws ParseException {
        Date date = new Date();  //Thu Apr 07 16:39:55 CST 2022
        System.out.println(date);

        Date date1 = new Date(1000*60*60*24); //Thu Jan 01 08:00:00 CST 1970
        System.out.println(date1);

        long t1 = date.getTime();
        date1.setTime(1000*60*60);
        System.out.println("=====");
        System.out.println(date1);
        System.out.println(t1);
//        int num = febo(45);
//        System.out.println(num);
        long t2 = date.getTime();
//        String.format()
        System.out.println(t2 - t1);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd天");
        System.out.println(simpleDateFormat.format(date));
        System.out.println(simpleDateFormat.parse("2022年04月07天"));


        date1.setTime(1);
        System.out.println(date1);
        int a = 100;
        String name = "黄鹤";
        String s = "好消息,好消息,江南皮革厂倒闭了,老板%s欠了%d万,带着小姨子跑了%n";
        System.out.format(s,name,a);
        String format = String.format(s,name, a);
        System.out.println(format);
        int year = 2022;
        double num = 3.1415;
        // 直接输数字
        System.out.format("%d%n",year);
        // 总长度是8,默认右对齐
        System.out.format("%8d%n",year);
        // 左对齐
        System.out.format("%-8d%n",year);
        // 总长度为8,不够补0
        System.out.format("%08d%n",year);
        System.out.println(num);
        //小数点后几位
        System.out.format("%.2f%n",num);

    }

    static int febo(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            return febo(n - 1) + febo(n - 2);
        }
    }

}
