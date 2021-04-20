package com.longxi.www.Scanner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {

        //创建一个扫描对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请使用next方式接受：");

        //判断用户有没有输入字符串
        if (scanner.hasNext()){
            //使用next方式接收
            String str = scanner.next();
            System.out.println("输出的内容为:"+str);
            //以空格为结束
        }

        //关闭
        scanner.close();
    }
}
