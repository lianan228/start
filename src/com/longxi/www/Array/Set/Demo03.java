package com.longxi.www.Array.Set;

import java.util.HashSet;

/*
HashSet集合
 */
public class Demo03 {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<String> hashSet = new HashSet<String>();

        hashSet.add("hello");
        hashSet.add("world");
        hashSet.add("java");

        for(String s : hashSet){
            System.out.println(s);
        }
    }
}
