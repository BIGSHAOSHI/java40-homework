package com.cskaoyan.homework.day12;

import java.util.Arrays;

public class MapTest {


    public static void main(String[] args) {

        //映射 学生数组 -> 分数数组
        Student[] stus1 = new Student[5];
        stus1[0] = new Student("张三",18,95.5);
        stus1[1] = new Student("李四",19,93);
        stus1[2] = new Student("王五",17,94.5);
        stus1[3] = new Student("赵六",19,96.5);
        stus1[4] = new Student("黄七",18,97);
        Double[] scores = MapTest.mapObjectArr(stus1,o -> {
            Student stu = (Student)o;
            return stu.getScore();
        });
        printStudents(stus1);
        printDoubleArr(scores);

        //将一个String对象数组，映射为装所有字符串对象长度的数组。
        String[] strs = {"string","int","byte","float",""};
        Double[] strsLength = mapObjectArr(strs,o -> {
            String str = (String) o;
            return (double) str.length();
        });
        System.out.println(Arrays.toString(strs));
        printDoubleArr(strsLength);

    }

    private static void printStudents(Student[] stus1) {
        System.out.println("打印Student[]数组:");
        for (Student student : stus1) {
            System.out.println("姓名:"+student.getName()+", 年龄:"+student.getAge()+", 分数:"+student.getScore());
        }
    }

    public static Double[] mapObjectArr(Object[] o,Map map){
        int count = o.length;
        Double[] scores = new Double[count];
        for (int i = 0; i < o.length; i++) {
            scores[i] = map.map(o[i]);
        }
        return scores;
    }

    public static void printDoubleArr(Double[] scores){
        System.out.println("打印Double[]数组:");
        for (Double score : scores) {
            System.out.println(score);
        }
    }
}

interface Map{
    Double map(Object o);
}

class Student{
    String name;
    int age;
    double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public Double getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }
}