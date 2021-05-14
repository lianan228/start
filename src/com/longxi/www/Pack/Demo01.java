package com.longxi.www.Pack;

import com.longxi.www.JieKou.Demo04.Inter1;

import java.util.Arrays;

/*
String split(String regex);
 */
public class Demo01 {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";

        //把字符串的数据存进一个int类型数组中
        String[] s1 = s.split(" ");
//        for (int i = 0; i < s1.length; i++) {
//            System.out.println(s1[i]);//91 27 46 38 50
//        }
        //定义一个int数组，把Sting[]数组中的每一个元素存储进int数组中
        int[] ints = new int[s1.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(s1[i]);
            //Integer.parseInt();把一个字符串类型的数据转换成一个int类型的数据
        }

        //对int数组进行排序
        Arrays.sort(ints);

        //把排序后的int数组中的元素进行拼接得到一个字符串，StringBuilder来实现
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < ints.length; i++) {
            if(i == ints.length-1){
                stringBuilder.append(ints[i]);
            }else {
                stringBuilder.append(ints[i]).append(" ");
            }
        }

        String result = stringBuilder.toString();
        System.out.println(result);//27 38 46 50 91
    }
}
