package com.longxi.www.Thread.t2.P_and_C;

public class Customer implements Runnable{

    private Box b;

    public Customer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        while (true){
            b.get();
        }
    }
}
