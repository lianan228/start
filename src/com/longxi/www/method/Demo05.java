package com.longxi.www.method;

//可变参数

public class Demo05 {
    public static void main(String[] args) {
        Demo05 demo05 = new Demo05();
        demo05.test(1,2);
    }
    // ...只能放在最后面，前面都是普通参数
    public void test(int...i){
        System.out.println(i[0]);//1
        System.out.println(i[1]);//2
    }
}
