package com.longxi.www.Date;

import java.util.Date;

/*
Date代表了一个特定的时间，精确到毫秒
 */
public class Demo01 {
    public static void main(String[] args) {
        //public Date();
        Date d1 = new Date();
        System.out.println(d1);//Thu May 13 19:17:54 CST 2021

        //public Date(long date); 分配一个Date对象，并将其初始化为表示从标准基准时间指定的毫秒数
        long date = 1000*60*60;
        Date d2 = new Date(date);
        System.out.println(d2);//Thu Jan 01 09:00:00 CST 1970
    }
}
