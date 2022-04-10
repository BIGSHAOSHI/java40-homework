# 简答题

1. 数组的声明方式有几种？分别是什么？应该使用哪种方式？
```java
有2种：
    (1)数据类型[] 数组名;
    (2)数据类型 数组名[];
应该用第(1)种
```

2. 数组的初始化方式有几种？分别是什么？它们分别在什么场景中使用？
```java
有2种：
    (1) 静态初始化：知道所需数组的各个元素
    		 数据类型[] 数组名 = new 数据类型[]{元素1,元素2,元素3...};
	    缩写：数据类型[] 数组名 = {元素1,元素2,元素3...};
    (2) 动态初始化：知道所需数组的长度(jvm赋予初始值) 
        	 数据类型[] 数组名 = new 数据类型[数组长度];
	
```

3. 数组创建后，还能修改它的长度吗？可以修改元素的取值吗？
```java
不能，可以修改元素的值。
```

4. 动态初始化数组并没有指出数组中元素的具体取值，这时数组可用吗？为什么？请指出各种数据类型数组对象中的元素默认值。
```java
可以使用，因为jvm会赋予初始值:
    byte[]		0
    short[]		0
    int[]		0
    long[]		0L
    float[]		0.0F
    double[]	0.0
    char[]		/u0000
    boolean[]	false
    String[]	null
```

5. （数组）对象中的元素具有默认值，那么引用具有默认值吗？
```java
没有，引用是存放在方法栈中的局部变量，没有初始默认值。
```

6. 说出你对引用数据类型的理解。（可以结合JVM内存模型）
```java
引用数据类型的创建分为两部分：
	(1)首先是在栈上分配一片空间给引用数据类型的引用，简称引用，它是一个局部变量，直接存储在栈帧中。
	(2)在堆上开辟一片空间，用于存放引用数据类型的实际信息，称之为对象或者实例
```

7. JVM内存模型中，栈和堆的作用是什么？（简要说明即可）
```java
(1) 栈是用来调用方法
(2) 堆是用来存放new出来的对象or实例
```


# 编程题

## 1.数组基础练习——除以首元素

> 定义一个double类型的数组，让数组中每个元素（包括首位元素）都除以首位元素，得到的结果过作为该位置上的新元素。请在原先数组数组上操作，并打印新数组。
> 例如数组[ 2.0 , 4.0 , 6.0 , 4.0 ] 经过方法运算得到新数组 [ 1.0 ,2.0 , 3.0 ,2.0 ]
注：注意元素取值的变化。

```java
package com.cskaoyan.homework.day03;

import java.util.Scanner;

public class Solution {

    public static double[] divisionFirst(double[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = arr[i] / arr[0];
        }
        return arr;
    }

    public static void printArr(double[] arr) {
        for (double v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    private static double[] getArr() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数组长度：");
        int arrLength = scanner.nextInt();
        double[] arr = new double[arrLength];
        System.out.print("请输入"+arrLength+"个数：");
        for (int i = 0; i < arrLength; i++) {
            arr[i] = scanner.nextDouble();
        }
        return arr;
    }

    public static void main(String[] args) {
        double[] arr = getArr();
        System.out.print("操作后的新数组为：");
        printArr(divisionFirst(arr));
    }
}
```
![2.1](D:\code\homework\image\day03\2.1.png)



## 2.数组基本使用练习

> 现在你去参加歌唱比赛。有10个评委打分，规则是去掉最高分和最低分，求平均分是最终成绩。请编码计算出你的最终成绩~
>
> 注：
>
> 1. **请合理使用方法，不要胡子眉毛一把抓把代码全部写在main方法里。**
> 2. **最高分和最低分可能有多个，但只需要去掉其中一个即可（也就是说平均成绩要除以8）**
> 3. 建议给出下面的三个方法：
>    1. 求数组中元素最大值的方法
>    2. 求数组中元素最小值的方法
>    3. 求数组中元素平均分的方法

```java
package com.cskaoyan.homework.day03;

import java.util.Scanner;

public class Solution2 {
    public static double[] getScore() {
        double[] score = new double[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入10个评委给出的成绩");
        for (int i = 0; i < score.length; i++) {
            score[i] = scanner.nextDouble();
        }
        return score;
    }

    public static int getMaxIndex(double[] arr) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }


    public static int getMinIndex(double[] arr) {
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static double[] removeByIndex(int index, double[] arr) {
        double[] arr2 = new double[arr.length - 1];
        for (int i = 0; i < arr2.length; i++) {
            if (i < index) {
                arr2[i] = arr[i];
            } else
                arr2[i] = arr[i + 1];
        }
        return arr2;
    }

    public static double getAverage(double[] arr) {
        double sum = 0;
        for (double v : arr)
            sum += v;
        return sum / arr.length;
    }

    public static void main(String[] args) {
        double[] score = getScore();
        double[] usefulScore = removeByIndex(getMinIndex(removeByIndex(getMaxIndex(score), score)), removeByIndex(getMaxIndex(score), score));
        double average = getAverage(usefulScore);
        System.out.println("去掉一个最小值和一个最大值后的最终成绩为：" + average);
    }
}
```
![2.2](D:\code\homework\image\day03\2.2.png)

