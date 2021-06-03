package com.longxi.www.Thread.t1;
/*
观测线程状态

NEW 尚未启动的线程处于此状态
RUNNABLE    在Java虚拟机中执行的线程处于此状态
BLOCKED     被阻塞等待监视器锁定的线程处于此状态
WAITING     等待另一个线程执行特定动作的线程处于此状态
TIMED-WAITING  正在等待另一个线程执行动作达到指定时间的线程处于此状态
TERMINATED  已经退出的线程处于此状态
 */
public class Demo12 {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }//TIMED_WAITING
                System.out.println("////////");
            }
        });

        //观察状态
        Thread.State state = thread.getState();

        System.out.println(state);//NEW

        //观察启动后
        thread.start();
        state =  thread.getState();
        System.out.println(state);//RUNNABLE

        while (state != Thread.State.TERMINATED) {//只要线程不终止
            Thread.sleep(100);
            state = thread.getState();//更新线程状态
            System.out.println(state);//输出状态
        }
        //TERMINATED

        //终止之后不能再次启动

        //要注意更新线程状态 state = thread.getState();
    }

}
