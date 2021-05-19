package com.longxi.www.Array.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
概述
是针对集合操作的工具类

常用方法
sort 升序
reverse 反转
shuffle 随机置换
 */
public class Demo01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(30);
        list.add(20);
        list.add(50);
        list.add(10);
        list.add(40);

        Collections.shuffle(list);
        Collections.sort(list);
        Collections.reverse(list);//反转并非倒序
        System.out.println(list);
    }
}
