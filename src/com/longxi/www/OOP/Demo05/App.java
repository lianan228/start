package com.longxi.www.OOP.Demo05;

public class App {
    public static void main(String[] args) {
        A a = new A();
        a.test();//A=>test()


        B b = new A();//子类重写了父类的方法
        b.test();//A=>test()
    }
}

/*
重写：需要有继承关系，子类重写父类的方法！
    1.方法名必须相同
    2.参数列表必须相同
    3.修饰符：范围可以扩大，不能缩小  private -> Protected -> Default -> public
    4.抛出的异常：范围可以被缩小，但不能扩大！ ClassNotFoundException

重写  子类的方法和父类必须一致，方法体不同！


为什么需要重写？
    1.父类的功能子类不一定需要，或者不一定满足
    alt+insert ： override；
 */