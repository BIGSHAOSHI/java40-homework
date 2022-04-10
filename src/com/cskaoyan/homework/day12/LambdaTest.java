package com.cskaoyan.homework.day12;

public class LambdaTest {

    public static void main(String[] args) {
        //无返回值无参数的功能接口
        INoReturnNoParam iIf1 = () -> System.out.println("Lambda表达式无返回值无参数的功能接口.");
        iIf1.test();

        //无返回值有一个参数的功能接口
        INoReturnOneParam iIf2 = a -> System.out.println("Lambda表达式无返回值有一个参数的功能接口: a = " + a);
        iIf2.test(10);

        //无返回值两个参数的功能接口
        INoReturnTwoParam iIf3 = (a, b) -> System.out.println("Lambda表达式无返回值两个参数的功能接口:" + a + " + " + b + " = " + (a + b));
        iIf3.test(10, 20);

        //有返回值无参数的功能接口
        IHasReturnNoParam iIf4 = () -> 10;
        System.out.println("Lambda表达式有返回值无参数的功能接口: 返回值为" + iIf4.test());

        //有返回值一个参数的功能接口
        IHasReturnOneParam iIf5 = a -> a;
        System.out.println("Lambda表达式有返回值一个参数的功能接口: 返回值为" + iIf5.method(10));

        //有返回值两个参数的功能接口
        IHasReturnTwoParam iIf6 = (a, b) -> (a + b);
        System.out.println("Lambda表达式有返回值两个参数的功能接口: 返回值为" + iIf6.test(10, 10));
    }
}

//无返回值无参数的功能接口
@FunctionalInterface
interface INoReturnNoParam {
    void test();
}

//无返回值有一个参数的功能接口
@FunctionalInterface
interface INoReturnOneParam {
    void test(int a);
}

//无返回值两个参数的功能接口
@FunctionalInterface
interface INoReturnTwoParam {
    void test(int a, int b);
}

//有返回值无参数的功能接口
@FunctionalInterface
interface IHasReturnNoParam {
    int test();
}

//有返回值一个参数的功能接口
@FunctionalInterface
interface IHasReturnOneParam {
    int method(int a);
}

//有返回值两个参数的功能接口
@FunctionalInterface
interface IHasReturnTwoParam {
    int test(int a, int b);
}