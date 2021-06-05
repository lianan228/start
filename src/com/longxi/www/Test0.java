package com.longxi.www;

import com.longxi.www.OOP.Demo05.A;
import com.longxi.www.OOP.Demo05.B;
import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 */
public class Test0{
    public static void main(String[] args) {
        Account account = new Account("结婚基金",100);
        Drawing you = new Drawing(account,50,"你");
        Drawing her = new Drawing(account,50,"她");

        you.start();
        her.start();

    }


}

class Account{
    int money;
    String name;
    public Account(String name,int money){
        this.money = money;
        this.name = name;
    }
}

class Drawing extends Thread{
    Account account;
    int drawingMoney;
    int nowMoney;

    public Drawing(Account account,int drawingMoney,String name){
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    @Override
    public void run() {
        synchronized (account){
            if(account.money - drawingMoney < 0){
                System.out.println(Thread.currentThread().getName() + "没取到钱");
                return;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            account.money -= drawingMoney;
            nowMoney += drawingMoney;
            System.out.println(account.name+"余额为"+account.money);
            System.out.println(this.getName()+"拿到了"+nowMoney+"钱");

        }
    }
}

















