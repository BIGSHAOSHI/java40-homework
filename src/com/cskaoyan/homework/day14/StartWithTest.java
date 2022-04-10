package com.cskaoyan.homework.day14;

public class StartWithTest {
    public static void main(String[] args) {
        String str = "peter piper picked a peck of pickled peppers";
        String[] strings = str.split(" ");
        int count = 0;
        for (String aString : strings) {
            if (aString.startsWith("p")){
                count++;
            }
        }
        System.out.println(str+" 中共有 "+count+"个以'p'开头的单词");
    }
}
