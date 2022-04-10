package com.cskaoyan.homework.day10;

public class AbstractBasicTest {
    public static void main(String[] args) {
        C classC = new C();
        classC.showA();
        classC.showB();
        classC.showC();
    }
}

abstract class A{
    int a = 10;
    abstract void showA(); 
} 

abstract class B extends A{    
    int b = 20;
    abstract void showB(); 
}

class C extends B{
    int c = 30;

    @Override
    void showA() {
        System.out.println(a);
    }

    @Override
    void showB() {
        System.out.println(b);
    }

    void showC() {
        System.out.println(c);
    }
}