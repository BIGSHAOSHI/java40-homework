package com.cskaoyan.homework.day16;

/*
异常类只是描述异常的信息，但是什么时候产生异常，怎么处理异常和异常类本身没有关系
分别自定义编译时异常和运行时异常，在方法中抛出异常，main方法中调用该方法，并处理相应的异常
 */

public class CustomExpressionTest {
    public static void main(String[] args) {
        NumberTest n = new NumberTest();
        //捕获异常
        try {
            System.out.println("商=" + n.shang(1, -3));
        } catch (DivisorNegativeException d) {
            System.out.println(d.getMessage());
            d.printStackTrace();
        } catch (Exception y) {
            y.printStackTrace();
        } finally {
            System.out.println("finally!");
        }
    }
}

class DivisorNegativeException extends Exception {
    public DivisorNegativeException(String msg) {
        super(msg);
    }
}

class NumberTest {
    public int shang(int x, int y) throws DivisorNegativeException {
        if (y < 0) {
            throw new DivisorNegativeException("您输入的是" + y + ",规定除数不能为负数!");
        }
        return x / y;
    }
}
