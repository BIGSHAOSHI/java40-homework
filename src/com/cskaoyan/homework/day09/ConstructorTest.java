package com.cskaoyan.homework.day09;

public class ConstructorTest {
    public static void main(String[] args) {
        Son s1 = new Son();
        Son s12 = new Son(1,1);
        Father s2 = new Son();
        Grandfather s3 = new Son();
        // Object s4 = new Son();
        System.out.println("Son s1 = new Son()");
        System.out.println(s12.a);
        s1.test();
        s1.testSon();
        s1.testFather();
        s1.testGrand();
        System.out.println("\nFather s2 = new Son();");
        s2.test();
        s2.testFather();
        s2.testGrand();
        System.out.println("\nGrandfather s3 = new Son()");
        s3.test();
        s3.testGrand();
        System.out.println("\nObject s4 = new Son()");
    }
}

class Grandfather {
    int gA;
    int a;

    public Grandfather(){

    }

    public Grandfather(int a) {
        this.a = a;
    }

    public void testGrand() {
        System.out.println("Grandfather 的 testGrand()方法");
    }

    public void test() {
        System.out.println("Grandfather 的 test()方法");
    }
}

class Father extends Grandfather {
    int fA;

    public Father() {
        super();
    }

    public Father(int a) {
        super(a);
    }

    public void testFather() {
        System.out.println("Father 的 testFather()方法");

    }

    @Override
    public void test() {
        System.out.println("Father 的 test()方法");
    }
}

class Son extends Father {
    int sA;

    public Son() {
        super();
    }

    public Son(int sA,int a) {
        super(a);
        this.sA = sA;
    }

    public void testSon() {
        System.out.println("Son 的 testSon()方法");
    }

    @Override
    public void test() {
        System.out.println("Son 的 test()方法");
    }
}