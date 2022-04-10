package com.cskaoyan.homework.day14;
/*
    1：遍历获取字符串中的每一个字符 "abc001DEF"
    2：统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
*/

public class CharInString {
    public static void main(String[] args) {
        String str = "abc001DEF";
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+", ");
        }
        System.out.println("\n"+"\"abc001DEF\"中小写字符有："+statisticalUpperCharacter(str)+"个");
        System.out.println("\"abc001DEF\"中大写字符有："+statisticalLowerCharacter(str)+"个");
        System.out.println("\"abc001DEF\"中数字字符有："+statisticalNumberCharacter(str)+"个");
    }

//     2：统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
    static int statisticalUpperCharacter(String str){
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 112){
                res++;
            }
        }
        return res;
    }

    static int statisticalLowerCharacter(String str){
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90){
                res++;
            }
        }
        return res;
    }

    static int statisticalNumberCharacter(String str){
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57){
                res++;
            }
        }
        return res;
    }
}
