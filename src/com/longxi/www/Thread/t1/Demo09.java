package com.longxi.www.Thread.t1;
/*
休眠
 */

//模拟网络延时
//放大问题的发生性
public class Demo09 implements Runnable {

    private int tickets = 100;

    @Override
    public void run() {
        while (true) {
            if (tickets <= 0) {
                break;
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "-->拿到了第" + tickets-- + "张票");
        }
    }

    public static void main(String[] args) {
        Demo09 demo09 = new Demo09();

        new Thread(demo09, "小明").start();
        new Thread(demo09, "小红").start();
        new Thread(demo09, "小刚").start();
    }
}
