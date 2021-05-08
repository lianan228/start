package com.longxi.www.StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddStudent {
    public static void addStudent(ArrayList<Student> arrayList){

        Scanner scanner = new Scanner(System.in);

        //为了让sid在while外面被访问到，定义在循环外
        String sid = scanner.nextLine();
        //为了让程序能够回到这个，使用循环
        while (true){
            System.out.println("请输入学生id");
            boolean b = ifUsed(arrayList, sid);
            if (b){
                System.out.println("你输入的学号已经被使用，请重新输入!");
            }else {
                break;
            }
        }

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
    //判断学号是否被占用
    public static boolean ifUsed(ArrayList<Student> arrayList,String sid){
        boolean flag = false;

        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            if(student.getSid().equals(sid)){
                flag = true;
                break;
            }
        }
        return flag;
    }
}
