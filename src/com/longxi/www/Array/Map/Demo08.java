package com.longxi.www.Array.Map;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
统计字符串中每个字符出现的次数
 */
public class Demo08 {
    public static void main(String[] args) {
        HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
        System.out.println("输入字符串:");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        //遍历
        for (int i = 0; i < line.length(); i++) {
            char key = line.charAt(i);

            Integer value = hashMap.get(key);

            if(value == null){
                hashMap.put(key,1);
            }else {
                value++;
                hashMap.put(key,value);
            }
        }
        StringBuilder sb = new StringBuilder();
        Set<Character> keySet = hashMap.keySet();
        for (Character key : keySet){
            Integer value = hashMap.get(key);
            sb.append(key).append("(").append(value).append(")");
        }

        String result = sb.toString();

        System.out.println(result);
    }
}
