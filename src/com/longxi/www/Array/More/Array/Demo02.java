package com.longxi.www.Array.More.Array;

/*
常用方法
    1.remove(Object o) 删除指定元素，返回删除是否成功
    2.remove(int index) 删除指定索引处的元素，返回被删除的元素
    3.set(int index，E element) 修改指定索引处的元素，返回被修改的元素
    4.get(int index) 返回指定索引处的元素
    5.size()  返回集合中元素的个数
 */

import java.util.ArrayList;

public class Demo02 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> arrayList = new ArrayList<>();

        //添加元素
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");

        //remove(Object o)
        //System.out.println(arrayList.remove("world"));
        //true
        //[hello, java]

        //remove(int index)
        //System.out.println(arrayList.remove(0));
        //hello
        //[world, java]

        //set(int index，E element)
        //System.out.println(arrayList.set(0,"good"));
        //hello
        //[good, world, java]

        //get(int index)
        //System.out.println(arrayList.get(0));
        //hello

        //size()
        //System.out.println(arrayList.size());
        //3

        //输出集合
        System.out.println(arrayList);
    }
}
