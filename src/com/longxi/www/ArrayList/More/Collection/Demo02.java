package com.longxi.www.ArrayList.More.Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
常用方法
boolean add(E e)        添加元素
boolean remove(Object 0)从集合中移除指定元素
void clear()            清空集合元素是
boolean contains(Object 0)判断集合中是否存在指定的元素
boolean isEmpty()       判断集合是否为空
int size()              集合的长度，元素的个数
 */
public class Demo02 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        c.add("hello");
        c.add("world");
        c.add("java");

        c.remove("hello");

        //c.clear();

        c.contains("java");//ture

        c.isEmpty();//false

        c.size();
        System.out.println(c);

    }
}
