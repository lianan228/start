package com.longxi.www.ArrayList.More.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("world");//可重复

        //直接输出集合对象
        //System.out.println(list);//[hello, world, java]

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
