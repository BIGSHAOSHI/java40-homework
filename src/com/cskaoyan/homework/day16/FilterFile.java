package com.cskaoyan.homework.day16;

/*
带过滤器的listFiles方法练习 自己做一个目录，里面放些一下文件，文件夹 用带过滤器的listFiles方法进行筛选

条件一：仅留下文件夹名包括a的文件夹

条件二：仅留下.txt结尾的文本文件

条件三：仅留下以a开头的文件
 */

import java.io.File;
import java.util.Arrays;

public class FilterFile {
    public static void main(String[] args) {
        File dir = new File("/home/jie/Documents/testFold");

        //条件一：仅留下文件夹名包括a的文件夹
        File[] files1 = dir.listFiles(pathname -> pathname.isDirectory() && pathname.getName().indexOf('a') != -1);
        System.out.println(Arrays.toString(files1));


        //条件二：仅留下.txt结尾的文本文件
        File[] files2 = dir.listFiles(pathname -> pathname.getName().endsWith(".txt"));
        System.out.println(Arrays.toString(files2));

        //条件三：仅留下以a开头的文件
        File[] files3 = dir.listFiles(pathname -> pathname.isFile() && pathname.getName().startsWith("a"));
        System.out.println(Arrays.toString(files3));
    }

    private static boolean myAccept(File pathname) {
        System.out.println();
        System.out.println();
        System.out.println();
        return pathname.isFile() && pathname.getName().endsWith(".txt");
    }
}
