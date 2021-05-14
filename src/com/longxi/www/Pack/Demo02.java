package com.longxi.www.Pack;

/*
自动装箱和拆箱

装箱:把基本数据类型转换为对应的包装类类型
拆箱:把包装类类型转换为对应的基本数据类型
 */
public class Demo02 {
    public static void main(String[] args) {
        //装箱
        Integer integer = Integer.valueOf(100);
        Integer ii = 100;//自动装箱 Integer.valueOf(100);

        //拆箱
        //ii+=200;
        ii = ii.intValue() + 200;
        ii += 200;//自动拆箱

        Integer iii = null;
        if (iii != null) {
            iii += 300;
        }

        //只要是对象，在使用前就必须进行部位null的判断
    }
}
