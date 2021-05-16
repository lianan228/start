package com.longxi.www.Array.Generic;
/*
泛型接口
格式:修饰符interface 接口名<类型>
范例:public interface Generic<T> { }
 */
public class Demo04 {
    public static void main(String[] args) {
        Demo04Generic<String> g1 = new Demo04GenericImpl<String>();
        g1.show("涟安");
    }
}
