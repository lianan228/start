package com.longxi.www.Array.Map;

import java.util.HashMap;
import java.util.Map;

/*
Map集合的基本功能

put(K,V)        添加元素
remove(k)       根据键删除值对元素
clear()         移除所有的键值对元素
containsKey()   判断集合是否包含指定的键
containsValue() 判断集合是否包含指定的值
isEmpty()       判断集合是否为空
size()          集合的长度，键值对的个数
 */
public class Demo02 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();

        map.put("珑玺","涟安");
        map.put("小陈","小梨");

//        map.remove("小陈");//{珑玺=涟安}

//        map.clear();//为空

        System.out.println(map.containsKey("小陈"));//ture

        System.out.println(map.containsValue("小梨"));//ture

        System.out.println(map.isEmpty());//false

        System.out.println(map.size());//2

        System.out.println(map);

    }
}
