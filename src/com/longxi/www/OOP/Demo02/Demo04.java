package com.longxi.www.OOP.Demo02;

public class Demo04 {
    //值传递
    /*public static void main(String[] args){
        int a = 1;
        System.out.println(a);//1

        new Demo04().change(a);

        System.out.println(a);//1
    }
    public void change(int a){
        a = 10;
    }

     */
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);//null

        Demo04.change(person);
        System.out.println(person.name);//珑玺
    }


    public static void change(Person person){
        //person 是一个对象  指向的是 Person person = new Person();这是要给具体的人，可以被改变！
        person.name = "珑玺";
    }
}
//定义了一个Person类 有一个属性 name
class Person{
    String name;//默认为 null
}














