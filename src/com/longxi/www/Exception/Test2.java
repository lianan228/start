package com.longxi.www.Exception;

import com.longxi.www.OOP.Demo05.A;

public class Test2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        new Test2().Test(1,0);

    }

    //假设这个办法中，处理不了这个异常，向上抛出异常
    public void Test(int a,int b) throws AbstractMethodError{
        if (b == 0) {
            throw new ArithmeticException();//一般在方法中使用
        }
        System.out.println(a / b);
    }
}
