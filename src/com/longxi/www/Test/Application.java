package com.longxi.www.Test;

public class Application {
    public static void main(String[] args) {
        Demo demo = new Demo01();

        //demo.setB(100);
        //System.out.println(demo.getB());//100
        System.out.println(demo.getB());//40
        demo.run();//父类方法被子类重写 变为 子类run


        //公有属性可直接被调用
        demo.a = 1;
        System.out.println(demo.a);//1


    }
}
