package com.longxi.www.Array.Set;

import java.util.LinkedHashSet;

/*
LinkedHashSet集合概述和特点
顺序一致，有序
 */
public class Demo05 {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

        linkedHashSet.add("hello");
        linkedHashSet.add("world");
        linkedHashSet.add("java");
        //hello
        //world
        //java

        for(String s : linkedHashSet){
            System.out.println(s);
        }
    }
}
