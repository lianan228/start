package com.longxi.www.JieKou.Demo03;

public class Dog extends Animal implements Jumping{

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(22);
    }

    @Override
    public void jump() {
        System.out.println(11);
    }
}
