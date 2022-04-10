package com.cskaoyan.homework.day15;

/*
Scanner进行键盘录入时，非常容易产生异常，那么就有必要进行处理 我们在进行键盘录入字符串操作时，有时需要把一个字符串转换成int类型。
但如果输入的字符串并不是一个数字时，显然是不能转换成功的，而是会抛出一个异常。
        要求： 处理该异常，让程序不会报错终止，而是让用户重新输入，直到输入正确的数字为止
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExpressionTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            try {
                String numStr = sc.nextLine();
                int num = Integer.parseInt(numStr);
                System.out.println("输入的是数字，转化成功！");
                flag = false;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("请再次输入：");
            }
        }
    }
}
