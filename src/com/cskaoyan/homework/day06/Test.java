package com.cskaoyan.homework.day06;

/**
 * @author 王世杰
 * @created 2022/3/26 12:51
 */

public class Test {

    private static double getAverageScore(Student[] students) {
        double sumScore = 0;
        for (Student student : students) {
            sumScore += student.score;
        }
        return sumScore / students.length;
    }

    public static void main(String[] args) {
        Student s1 = new Student("王世杰","男",22,4.4);
        Student s2 = new Student("屈正","男",25,4.3);
        Student s3 = new Student("新冉冉","男",25,4.2);
        Student s4 = new Student("刘露","男",23,4.1);
        Student s5 = new Student("卢本伟","男",30,4.0);

        Student[] students = {s1,s2,s3,s4,s5};
        for (Student student : students) {
            student.print();
        }
        double averageScore = getAverageScore(students);
        System.out.println("平均绩点为："+averageScore);
    }
}

class Student {
    String name;
    int stuId;
    String gender;
    int age;
    double score;
    static int currentID = 10001;

    public Student() {
        currentID++;
    }

    public Student(String name, String gender, int age, double score) {
        this.name = name;
        this.stuId = currentID++;
        this.gender = gender;
        this.age = age;
        this.score = score;
    }

    void print(){
        System.out.print("姓名："+name+"， ");
        System.out.print("学号："+stuId+"， ");
        System.out.print("性别："+gender+"， ");
        System.out.print("年龄："+age+"， ");
        System.out.println("绩点："+score+"。");
    }

}

