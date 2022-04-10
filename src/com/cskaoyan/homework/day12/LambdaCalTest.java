package com.cskaoyan.homework.day12;

public class LambdaCalTest {

    public static void main(String[] args) {
        Computer com1 = LambdaCalTest::add;
        ComputerTool.calc(com1, 10, 10);

        Computer com2 = LambdaCalTest::subtract;
        ComputerTool.calc(com2, 10, 10);

        Computer com3 = LambdaCalTest::multiply;
        ComputerTool.calc(com3, 10, 10);

        Computer com4 = LambdaCalTest::divide;
        ComputerTool.calc(com4, 10, 10);

    }

    private static double divide(double a, double b) {
        return a / b;
    }

    private static double multiply(double a, double b) {
        return a * b;
    }

    private static double subtract(double a, double b) {
        return a - b;
    }

    private static double add(double a, double b) {
        return a + b;
    }
}

@FunctionalInterface
interface Computer {
    double compute(double a, double b);
}

class ComputerTool {
    private ComputerTool() {

    }

    public static void calc(Computer com, double a, double b) {
        System.out.println(com.compute(a, b));
    }
}