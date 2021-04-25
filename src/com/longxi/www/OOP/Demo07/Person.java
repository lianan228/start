package com.longxi.www.OOP.Demo07;

public class Person {
    //2.赋初始值
    {
        System.out.println("匿名代码块");
    }
    //1:只执行一次
    static {
        System.out.println("静态代码块");
        //静态代码块
    }

    public Person() {
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        Person person = new Person();

        //静态代码块
        //匿名代码块
        //构造方法
        Person person1 = new Person();

        //匿名代码块
        //构造方法


        //static只执行一次

    }
}
