package com.longxi.www.ArrayList.More.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
集合的遍历
迭代器 Iterator
 */
public class Demo03 {
    public static void main(String[] args) {
        //next()  hasNext()
        Collection<String> c = new ArrayList<String>();

        c.add("hello");
        c.add("world");
        c.add("java");

        Iterator<String> iterator = c.iterator();
        //System.out.println(iterator.next());//hello

//        if (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        while (iterator.hasNext()){
            //System.out.println(iterator.next());//hello world java
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
