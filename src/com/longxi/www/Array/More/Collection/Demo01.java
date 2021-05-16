package com.longxi.www.Array.More.Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
子接口 Set和List实现

创建Collection集合的对象
    多态的方式
    具体的实现类ArrayList
 */
public class Demo01 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        //添加数据
        c.add("hello");
        c.add("world");

        //输出集合对象
        System.out.println(c);//[hello, world]
        //重写了toString()方法
    }
}
