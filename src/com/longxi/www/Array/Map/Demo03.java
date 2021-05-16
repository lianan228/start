package com.longxi.www.Array.Map;

import java.util.HashMap;
import java.util.Map;

/*
Map的获取功能

get(Object key)     根据键获取值
keySet()            获取所有键的集合
values()            获取所有值的集合

 */
public class Demo03 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();

        map.put("小陈","涟安");

        //get(Object key)     根据键获取值
        System.out.println(map.get("小陈"));//涟安

        //keySet()            获取所有键的集合
        System.out.println(map.keySet());//[小陈]

        //values()            获取所有值的集合
        System.out.println(map.values());//[涟安]
    }
}
