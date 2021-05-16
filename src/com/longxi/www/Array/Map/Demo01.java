package com.longxi.www.Array.Map;

import java.util.HashMap;
import java.util.Map;

/*
Map集合概述

Interface Map<K,V>   K:键的类型  V:值的类型
将键映射到值的对象，不能包含重复的键，每个键可以映射到最多一个值
举例:学生的学号和姓名
    001 涟安
    002 珑玺

创建Map集合的对象
多态的方式
具体的实现类HashMap
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<String,String>();

        //put(K,V)
        map.put("001","涟安");
        map.put("002","珑玺");
//        map.put("002","longxi");//会替代掉“珑玺”这个元素

        System.out.println(map);//{001=涟安, 002=珑玺}
    }
}
