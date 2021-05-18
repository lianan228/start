package com.longxi.www.Array.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
创建一个HashMap集合，存储三个键值对元素，没有给键值对元素的键都是String，
值都是ArrayList，每一个ArrayList的元素都是String，并遍历
 */
public class Demo07 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hashMap = new HashMap<String,ArrayList<String>>();

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("23");
        //arrayList.add("24");
        hashMap.put("涟安",arrayList);
        hashMap.put("珑玺",arrayList);


        Set<String> keySet = hashMap.keySet();
        for (String key : keySet){
            System.out.println(key);
            ArrayList<String> value = hashMap.get(key);
            for(String s : value){
                System.out.println(s);
            }
            //涟安
            //23
            //珑玺
            //23
        }

        //entrySet
        Set<Map.Entry<String, ArrayList<String>>> entrySet = hashMap.entrySet();
        for(Map.Entry<String, ArrayList<String>> me : entrySet){
            String key = me.getKey();
            ArrayList<String> value = me.getValue();
            System.out.println(key);
            for(String s : value){
                System.out.println(s);
            }
        }
    }
}
