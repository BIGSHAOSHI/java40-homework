package com.cskaoyan.homework.day06;

import java.util.Scanner;

/**
 * 编写一个类模拟银行账户（Account）的功能，包含的属性有
 * "账户名（ID）"、"密码"、"账户余额"、"储蓄年利率"等。
 * 其中：
 * 1. **账号名：**要求每个账户的账户名都是唯一的，且按照固定格式自动生成：
 * - 第一位账户的账户名是"10001"
 * - 其后账户的账户名依次加1。比如第二位账户的账户名就是"10002"，第三位就是"10003".....
 * 2. **密码：**新建账户时，可以选择自定义密码，也可以选择使用默认密码："000000"（6个0）
 * 3. **账户余额：**可以选择在新建账户时预设一个值，也可以保持默认值0
 * 4. **储蓄年利率：**由银行设置，和账户本身没有关系。你可以将它设置为**"0.3%"**（活期年利率一般都非常低，聊胜于无）
 * <p>
 * 定义完属性后，再给出两个成员方法：
 * 1. 打印账户自身有属性。
 * 2. 根据传入的年限和储蓄年利率，计算本息合计后的余额。
 * <p>
 * 注：计算利息时简单点，不考虑利滚利。即利息 = 利率 * 时间 * 本金**
 * <p>
 * 提示：
 * 1. 账户ID是独属于某个账户的，它肯定是一个成员变量。但是它的赋值
 * 却是在一个初始值的基础上，创建一个对象就+1，这需要一个不受创建对象影响的变量。
 * 2. 储蓄年利率肯定不是属于账户对象的。
 *
 * @author 王世杰
 * @created 2022/3/26 13:08
 */

public class StaticTest {

    public static void main(String[] args) {
        Account a1 = new Account();
        a1.save(1000);
        a1.setPassword("123456".toCharArray());
        a1.print();
        System.out.print("输入定期的年限：");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();
        a1.setAccountBalance(year);
        a1.print();

    }
}

class Account {
    int accountID;
    char[] password = {'0', '0', '0', '0', '0', '0'};
    double accountBalance = 0;

    static double interestRate = 0.003;
    static int currentID = 10001;

    public Account() {
        this.accountID = currentID++;
    }

    public Account(double accountBalance) {
        this.accountID = currentID++;
        this.accountBalance = accountBalance;
    }

    public Account(char[] password) {
        this.accountID = currentID++;
        this.password = password;
    }

    public Account( char[] password, double accountBalance) {
        this.accountID = currentID++;
        this.password = password;
        this.accountBalance = accountBalance;
    }


    public void save(double money) {
        this.accountBalance += money;
    }

    public void get(int money) {
        if ((double) money > this.accountBalance) {
            System.out.println("余额不足");
            return;
        } else
            this.accountBalance -= money;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    void print(){
        System.out.println("账户ID："+accountID+"，  密码："+ String.valueOf(password) +"，  账户余额："+accountBalance);
    }

    public void setAccountBalance(int years) {
        this.accountBalance *= (1+years*interestRate);
    }
}
