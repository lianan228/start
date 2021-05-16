package com.longxi.www.Array.Generic;
/*
泛型类
 */
public class Demo02 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("lianan");
        System.out.println(student.getName());

        Teacher teacher = new Teacher();
        teacher.setAge(23);
        System.out.println(teacher.getAge());

        System.out.println("-------------");
        Generic<String> g1 = new Generic<String>();
        g1.setT("涟安");
        System.out.println(g1.getT());//涟安
    }
}
