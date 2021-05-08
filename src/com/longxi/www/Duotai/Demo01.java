package com.longxi.www.Duotai;

public class Demo01 {
    public static void main(String[] args) {
        //用父类引用指向子类对象

//        Animal animal = new Cat();
//        animal.eat();//吃鱼


        //成员变量   编译看左边，执行看左边
        //成员方法   编译看左边，执行看右边

        //成员方法有重写，成员变量没有

        Use use = new Use();
        Cat cat = new Cat();
        cat.eat();

        Dog dog = new Dog();
        dog.eat();
    }
}
