package com.longxi.www.Array.Generic;

//public class Demo03Generic {
//    public void show(String s){
//        System.out.println(s);
//    }
//    public void show(Integer i){
//        System.out.println(i);
//    }
//    public void show(Boolean b){
//        System.out.println(b);
//    }
//}

//public class Demo03Generic<E> {
//    public void show(E e){
//        System.out.println(e);
//    }
//}
//泛型方法改进
public class Demo03Generic {
    public <E> void show(E e){
        System.out.println(e);
    }
}

//泛型方法在创建对象调用方法时，使用任意类型的参数
