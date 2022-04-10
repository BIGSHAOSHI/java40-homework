package com.cskaoyan.homework.day16;

import java.io.File;

public class DeleteByRecursion {

    public static void main(String[] args) {
        File dir = new File("//home//jie//Documents//app2");
        deleteByRecursion(dir);

    }

    public static void deleteByRecursion(File file){
        // 结束递归循环
        if (!file.exists())
            return;
        // 如果是目录，请进入内部并递归调用
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                // 调用递归
                deleteByRecursion(f);
            }
        }
        // 调用delete删除文件和空目录
        file.delete();
        System.out.println("Deleted file/folder: "+file.getAbsolutePath());//原文出自【易百教程】，商业转载请联系作者获得授权，非商业请保留原文链接：https://www.yiibai.com/java/java-delete-directory-folder.html
    }
}
