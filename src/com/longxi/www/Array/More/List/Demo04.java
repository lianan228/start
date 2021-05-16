package com.longxi.www.Array.More.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
增强for循环

实现Iterable接口的类，允许其对象成为增强型for语句的目标

格式
for(元素数据类型  变量名 : 数组或者Collection集合){
    //此处使用变量名即可，该变量就是元素
}
 */
public class Demo04 {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        for(int i : arr){
//            System.out.print(i);//12345
//        }
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");

        // 1
        for(String s : list){
            System.out.println(s);
            //hello
            //world
        }
        // 2
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

        // 3
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
