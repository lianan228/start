package com.longxi.www.Thread.t1;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
倒计时
 */
public class Demo10 implements Runnable{

    private int num = 10;

    @Override
    public void run() {
        while (true){
            if (num<0){
                break;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("倒计时"+num--+"秒");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //Demo10 d = new Demo10();

//        Thread t1 = new Thread(d);
//
//        t1.start();

        //new Thread(d).start();
        Date startTime = new Date(System.currentTimeMillis());

        while (true){
            Thread.sleep(1000);
            System.out.println(new SimpleDateFormat("HH:mm:ss").format(startTime));
            startTime = new Date(System.currentTimeMillis());//更新时间
        }
    }
}
