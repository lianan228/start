package com.longxi.www.StringBuilder;

public class Demo02 {
    public static void main(String[] args) {
        //创建对象
        StringBuilder stringBuilder = new StringBuilder();

        //stringBuilder.append() 添加对象并返回对象本身

        //StringBuilder stringBuilder1 = stringBuilder.append("hello");
        //System.out.println("stringBuilder:"+stringBuilder);
        //System.out.println("stringBuilder:"+stringBuilder1);
        stringBuilder.append("world");
        System.out.println(stringBuilder);//world
        //直接追加内容即可

        stringBuilder.append(1).append(2);//链式编程

        //反转
        stringBuilder.reverse();
        System.out.println(stringBuilder);//21dlrow

    }
}
