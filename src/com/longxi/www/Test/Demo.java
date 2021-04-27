package com.longxi.www.Test;

public class Demo {

    public int a;
    private int[] arr;
    private double b = 40;

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    public void run(){
        System.out.println("父类run");
    }
}
