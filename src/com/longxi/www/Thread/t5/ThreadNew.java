package com.longxi.www.Thread.t5;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
回顾总结
 */
public class ThreadNew {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new MyTread1().start();

        new Thread(new MyThread2()).start();

        FutureTask<Integer> futureTask = new FutureTask<Integer>(new MyThread());
        new Thread(futureTask).start();

        Integer integer = futureTask.get();
        System.out.println(integer);

        //myThread1
        //myThread2
        //myThread3
        //100

    }
}


//1.继承Thread
class MyTread1 extends Thread{
    @Override
    public void run() {
        System.out.println("myThread1");
    }
}

//2.实现Runnable接口
class MyThread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("myThread2");
    }
}

//3.实现Callable接口
class MyThread implements Callable<Integer> {

    @Override
    public Integer call() throws Exception{
        System.out.println("myThread3");
        return 100;
    }

}