package com.longxi.www.Array.Map;

import java.util.*;

/*
ArrayList集合，存储三个元素，每一个元素都是HashMap，让每一个HashMap的键和值
都是String，并遍历

思路
1.创建ArrayList集合
2.创建HashMap集合，并添加键值对元素
3.把HashMap作为元素添加到ArrayList集合
4.遍历ArrayList集合
 */
public class Demo06 {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> arrayList = new ArrayList<HashMap<String,String>>();

        HashMap<String,String> hashMap = new HashMap<String,String>();

        hashMap.put("涟安", "lianan");
        hashMap.put("珑玺", "longxi");

        HashMap<String,String> hashMap1 = new HashMap<String,String>();

        hashMap1.put("小陈", "xiaochen");
        hashMap1.put("小梨", "xiaoli");

        arrayList.add(hashMap);
        arrayList.add(hashMap1);


        //三种遍历方式
        Iterator<HashMap<String, String>> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            HashMap<String, String> next = iterator.next();
            System.out.println(next);
            //{涟安=lianan, 珑玺=longxi}
            //{小陈=xiaochen, 小梨=xiaoli}
        }

        for(HashMap<String,String> hm : arrayList){
            Set<String> keySet = hm.keySet();
            for(String key : keySet){
                String value = hm.get(key);
                System.out.println(key+','+value);
                //涟安,lianan
                //珑玺,longxi
                //小陈,xiaochen
                //小梨,xiaoli
            }
        }
        for (HashMap<String,String> hm1 : arrayList){
            Set<Map.Entry<String, String>> entrySet = hm1.entrySet();
            for(Map.Entry<String, String> me : entrySet){
                String key = me.getKey();
                String value = me.getValue();
                System.out.println(key+','+value);
                //涟安,lianan
                //珑玺,longxi
                //小陈,xiaochen
                //小梨,xiaoli
            }
        }
    }
}
