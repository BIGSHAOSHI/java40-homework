package com.cskaoyan.homework.day08;

public class Obj3 extends Obj1 {
    Obj2 ob2 = new Obj2();

    public Obj3() {

        System.out.println("obj3");
    }

    public void print() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Obj3 obj3 = new Obj3();
        obj3.print();
    }
}

class Obj1 {
    Obj2 ob2 = new Obj2();

    public Obj1() {
        System.out.println("Obj1");
    }
}

class Obj2 {
    public Obj2() {
        System.out.println("obj2");
    }
}