package com.cskaoyan.homework.day06;

import java.util.Random;
import java.util.Scanner;

/**
 * ## 猜数小游戏
 * <p>
 * 百度和各种搜索引擎就是生产力，尝试自己解决以下问题：
 * <p>
 * 先生成一个随机数（1~100之间的整数），再键盘输入猜测的数
 * 如果猜的数大了或者小了，给出提示，继续猜，直到猜中为止。
 * <p>
 * 注：Java如何生成随机数，自己百度查一下非常简单。这点学习能力还是需要具备的。
 *
 * @author 王世杰
 * @created 2022/3/26 13:40
 */

public class GuessNumber {

    static int randomNumber = new Random().nextInt(100);

    public GuessNumber() {
    }

    public static boolean compare(int input) {
        if (input == randomNumber) {
            System.out.println("========恭喜你猜对了！=========");
            return false;
        } else if (input > randomNumber) {
            System.out.println("您输入的值大了！请重新输入：");
            return true;
        } else {
            System.out.println("您输入的值小了！请重新输入：");
            return true;
        }
    }

    public static void game(){
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.println("请输入一个你猜的数字:(0~100)");
        while (flag) {
            input = scanner.nextInt();
            flag = compare(input);
        }
        scanner.close();
    }

    public static void main(String[] args) {
        game();
    }
}
