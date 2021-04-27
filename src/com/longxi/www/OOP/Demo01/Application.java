package com.longxi.www.OOP.Demo01;

//一个项目应该只存在一个main方法
public class Application {
    public static void main(String[] args) {


        //类：抽象的，实例化
        //类实例化会返回一个自己的对象
        //student对象就是一个Student类的具体实例
        Students xiaoming = new Students();
        Students xiaohong = new Students();


        xiaoming.name = "小明";
        xiaoming.age = 3;
        System.out.println(xiaoming.name);//小明
        System.out.println(xiaoming.age);//3


        //new 实例化了一个对象
        Person person1 = new Person("涟安");
        Person person = new Person("珑玺");
        System.out.println(person.name);//珑玺
        System.out.println(person1.name);//涟安
    }
}
