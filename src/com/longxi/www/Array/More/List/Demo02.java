package com.longxi.www.Array.More.List;

import java.util.ArrayList;
import java.util.List;

/*
1.add(int index,E element);
2.remove(int index);
3.set(int index,E element);
4.get(int index);
 */
public class Demo02 {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");

        //1
        list.add(1,"javaee");
        //[hello, javaee, world, java]

        list.remove("java");
        //[hello, javaee, world]

        list.set(0,"hi");
        //[hi, javaee, world]

//        System.out.println(list.get(0));//hi
//        System.out.println(list);

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

    }
}
