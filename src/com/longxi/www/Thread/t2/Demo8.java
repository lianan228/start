package com.longxi.www.Thread.t2;

import java.util.*;

/*
线程安全的类

StringBuffer
线程安全，可变的字符序列
从版本JDK5开始，被StringBuilder替代，通常应该使用StringBuilder类，因为它支持所有相同的操作
但它更快，因为它不执行同步

Vector
从java2平台v1.2开始，该类改进了List接口，使其成为JavaCollections Framework成员
于新的集合实现不同，Vector被同步，如果不需要线程安全的实现，建议使用ArrayList代替Vector

Hashtable
该类实现了一个哈希表，它将键映射到值，任何非null对象都可以用作键或者值
如果不需要线程安全的实现，建议使用HashMap代替Hashtable
 */
public class Demo8 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();

        Vector<String> vector = new Vector<String>();
        ArrayList<String> arrayList = new ArrayList<String>();

        Hashtable<String,String> hashtable = new Hashtable<String,String>();
        HashMap<String,String> hashMap = new HashMap<String,String>();

        Collections.synchronizedList(new ArrayList<String>());
    }
}
