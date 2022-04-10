package com.cskaoyan.homework.day15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class CalDataTool {

    private CalDataTool() {
    }

    public static void calDaysFromBorndayToNow() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("请输入您的生日：（格式：1999-4-21）");
        String birthday = (new Scanner(System.in)).nextLine();
        Date date1 = simpleDateFormat.parse(birthday);
        Date date2 = new Date();
        long ms = date2.getTime() - date1.getTime();
        int days = (int) (ms / 1000 / 60 / 60 / 24 );
        System.out.println("你来到这个世界 "+days+" 天了");
    }

}

class Test1{
    public static void main(String[] args) throws ParseException {
        CalDataTool.calDaysFromBorndayToNow();
    }
}