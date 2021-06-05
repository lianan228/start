package com.longxi.www.Thread.t1;

public class UnsafeBank {
    public static void main(String[] args) {
        //账户
        Account account = new Account(100, "结婚基金");
        Drawing you = new Drawing(account, 50, "你");
        Drawing her = new Drawing(account, 50, "她");


        you.start();
        her.start();
    }

}

class Account {
    int money;
    String cardName;

    public Account(int money, String cardName) {
        this.money = money;
        this.cardName = cardName;
    }
}

//模拟取款
class Drawing extends Thread {
    Account account;  //账户
    int drawingMoney; //取钱
    int nowMoney;     //还剩多少钱

    public Drawing(Account account, int drawingMoney, String name) {
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    //取钱
    @Override
    public void run() {

        //锁定账户
        //锁的对象就是变化的量，需要增删改的对象
        synchronized (account){
            //判断有没有钱
            if (account.money - drawingMoney < 0) {
                System.out.println(Thread.currentThread().getName() + "钱不够，取不了");
                return;
            }

            //sleep放大问题的发生性
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            account.money = account.money - drawingMoney;
            nowMoney = nowMoney + drawingMoney;

            System.out.println(account.cardName + "余额为:" + account.money);
            //Thread.currentThread().getName() ==  this.getName()
            System.out.println(this.getName() + "手里的钱" + nowMoney);
        }

    }
}
