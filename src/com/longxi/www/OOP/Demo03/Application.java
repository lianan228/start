package com.longxi.www.OOP.Demo03;

public class Application {

    public static void main(String[] args) {

        Pet dog = new Pet();
        dog.name= "旺财";
        dog.age = 3;
        dog.shout();

        Pet cat = new Pet();
        cat.name = "小花";
        cat.age = 2;
        cat.shout();

        System.out.println(dog.name);
        System.out.println(dog.age);

        System.out.println(cat.name);
        System.out.println(cat.age);
    }
}
