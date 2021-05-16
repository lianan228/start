package com.longxi.www.Array.TreeSet;

import java.util.TreeSet;

/*
元素有序
    这里的顺序不是指存储和取出的顺序，而是按照一定的规则进行排序，具体方法取决于构造方法
    TreeSet()根据元素的自然排序进行排序  从小到大
    TreeSet(Comparator comparator)根据指定的比较器进行排序
没有带索引的方法，不能用普通for遍历
Set不包含重复的元素
 */
public class Demo01 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        treeSet.add(10);
        treeSet.add(40);
        treeSet.add(30);
        treeSet.add(50);
        treeSet.add(20);

        for (Integer i : treeSet){
            System.out.println(i);
        }
    }
}
