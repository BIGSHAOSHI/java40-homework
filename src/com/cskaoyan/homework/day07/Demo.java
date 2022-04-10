package com.cskaoyan.homework.day07;

import com.cskaoyan.homework.day07.arrytool.ScannerUtils;

public class Demo {
    public static void main(String[] args) {
        String name = ScannerUtils.nextString();
        int age = ScannerUtils.nextInt();
        System.out.println("姓名：" + name + "年龄：" + age);
    }
}
