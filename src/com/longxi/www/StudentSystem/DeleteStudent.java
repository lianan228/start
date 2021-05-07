package com.longxi.www.StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteStudent {
    public void deleteStudent(ArrayList<Student> arrayList){
        Scanner scanner = new Scanner(System.in);


        System.out.println("请输入你要删除的学生的学号:");
        String sid = scanner.nextLine();
        //判断删除对象是否存在
        int index = -1;
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            if (student.getSid().equals(sid)){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("该信息不存在，请重新输入");
        }else{
            arrayList.remove(index);
            System.out.println("删除学生成功!");
        }
    }
}
