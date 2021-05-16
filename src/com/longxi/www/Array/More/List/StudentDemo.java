package com.longxi.www.Array.More.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();

        Student s1 = new Student("涟安",21);
        Student s2 = new Student("珑玺",23);

        list.add(s1);
        list.add(s2);

        Iterator<Student> iterator = list.iterator();

        while (iterator.hasNext()){
            Student next = iterator.next();
            System.out.println(next.getName()+next.getAge());
        }

        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getName()+','+student.getAge());
        }
    }
}
