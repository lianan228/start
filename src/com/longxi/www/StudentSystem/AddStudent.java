package com.longxi.www.StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddStudent {
    public static void addStudent(ArrayList<Student> arrayList){

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入学生id");
        String sid = scanner.nextLine();
        System.out.println("请输入学生姓名");
        String name = scanner.nextLine();
        System.out.println("请输入学生年龄");
        String age = scanner.nextLine();
        System.out.println("请输入学生居住地");
        String address = scanner.nextLine();

        //创建一个学生对象
        Student student = new Student();
        //添加对象属性
        student.setSid(sid);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);

        //添加到列表中
        arrayList.add(student);

    }
}
