package com.longxi.www.OOP.Demo10;

public class Outer {

    private int id = 10;
    public void out(){
        System.out.println("外部类方法");
    }
    //访问外部类的私有变量
    public class Inner{
        public void in(){
            System.out.println("内部类方法");
        }

        public void getID(){
            System.out.println(id);
        }
    }
}
