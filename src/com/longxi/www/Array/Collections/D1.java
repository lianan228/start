package com.longxi.www.Array.Collections;

import java.util.*;

/*
1.创建HashMap，键是编号，牌是值
2.创建ArrayList 存储编号
3.创建花色数组和点数数组
4.从0开始往HashMap里面存储编号，并存储对应的牌，同时往ArrayList里面存储编号
5.洗牌（改的是编号），用Collections的shuffle方法实现
6.发牌（发的也是编号，为了保证编号是排序的，创建TreeSet集合接收）
7.定义看牌方法（遍历TreeSet集合，获取编号，到HashMap集合找对赢的牌）
8.调用看牌方法
 */
public class D1 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        //花色数组
        String[] colors = {"♦","♣","♥","♠"};
        //点数数组
        String[] numbers = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        int index = 0;
        for(String number : numbers){
            for(String color : colors){
                hashMap.put(index,color+number);
                arrayList.add(index);
                index++;
            }
        }

        hashMap.put(index,"Sg");
        arrayList.add(index);
        index++;
        hashMap.put(index,"Bg");
        arrayList.add(index);

        Collections.shuffle(arrayList);

        TreeSet<Integer> lian = new TreeSet<Integer>();
        TreeSet<Integer> chen = new TreeSet<Integer>();
        TreeSet<Integer> lili = new TreeSet<Integer>();

        TreeSet<Integer> dp = new TreeSet<Integer>();

        for (int i = 0; i < arrayList.size(); i++) {
            int x = arrayList.get(i);
            if (i>=arrayList.size()-3){
                dp.add(x);
            }
            else if(i%3==0){
                lian.add(x);
            }else if(i%3==1){
                chen.add(x);
            }else {
                lili.add(x);
            }
        }

        lookPoker("LIANAN",lian,hashMap);
        lookPoker("XIAOCHEN",chen,hashMap);
        lookPoker("LILI",lili,hashMap);
        lookPoker("底牌",dp,hashMap);
    }
    public static void lookPoker(String name,TreeSet<Integer> treeSet,HashMap<Integer,String> hashMap){
        System.out.print(name+"的牌是");
        for(Integer key : treeSet){
            String poker = hashMap.get(key);
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
