package com.longxi.www.Thread;

/*
龟兔赛跑
 */
public class Demo04 implements Runnable {

    //胜利者
    private static String Winner;

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            //模拟兔子休息
            try {
                if (Thread.currentThread().getName().equals("兔子") && i % 10 == 0) {
                    Thread.sleep(10);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //判断比赛是否结束
            boolean flag = gameOver(i);
            //如果比赛结束了就停止程序
            if (flag) {
                break;
            }

            System.out.println(Thread.currentThread().getName() + "--->跑了" + i + "步");
        }
    }


    //判断是否完成比赛
    private boolean gameOver(int steps) {
        //判断是否有胜利者
        if (Winner != null) {//已经存在胜利者
            return true;
        }
        {
            if (steps >= 100) {
                Winner = Thread.currentThread().getName();
                System.out.println("winner is " + Winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Demo04 race = new Demo04();

        new Thread(race, "兔子").start();
        new Thread(race, "乌龟").start();
    }
}
