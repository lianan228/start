package com.longxi.www.JieKou.Demo01;

import com.longxi.www.JieKou.Demo01.Dog;
import com.longxi.www.JieKou.Demo01.Jumping;

public class Test {
    public static void main(String[] args) {
        //接口不能被实例化
        //Jumping jumping = new Jumping();
        //不可以

        //采用多态的形式实现接口
        Jumping jumping = new Cat();
        jumping.jump();//猫调高

        Jumping jumping1 = new Dog();
        jumping1.jump();//狗跳高

        //接口多态
            //参照多态的方式，通过实现类的对象实例化，这叫接口多态
            //抽象类多态，接口多态
    }
}
