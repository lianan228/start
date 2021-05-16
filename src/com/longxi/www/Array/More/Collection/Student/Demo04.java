package com.longxi.www.Array.More.Collection.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo04 {
    public static void main(String[] args) {
        //创建对象
        Collection<Student> collection = new ArrayList<Student>();

        Student s1 = new Student("珑玺",21);
        Student s2 = new Student("涟安",22);

        collection.add(s1);
        collection.add(s2);

        Iterator<Student> iterator = collection.iterator();
        while (iterator.hasNext()){
            Student next = iterator.next();
            System.out.println(next.getName()+','+ next.getAge());
            //珑玺,21
            //涟安,22
        }
    }
}
