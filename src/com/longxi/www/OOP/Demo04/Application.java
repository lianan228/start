package com.longxi.www.OOP.Demo04;

/*
    1.提高程序的安全性，保护数据
    2.隐藏代码的实现细节
    3.统一接口
    4.提高系统的可维护性
 */

public class Application {
    public static void main(String[] args) {
        Students s1 = new Students();

        String name = s1.getName();

        s1.setName("珑玺");
        System.out.println(s1.getName());//珑玺

        s1.setAge(70);
        System.out.println(s1.getAge());//70

        s1.setSex('m');
        System.out.println(s1.getSex());//m

        s1.setId(0101);
        System.out.println(s1.getId());//0101
    }
}
