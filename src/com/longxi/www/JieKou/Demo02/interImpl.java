package com.longxi.www.JieKou.Demo02;

public class interImpl implements inter{
    @Override
    //重写方法
    public void fun() {
        System.out.println("fun");
    }

    public static void main(String[] args) {
        inter inter = new interImpl();
        System.out.println(inter.num);
        System.out.println(inter.num2);
        //10
        //20
        System.out.println(inter.num);//可以直接访问
        //public static final


    }
}
