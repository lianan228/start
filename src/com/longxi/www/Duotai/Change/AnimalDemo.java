package com.longxi.www.Duotai.Change;
/*
向上转型
    从子到父
    父类引用指向子类对象
向下转型
    从父到子
    父类引用转为子类对象
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //多态
        //向上转型
        Animal a = new Cat();//父类指向子类  子类对象赋值给父类
        a.eat();//猫吃鱼
//        a.playGame();

//        Cat cat = new Cat();
//        cat.playGame();

        //向下转型
        Cat cat = (Cat)a;
        cat.playGame();
    }
}
