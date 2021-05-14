package com.longxi.www.ArrayList.More.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
List集合子类特点
    ArrayList:底层数据结构是数组，查询快，增删慢
    LinkedList:底层数据结构是链表，查询慢，增删快
 */
public class Demo06 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");

        //增强for遍历
        for(String s : arrayList){
            System.out.println(s);
        }
        System.out.println("-------");
        //迭代器遍历
        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("-------");
        //普通for遍历
        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(i);
            System.out.println(s);
        }

        LinkedList<String> linkedList = new LinkedList<String>();

        //以下同理
    }
}
