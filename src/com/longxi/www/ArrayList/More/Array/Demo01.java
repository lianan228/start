package com.longxi.www.ArrayList.More.Array;

import java.util.ArrayList;

//集合
//提供一种存储空间可变的存储模型，存储的数据容量可以发生改变
//集合类有很多
//ArrayList<E>
//可调整大小的数组实现
//<E> 是一种特殊的数据类型，泛型
/*
出现E的地方我们使用引用数据类型替换即可
举例: ArrayList<String>,ArrayList<Student>
 */
public class Demo01 {
    //添加方法

    public static void main(String[] args) {
        //创建一个空的集合对象
        ArrayList<String> array = new ArrayList<String>();

        //追加方法一
        //System.out.println(array.add("hello"));
        array.add("hello");
        array.add("world");

        //追加方法二  指定位置添加指定元素
        array.add(1,"java");
        //[hello, java, world]
        //之前索引为1的元素顺次后移
        array.add(3,"javaee");
        //如果没有index:3  则不能直接添加index:4
        //array.add(4,"java se");
        //IndexOutOfBoundsException

        //输出集合
        System.out.println(array);
    }
}
