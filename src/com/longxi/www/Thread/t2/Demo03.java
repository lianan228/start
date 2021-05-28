package com.longxi.www.Thread.t2;

/*
获取线程优先级

public final int getPriority():返回此线程的优先级
public final void setPriority(int newPriority):更改此线程的优先级

 */
public class Demo03 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ':' + i);
        }
    }

    public static void main(String[] args) {

        Demo03 my1 = new Demo03();
        Demo03 my2 = new Demo03();
        Demo03 my3 = new Demo03();

        my1.setName("高铁");
        my2.setName("飞机");
        my3.setName("汽车");

        //public final int getPriority():返回此线程的优先级
        //优先级

//        System.out.println(my1.getPriority());//5
//        System.out.println(my2.getPriority());//5
//        System.out.println(my3.getPriority());//5

        //默认优先级为5


        //public final void setPriority(int newPriority):更改此线程的优先级

        //设置优先级
        //max=10 min=1


//        System.out.println(Thread.MAX_PRIORITY);//10
//        System.out.println(Thread.MIN_PRIORITY);//1
//        System.out.println(Thread.NORM_PRIORITY);//5

        //线程优先级仅仅代表争夺cpu时间片的强度

        my1.setPriority(5);
        my2.setPriority(10);
        my3.setPriority(1);


        my1.start();
        my2.start();
        my3.start();

    }
}
