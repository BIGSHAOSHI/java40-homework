package com.cskaoyan.homework.day07.arrytool;

import java.util.Scanner;

public class ScannerUtils {
    private ScannerUtils() {
    }

    public static String nextString() {
        Scanner sc = new Scanner(System.in);
        String res = sc.nextLine();
        sc.close();
        return res;
    }

    public static int nextInt() {
        Scanner sc = new Scanner(System.in);
        int res = sc.nextInt();
        sc.close();
        return res;
    }

    public static Person nextPerson() {
        return new Person(nextString(), nextInt());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        String name = ScannerUtils.nextString();
        System.out.println(name);
        int age = ScannerUtils.nextInt();
        System.out.println(age);
        Person person = ScannerUtils.nextPerson();
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}