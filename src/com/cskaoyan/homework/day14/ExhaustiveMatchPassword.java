package com.cskaoyan.homework.day14;

import java.util.Random;

public class ExhaustiveMatchPassword {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNum1 = random.nextInt(10);
        int randomNum2 = random.nextInt(10);
        int randomNum3 = random.nextInt(10);
        String randomPassword = String.valueOf(randomNum1) + String.valueOf(randomNum2) + String.valueOf(randomNum3);
        System.out.println("随机密码为： "+randomPassword);
        exhaustiveMatch(randomPassword);
    }

    public static void exhaustiveMatch(String password){
        int count = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    String guess = String.valueOf(i) + String.valueOf(j) + String.valueOf(k);
                    System.out.print(guess+", ");
                    if((count++) % 10 == 0 ) {
                        System.out.println();
                    }
                    if (guess.equals(password)){
                        return;
                    }
                }
            }
        }
    }
}
