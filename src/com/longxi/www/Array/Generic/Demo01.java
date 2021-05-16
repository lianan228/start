package com.longxi.www.Array.Generic;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
泛型
参数化类型
用在类，方法，接口中

定义格式<>：指定一种类型的格式，形参
       <类型一，类型二……>:
 */
public class Demo01 {
    public static void main(String[] args) {
        Collection<String> collation = new ArrayList<String>();

        collation.add("hello");
        collation.add("world");
        //collation.add(100);
        //会报错   因为泛型中<String>

        Iterator<String> iterator = collation.iterator();

        while (iterator.hasNext()){
//            Object next = iterator.next();
//            System.out.println(next);
            String s = (String) iterator.next();
            System.out.println(s);
        }
    }
}
