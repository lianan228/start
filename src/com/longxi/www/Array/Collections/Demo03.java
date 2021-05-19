package com.longxi.www.Array.Collections;

import java.util.ArrayList;
import java.util.Collections;

/*\
模拟斗地主
模拟洗牌发牌，看牌

1.创建一个牌盒，ArrayList集合
2.往牌盒里装牌
3.洗牌 Collections的shuffle方法实现
4.发牌，遍历集合
5.三个玩家分别遍历自己的牌
 */
public class Demo03 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        /*
        装牌
        ♦2♦3....
        ♣2...
        ♥2 ♥A..
        ♠A....
        Bg:大王  Sg:小王
         */
        //花色数组
        String[] colors = {"♦","♣","♥","♠"};
        //点数数组
        String[] numbers = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        //拼接操作
        for(String color : colors){
            for(String number : numbers){
                arrayList.add(color + number);
            }
        }
        arrayList.add("Bg");
        arrayList.add("Sg");

        //洗牌
        Collections.shuffle(arrayList);

        //三个玩家
        ArrayList<String> lian = new ArrayList<String>();
        ArrayList<String> xian = new ArrayList<String>();
        ArrayList<String> chen = new ArrayList<String>();
        //底牌
        ArrayList<String> dp = new ArrayList<String>();


        for (int i = 0; i < arrayList.size(); i++) {
            String poker = arrayList.get(i);
            if(i>=arrayList.size()-3){
                //i从小到大排列
                dp.add(poker);
                //如果剩下的牌到了最后三张，则添加到底牌
            //索引对三取余，如果等于1则发给第一个玩家
            }else if(i%3==0){
                lian.add(poker);
            }else if(i%3==1){
                xian.add(poker);
            }else {
                chen.add(poker);
            }
        }
        //看牌
        lookPoker("涟安",lian);
        lookPoker("珑玺",xian);
        lookPoker("小陈",chen);
        lookPoker("底牌",dp);
        //System.out.println(arrayList);
    }
    //看牌的方法
    public static void lookPoker(String name,ArrayList<String> arrayList){
        System.out.println(name+"的牌是:");
        for(String poker : arrayList){
            System.out.print(poker+' ');
        }
        System.out.println();
    }
}
