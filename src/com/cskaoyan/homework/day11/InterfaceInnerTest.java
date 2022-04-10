package com.cskaoyan.homework.day11;

/*
定义一个接口Compute，用来完成计算器的功能，给出四个抽象方法：加减乘除。
        然后请用以下三种方式测试：
        1，编写实现类进行测试
        2，用局部内部类进行测试
        3，使用匿名内部类进行测试
*/
public class InterfaceInnerTest {
    public static void main(String[] args) {
        System.out.println("============================");
        System.out.println("1，编写实现类进行测试");
        ComputerImpl com = new ComputerImpl();
        System.out.println("10 + 10 = " + com.plus(10, 10));
        System.out.println("10 - 10 = " + com.subtract(10, 10));
        System.out.println("10 x 10 = " + com.multiply(10, 10));
        System.out.println("10 ÷ 10 = " + com.divide(10, 10));
        System.out.println("============================");
        System.out.println("2.用局部内部类进行测试");
        class ComputerImpl1 implements Computer {
            @Override
            public double plus(double a, double b) {
                return a + b;
            }

            @Override
            public double subtract(double a, double b) {
                return a - b;
            }

            @Override
            public double multiply(double a, double b) {
                return a * b;
            }

            @Override
            public double divide(double a, double b) {
                return a / b;
            }
        }
        ComputerImpl1 computerImpl1 = new ComputerImpl1();
        System.out.println("10 + 10 = " + computerImpl1.plus(10, 10));
        System.out.println("10 - 10 = " + computerImpl1.subtract(10, 10));
        System.out.println("10 x 10 = " + computerImpl1.multiply(10, 10));
        System.out.println("10 ÷ 10 = " + computerImpl1.divide(10, 10));

        System.out.println("============================");
        System.out.println("3，使用匿名内部类进行测试");
        System.out.println("10 + 10 = " + new Computer() {
            @Override
            public double plus(double a, double b) {
                return a + b;
            }

            @Override
            public double subtract(double a, double b) {
                return a - b;
            }

            @Override
            public double multiply(double a, double b) {
                return a * b;
            }

            @Override
            public double divide(double a, double b) {
                return a / b;
            }

        }.plus(10, 10));

        System.out.println("10 - 10 = " + new Computer() {
            @Override
            public double plus(double a, double b) {
                return a + b;
            }

            @Override
            public double subtract(double a, double b) {
                return a - b;
            }

            @Override
            public double multiply(double a, double b) {
                return a * b;
            }

            @Override
            public double divide(double a, double b) {
                return a / b;
            }

        }.subtract(10, 10));

        System.out.println("10 x 10 = " + new Computer() {
            @Override
            public double plus(double a, double b) {
                return a + b;
            }

            @Override
            public double subtract(double a, double b) {
                return a - b;
            }

            @Override
            public double multiply(double a, double b) {
                return a * b;
            }

            @Override
            public double divide(double a, double b) {
                return a / b;
            }

        }.multiply(10, 10));

        System.out.println("10 ÷ 10 = " + new Computer() {
            @Override
            public double plus(double a, double b) {
                return a + b;
            }

            @Override
            public double subtract(double a, double b) {
                return a - b;
            }

            @Override
            public double multiply(double a, double b) {
                return a * b;
            }

            @Override
            public double divide(double a, double b) {
                return a / b;
            }

        }.divide(10, 10));
    }
}

class ComputerImpl implements Computer {

    @Override
    public double plus(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        return a / b;
    }
}

interface Computer {
    double plus(double a, double b);

    double subtract(double a, double b);

    double multiply(double a, double b);

    double divide(double a, double b);
}