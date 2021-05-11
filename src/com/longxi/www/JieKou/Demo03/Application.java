package com.longxi.www.JieKou.Demo03;
/*
测试类
 */
public class Application {
    public static void main(String[] args) {
        Jumping jumping = new Cat();
        jumping.jump();//猫跳高

        Animal animal = new Cat();
        animal.setName("加菲");
        animal.setAge(5);
        System.out.println(animal.getAge()+ animal.getName());

        //Animal里没有eat方法
        //((Cat)animal).eat();
        animal = new Cat("加菲",5);
        ((Cat)animal).eat();
    }
}
