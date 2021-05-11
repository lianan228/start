package com.longxi.www.JieKou.Demo05;

public class BasketballSportMan extends SportMan{
    public BasketballSportMan() {
    }

    public BasketballSportMan(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃饭");
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习篮球");
    }
}
