package com.longxi.www.ArrayList.More.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        addStudents(arrayList);
        addStudents(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            System.out.println(student.getName()+'\t'+student.getAge());
        }
    }
    public static void addStudents(ArrayList<Student> arrayList){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入姓名:");
        String name = scanner.nextLine();
        System.out.println("请输入年龄:");
        String age = scanner.nextLine();

        Student student = new Student();
        student.setAge(age);
        student.setName(name);

        arrayList.add(student);
    }
}
