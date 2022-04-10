package com.cskaoyan.homework.day15;

import java.util.Random;


public class RepeatTest {
    public static void main(String[] args) {
        String[] strs = new String[100];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = randomStr();
        }
        print(strs);
        String[][] res = judgeRepeatTimes(strs);
        for (int i = 0; i < res.length && res[i] != null; i++) {
            if (res[i][1] != null && Integer.parseInt(res[i][1]) >= 2)
                System.out.println(res[i][0] + "发生了重复，重复了" + res[i][1] + "次");
        }
    }

    private static String randomStr() {
        String charS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        int r1 = random.nextInt(62);
        int r2 = random.nextInt(62);
        return String.valueOf(charS.charAt(r1)) + charS.charAt(r2);
    }


    public static void print(String[] strs) {
        int count = 0;
        System.out.println("[");
        for (int i = 0; i < strs.length; i++) {
            System.out.print(strs[i] + ", ");
            if (count++ % 20 == 19) {
                System.out.println("\b\b");
            }
        }
        System.out.println("\b\b]");
    }

    public static String[][] judgeRepeatTimes(String[] strs) {
        String[][] s = new String[100][2];
        for (int i = 0; i < 100; i++) {
            s[i][0] = "";
        }
        int[] counts = new int[100];
        for (int i = 0; i < 100; i++) {
            counts[i] = 0;
        }

        int index = 0;

        for (int i = 0; i < strs.length; i++) {
            int count = 0;
            for (int j = 0; j < s.length; j++) {
                if (strs[i].equalsIgnoreCase(s[j][0])) {
                    count++;
                }
            }
            if (count == 0) {
                s[index++][0] = strs[i];
            }
        }

        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs.length; j++) {
                if (strs[i].equalsIgnoreCase(strs[j])) {
                    counts[i]++;
                }
            }
        }
        String[][] sts = new String[100][2];
        for (int i = 0; i < 100; i++) {
            sts[i][0] = strs[i];
            sts[i][1] = String.valueOf(counts[i]);
        }
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < sts.length && s[i][0] != null; j++) {
                if (s[i][0].equals(sts[j][0])) {
                    s[i][1] = sts[j][1];
                }
            }
        }
        return s;
    }
}


