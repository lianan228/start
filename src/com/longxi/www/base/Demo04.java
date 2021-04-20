package com.longxi.www.base;

public class Demo04 {
    //属性：变量
    //常量
    static final double PI = 3.14;
    //类变量 static
    static double salary = 2500;

    //实例变量:从属于对象
    System name;
    int age;
    //main方法
    public static void main(String[] args) {
        //变量
        int a = 1;
        int b = 2;
        int c = 3;

        String name = "珑玺";
        char d = 'a';
        double e = 1.1111;
        float f = 1.22f;
        //程序可读性
        System.out.println(a);

        //变量类型  变量名字 = new ....
        Demo04 demo04 = new Demo04();
        System.out.println(demo04.age);
        System.out.println(demo04.name);


        //类变量  static
        System.out.println(salary);


        //常量
        System.out.println(PI);
    }

}
