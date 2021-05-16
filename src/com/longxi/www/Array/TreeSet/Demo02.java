package com.longxi.www.Array.TreeSet;

import java.util.TreeSet;

/*
Comparator方法
 */
public class Demo02 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<Student>();

        Student s1 = new Student("涟安",21);
        Student s2 = new Student("珑玺",22);

        treeSet.add(s1);
        treeSet.add(s2);

        //修改相应实现类方法
        for(Student S : treeSet){
            System.out.println(S.getName()+','+S.getAge());
        }
    }
}
