package com.longxi.www.Array.Generic;

/*
可变参数
又称参数个数可变，用作方法的形参出现，那么方法参数个数就是可变的了
格式
    修饰符 返回值类型 方法名(数据类型...变量名){}
范例
    public static int sum(int...a){}
    可变参数放在最后
 */
public class Demo06 {
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 4));
    }

    public static int sum(int... a) {
        int sum = 0;

        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
