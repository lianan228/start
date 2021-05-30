package com.longxi.www.Thread.t1;
/*
线程状态

相关方法
setPriority(int newPriority)   更改线程优先级
sleep(long millis) 指定睡眠毫秒数
join() 等待该线程终止
yield()  暂停当前执行的线程对象，并执行其他的线程
interrupt  中断线程，别用这个方法
isAlive  测试线程是否处于活跃状态
 */


public class Demo08 implements Runnable {
    //测试stop
    //1.建议线程正常停止--->利用次数，不建议死循环。
    //2.建议使用标志位--->设置一个标志位
    //3.不要使用stop或者destroy等过时或JDK不建议使用的方法


    //设置标志位
    private boolean flag = true;

    @Override
    public void run() {
        int i = 0;
        while (flag) {
            System.out.println("run...Thread");
        }
    }


    //2.设置一个公开的方法停止线程，转换标志位
    public void stop() {
        this.flag = false;
    }

    public static void main(String[] args) {
        Demo08 d = new Demo08();

        new Thread(d).start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("main" + i);
            if (i == 900) {
                //调用stop方法切换标志位，让线程停止
                d.stop();
                System.out.println("线程停止");
            }
        }
    }
}
