package com.longxi.www.Array.Set;

import javax.swing.*;
import java.util.HashSet;

/*
存储学生并遍历
 */
public class Demo04 {
    public static void main(String[] args) {
        //创建哈希表
        HashSet<Student> hashSet = new HashSet<Student>();

        Student s1 = new Student("涟安",21);
        Student s2 = new Student("珑玺",22);

        hashSet.add(s1);
        hashSet.add(s2);

        for(Student s : hashSet){
            System.out.println(s.getName()+','+s.getAge());
        }
    }
}
