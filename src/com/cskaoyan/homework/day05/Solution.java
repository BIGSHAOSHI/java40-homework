package com.cskaoyan.homework.day05;
import java.util.Scanner;

/**
 * 已知有3个班级（一班，二班，三班）分别有3人，2人，5人
 * 键盘录入每个班级的学生的成绩，并使用二维数组存储数据
 * 然后计算：
 * 每个班级的平均成绩，每个班级中的最高成绩和最低成绩，并输出。
 * since 2022/3/25 19:13
 * authored by BIGSHAOSHI
 ***/

public class Solution {
    public static double[][] getEveryClassScores() {
        double[][] everyClassScores = {new double[3],new double[2],new double[5]};
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入"+(i+1)+"班的"+everyClassScores[i].length+"个成绩：");
            for (int j = 0; j < everyClassScores[i].length; j++) {
                everyClassScores[i][j] = sc.nextDouble();
            }
        }
        sc.close();
        return everyClassScores;
    }

    public static double[] getEachAverageAndMaxAndMinScore(double[] classScores) {
        double[] eachAverageAndMaxAndMinScore = {0, classScores[0], classScores[0]};
        for (int i = 0; i < classScores.length; i++) {
            eachAverageAndMaxAndMinScore[0] += classScores[i];
            if (classScores[i] > eachAverageAndMaxAndMinScore[1]) {
                eachAverageAndMaxAndMinScore[1] = classScores[i];
            }
            if (classScores[i] < eachAverageAndMaxAndMinScore[2]) {
                eachAverageAndMaxAndMinScore[2] = classScores[i];
            }
        }
        eachAverageAndMaxAndMinScore[0] /= classScores.length;
        return eachAverageAndMaxAndMinScore;
    }

    public static void printThreeScore(double[] eachAverageAndMaxAndMinScore,int classNum){
        System.out.print(classNum+"班的平均分："+eachAverageAndMaxAndMinScore[0]+"  ");
        System.out.print("最高分："+eachAverageAndMaxAndMinScore[1]+"  ");
        System.out.println("最低分："+eachAverageAndMaxAndMinScore[2]);
    }

    public static void main(String[] args) {
        double[][] everyClassScores = getEveryClassScores();
        for (int i = 0; i < 3; i++) {
            printThreeScore(getEachAverageAndMaxAndMinScore(everyClassScores[0]),i+1);
        }
    }

}
