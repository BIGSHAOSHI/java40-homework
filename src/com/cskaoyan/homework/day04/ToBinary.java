package com.cskaoyan.homework.day04;

import java.util.Scanner;

/**
 * @author 王世杰
 * @created 2022/3/24 12:52
 */

public class ToBinary {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个10进制整数：");
        int num = sc.nextInt();
        sc.close();
        System.out.print("它的2进制表示为：");
        toBinary(num);
    }

    public static void toBinary(int n) {
        if (n / 2 == 0)
            System.out.print(n % 2);
        else
            toBinary(n / 2);
        System.out.print(n % 2);
    }

}
