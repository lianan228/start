package com.longxi.www.StringBuilder;

//StringBuilder 和 String 相互转换
public class Demo03 {
    public static void main(String[] args) {
        //将StringBuilder转化为String
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hello");

        String s = stringBuilder.toString();
        System.out.println(s);//hello

        //将String转化为StringBuilder
        String s1 = "hello";
        StringBuilder stringBuilder1 = new StringBuilder(s1);
        System.out.println(stringBuilder1);
    }
}
