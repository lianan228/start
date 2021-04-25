package com.longxi.www.OOP.Demo05;

public class Application {
    public static void main(String[] args) {
        Student student = new Student();
        student.say();//说了一句话


        //如果money修饰符为private  则无法调用
        student.setMoney(100);
        System.out.println(student.getMoney());//100
    }
}
