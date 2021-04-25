package com.longxi.www.OOP.Demo07;
//static:
public class Student {

    private static int age;//静态变量
    private double score;//非静态变量

    public void run(){
        go();
    }
    public static void go(){

    }

    public static void main(String[] args) {
        Student student = new Student();
        //静态变量尽量使用类名来调用
        System.out.println(Student.age);

        System.out.println(student.score);
        System.out.println(student.age);


        Student student1 = new Student();
        student1.run();

        Student.go();
    }

}
