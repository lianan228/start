package com.longxi.www.Thread.t2;
/*
案例：卖票
共有100张票，有三个卖票窗口，设计一个程序模拟该电影院卖票
 */
public class Demo07 implements Runnable{
    private int tickets = 1000;
    //private final Object obj = new Object();//锁
    private int x = 0;

    @Override
    public void run() {
        while (true){

            //ticket = 100;
            //t1,t2,t3
            //假设t1线程抢到了CPU的执行权
            if(x % 2 == 0){

                //if else 变成双窗口工作，提高效率

                synchronized(this){

                    //此处应该用同一把锁，在外面创建好
                    //同步方法的锁，this是对象
                    if(tickets > 0){
                        //sleep方法模拟出票时间
                        try {
                            Thread.sleep(0);
                            //t1线程休息100毫秒
                            //t2线程此时抢到了CPU的执行权，t2线程开启，执行到sleep的时候t2线程休息100毫秒
                            //t3线程此时抢到了CPU的执行权，t3线程开启，执行到sleep的时候t3线程休息100毫秒
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        //假设线程按照顺序醒过来
                        //t1抢到CPU的执行权，在控制台输出内容
                        System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets+"张票");

                        //还没有ticket--时 t2抢到CPU的执行权，在控制台输出内容 此时tickets = 100，t3同理
                        //所以会出现三次出售第100张票的情况
                        tickets--;
                        //如果这三个线程按照顺序来，这里执行了三次--的操作，最终票变成了97
                    }

                }
            }else {
//                synchronized(obj){  //此处应该用同一把锁，在外面创建好
//                    if(tickets > 0){
//                        //sleep方法模拟出票时间
//                        try {
//                            Thread.sleep(0);
//                            //t1线程休息100毫秒
//                            //t2线程此时抢到了CPU的执行权，t2线程开启，执行到sleep的时候t2线程休息100毫秒
//                            //t3线程此时抢到了CPU的执行权，t3线程开启，执行到sleep的时候t3线程休息100毫秒
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//
//                        //假设线程按照顺序醒过来
//                        //t1抢到CPU的执行权，在控制台输出内容
//                        System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets+"张票");
//
//                        //还没有ticket--时 t2抢到CPU的执行权，在控制台输出内容 此时tickets = 100，t3同理
//                        //所以会出现三次出售第100张票的情况
//                        tickets--;
//                        //如果这三个线程按照顺序来，这里执行了三次--的操作，最终票变成了97
//                    }
//
//                }
                sellTickets();
            }
        }
    }

    //卖票方法
//    private void sellTickets() {
//        synchronized(obj){  //此处应该用同一把锁，在外面创建好
//            if(tickets > 0){
//                //sleep方法模拟出票时间
//                try {
//                    Thread.sleep(0);
//                    //t1线程休息100毫秒
//                    //t2线程此时抢到了CPU的执行权，t2线程开启，执行到sleep的时候t2线程休息100毫秒
//                    //t3线程此时抢到了CPU的执行权，t3线程开启，执行到sleep的时候t3线程休息100毫秒
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//                //假设线程按照顺序醒过来
//                //t1抢到CPU的执行权，在控制台输出内容
//                System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets+"张票");
//
//                //还没有ticket--时 t2抢到CPU的执行权，在控制台输出内容 此时tickets = 100，t3同理
//                //所以会出现三次出售第100张票的情况
//                tickets--;
//                //如果这三个线程按照顺序来，这里执行了三次--的操作，最终票变成了97
//            }
//
//        }
//    }

    //同步锁定方法
    private synchronized void sellTickets() {
            if(tickets > 0){
                //sleep方法模拟出票时间
                try {
                    Thread.sleep(0);
                    //t1线程休息100毫秒
                    //t2线程此时抢到了CPU的执行权，t2线程开启，执行到sleep的时候t2线程休息100毫秒
                    //t3线程此时抢到了CPU的执行权，t3线程开启，执行到sleep的时候t3线程休息100毫秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //假设线程按照顺序醒过来
                //t1抢到CPU的执行权，在控制台输出内容
                System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets+"张票");

                //还没有ticket--时 t2抢到CPU的执行权，在控制台输出内容 此时tickets = 100，t3同理
                //所以会出现三次出售第100张票的情况
                tickets--;
                //如果这三个线程按照顺序来，这里执行了三次--的操作，最终票变成了97
            }
    }


    public static void main(String[] args) {
        Demo07 myRunnable= new Demo07();

        Thread t1 = new Thread(myRunnable,"第一电影院");
        Thread t2 = new Thread(myRunnable,"第二电影院");
        Thread t3 = new Thread(myRunnable,"第三电影院");


        t1.start();
        t2.start();
        t3.start();

        //第100张票买了三次
        //出现了-1张票


        //问题原因
        //1.是否是多线程环境
        //2.是否有共享数据
        //3.是否有多条语句操作共享数据

        //解决办法
        //  把多条语句操作共享数据的代码块给锁起来，让任意时刻只能由要给线程执行即可
        //  同步代码块
        /*
        synchronized(任意对象){
            多条语句操作共享数据的代码
        }
         */



    }
}
