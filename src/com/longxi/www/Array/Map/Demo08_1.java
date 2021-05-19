package com.longxi.www.Array.Map;

import java.util.*;
/*
TreeMap()使得答案字母变得有序
 */
public class Demo08_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        TreeMap<Character,Integer> hashMap = new TreeMap<Character,Integer>();

        for (int i = 0; i < line.length(); i++) {
            char key = line.charAt(i);

            Integer value = hashMap.get(key);

            if(value==null){
                hashMap.put(key,1);
            }else {
                value++;
                hashMap.put(key,value);
            }
        }

        StringBuilder sb = new StringBuilder();
        //遍历
        Set<Map.Entry<Character, Integer>> entries = hashMap.entrySet();
        for(Map.Entry<Character, Integer> me : entries){
            Character key = me.getKey();
            Integer value = me.getValue();
            //拼接
            sb.append(key).append("(").append(value).append(")");
        }
        //String string = sb.toString();

        System.out.println(sb);
    }
}
