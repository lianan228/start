package com.longxi.www;

import com.longxi.www.OOP.Demo05.A;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test0 {
    public static void main(String[] args) {

    }
}

class Producer extends Thread{
    SynContainer container;
    public Producer(SynContainer Container){
        this.container = Container;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            container.push(new Chicken(i));
        }
    }
}

class Customer extends Thread{

}

class Chicken{
    int id;

    public Chicken(int id) {
        this.id = id;
    }
}

class SynContainer{
    Chicken[] chickens = new Chicken[10];
    int count = 0;

    public synchronized void push(Chicken chicken){

    }
}