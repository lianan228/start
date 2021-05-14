package com.longxi.www.Date;

import java.util.Date;

/*
Date常用方法
getTime();获取的是日期对象从1970年1月1日00:00:00到现在的毫秒值
setTime();设置时间，给的是毫秒值
 */
public class Demo02 {
    public static void main(String[] args) {
        //创建日期对象
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);//1620905436746


        long time1 = System.currentTimeMillis();
        date.setTime(time1);
        System.out.println(date);//Thu May 13 19:33:04 CST 2021
    }
}
