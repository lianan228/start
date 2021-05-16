package com.longxi.www.Array.Generic;

import com.longxi.www.JieKou.Demo04.Object;

import java.util.ArrayList;
import java.util.List;

/*
类型通配符
<?>
 */
public class Demo05 {
    public static void main(String[] args) {
        List<?> list1 = new ArrayList<Object>();
        List<?> list2 = new ArrayList<Number>();


        //上限 extend后是最大类型
        List<? extends Number> list3 = new ArrayList<Integer>();

        //下线 super后是最小类型
        List<? super Number> list4 = new ArrayList<Number>();
        List<? super Number> list5 = new ArrayList<java.lang.Object>();


    }
}
