package com.longxi.www.Array.More.Array;

import java.util.ArrayList;
import java.util.Scanner;

//创建一个存储3个学生的对象，并遍历
public class Demo04 {
    public static void main(String[] args) {
//        ArrayList<Student> arrayList = new ArrayList<Student>();
//
//        //创建学生对象
//        Student student = new Student();
//        Student student1 = new Student();
//
//        //添加学生对象到集合中
//        arrayList.add(student);
//        arrayList.add(student1);
//
//        //遍历
//        for (int i = 0; i < arrayList.size(); i++) {
//            Student s = arrayList.get(i);
//            System.out.println(s.getName()+s.getAge());
//        }
        ArrayList<Student> arrayList = new ArrayList<Student>();
        Demo04 demo04 = new Demo04();

        demo04.addStudent(arrayList);
        demo04.addStudent(arrayList);
        demo04.addStudent(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            System.out.println(student.getName()+","+student.getAge());
        }


    }
    //返回值类型，参数ArrayList<Student> array
    public void addStudent(ArrayList<Student> arrayList){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入姓名:");
        String name = scanner.nextLine();
        System.out.println("请输入年龄:");
        String age = scanner.nextLine();

        Student student = new Student();
        student.setName(name);
        student.setAge(age);

        arrayList.add(student);
    }
}
