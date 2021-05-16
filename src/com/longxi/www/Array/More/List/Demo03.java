package com.longxi.www.Array.More.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
ListIterator 列表迭代器
允许从任意方向遍历列表的列表迭代器，可以在迭代期间修改列表元素
 */
public class Demo03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            String next = listIterator.next();
            System.out.println(next);
        }
        System.out.println("--------------");

//        while (listIterator.hasPrevious()){
//            String previous = listIterator.previous();
//            System.out.println(previous);
//        }
        //逆向遍历很少用


        //添加元素  listIterator.add();
        ListIterator<String> ListIterator = list.listIterator();
        while (ListIterator.hasNext()){
            String next = ListIterator.next();
            if (next.equals("hello")){
                listIterator.add("javaee");
            }
        }
    }
}
