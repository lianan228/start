package com.longxi.www.OOP.Demo06;

public class Application {
    public static void main(String[] args) {
        //new Person();

        //可以指向的引用类型不确定

        //Student能调用的方法都是自己的或者继承父类（Person）的
        Student s1 = new Student();
        //父类的引用指向子类的类型

        //Person父类型，虽然可以指向子类，但是不能调用子类独有的方法
        Person s2 = new Student();
        Object s3 = new Student();

        Person person = new Teacher();

        person.run();
        //不能调用子类独有的方法  go为Teacher类的私有方法
        //person.go();
        s2.run();
        s1.run();
        //都是song
        //子类重写了父类的方法,执行子类方法
        //如果子类重写了父类的方法则调用子类
        //否则调用父类的方法

        //对象能执行哪些方法主要看对象左边的类型和右边关系不大
        ((Student)s2).eat();//强制转换

    }
}



/*
多态注意事项
    1.多态是方法的多态，属性没有多态
    2.父类和子类，有联系，类型转换异常
    3.多态存在的条件：继承关系，方法需要重写，父类引用指向子类对象father f1 => new Son();

    1.static方法属于类 不属于实例
    2.final无法被重写
    3.private方法 私有方法无法被重写
    //以上实现不了多态
 */


/*
1.父类的引用指向子类的对象
2.把子类转换为父类，向上转型，不用强制转换
3.把父类转换为子类，向下转型，需要强制转换，可能会丢失父类的一些方法
4.方便方法的调用，减少重复的代码！

抽象：封装、继承、多态！
抽象类
接口
 */