package com.longxi.www.OOP.Demo05;
//父类
//Person  人
public class Person {

    private int money = 10000000;
    public void say(){
        System.out.println("说了一句话");
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
