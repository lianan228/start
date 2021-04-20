package com.longxi.www.base;

public class Demo05 {
    public static void main(String[] args) {
        //运算符
        /*
        + - * / % ++ --
        =
        < > <= >= == != instanceof
        && || !
        & | ~ >> << >>>
        ? :
        += -= *= /=
         */


        int a = 1;
        int b = 2;
        char c = '1';
        char d = '2';
        System.out.println(a+b);//3
        System.out.println((char) c+d);//99


        //自增 自减

        int e = 3;
        int f = e++;
        int g = ++e;
        System.out.println(e);//5
        System.out.println(f);//3
        System.out.println(g);//5

        //幂运算 2^3   2*2*2=8
        //Math
        double h = Math.pow(2,3);
        System.out.println(h);

        //逻辑运算符
        //与(and) 或(or) 非(取反)
        boolean m = true;
        boolean n = false;

        System.out.println("m&&n:"+(m && n));
        System.out.println("m||n:"+(m || n));
        System.out.println("!(m&&n):"+!(m && n));

        //注意短路运算  &&



        //位运算
        /*
        A = 0011 1100
        B = 0000 1101
        -------------
        A&B:0000 1100
        A|B:0011 1101
        A^B:0011 0001
        ~B :1111 0010

        2 * 8 = 16    2*2*2*2
        <<左移    >>右移
        << *2
        >> /2
         */
        System.out.println(2<<3);//16


        //条件运算符
        int x = 1;
        int y = 2;
        int z = 0;
        z = a > b ? a : b;
        System.out.println(z);

        //字符串连接符   +
        System.out.println(""+x+y);//12s
        System.out.println(x+y+"");//3
    }
}
