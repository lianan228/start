package com.longxi.www.OOP.Demo01;

public class Person {

    String name;
    //一个类即使什么都不写，它也会存在一个方法
    //显示的定义构造器


    //1.使用new关键字  本质是在调用构造器
    //2.实例化初始值
    public Person(){ }

    //有参构造
    //一旦定义了有参构造  无参构造必须显示定义.

    //重载
    public Person(String name){
        this.name = name;
    }

    //alt+insert
}



/*
构造器：
1.和类名相同
2.没有返回值
作用：
1.new 本质在调用构造器
2.初始化对象
注意点
1.定义了有参构造之后，如果想使用无参构造，显示的当以一个无参的构造
alt+insert
 */
