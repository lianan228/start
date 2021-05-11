package com.longxi.www.JieKou.Demo03;

public class Cat extends Animal implements Jumping{

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void jump() {
        System.out.println("猫跳高");
    }
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
}
