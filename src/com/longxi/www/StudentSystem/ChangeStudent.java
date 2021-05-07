package com.longxi.www.StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class ChangeStudent {
    public void changeStudent(ArrayList<Student> arrayList) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入要修改的学生学号:");
        String sid = scanner.nextLine();

        //判断学号是否存在
        int index = -1;
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            if(student.getSid().equals(sid)){
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("学生不存在，无法修改");
        }else{
            //录入修改的学生信息
            System.out.println("请输入学生新姓名:");
            String name = scanner.nextLine();
            System.out.println("请输入学生新年龄:");
            String age = scanner.nextLine();
            System.out.println("请输入学生新居住地:");
            String address = scanner.nextLine();

            //创建新的学生对象替代原来的学生对象
            Student student = new Student();
            student.setSid(sid);
            student.setName(name);
            student.setAge(age);
            student.setAddress(address);

            //重新设置学生信息
            arrayList.set(index,student);
            //给出修改成功的提示
            System.out.println("修改成功!");
        }
    }
}
