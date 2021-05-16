package com.longxi.www.Array.Set;

import java.util.HashSet;
import java.util.Set;

/*
    Set集合
        1.没有带索引的方法
        2.不包含同样元素的集合

    HashSet:对集合的迭代顺序不做任何保证
 */
public class Demo01 {
    public static void main(String[] args) {
        //存储字符串并遍历
        Set<String> set = new HashSet<String>();

        set.add("hello");
        set.add("world");
        set.add("java");
        //world
        //java
        //hello
        set.add("world");//没有添加进去，不包含重复元素

        //遍历
        for(String s : set){
            System.out.println(s);
        }
    }
}
