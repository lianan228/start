package com.longxi.www.Thread.t2;
/*
setDaemon(boolean on)
 */
public class Demo04_1 {

    public static void main(String[] args) {
        God god = new God();
        You you = new You();


        Thread thread = new Thread(god);
        thread.setDaemon(true);//默认是false


        thread.start();//上帝守护线程启动
        new Thread(you).start();//用户线程启动

        //虚拟机停止需要一定的时间

    }

}


//上帝
class God implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println("上帝保佑着你");
        }
    }
}

//你
class You implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 36500; i++) {
            System.out.println("你开心的活着");
        }
        System.out.println("狗带");
    }
}