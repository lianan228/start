package com.longxi.www.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

//创建一个存储字符串的集合，存储3个字符串元素，实用程序实现在控制台遍历该集合
public class Demo03 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("涟安");
        arrayList.add("珑玺");
        arrayList.add("圆圆");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        //涟安
        //珑玺
        //圆圆
    }
}
