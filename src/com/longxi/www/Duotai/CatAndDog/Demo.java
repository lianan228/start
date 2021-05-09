package com.longxi.www.Duotai.CatAndDog;

public class Demo {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.setName("加菲");
        animal.setAge("5");
        System.out.println(animal.getName()+animal.getAge());

        animal.eat();
        animal = new Cat("加菲","5");
        System.out.println(animal.getName()+ animal.getAge());
        animal.eat();
        //加菲5
        //猫吃鱼
        //加菲5
        //猫吃鱼
    }
}
