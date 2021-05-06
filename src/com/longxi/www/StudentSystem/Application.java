package com.longxi.www.StudentSystem;

import com.sun.org.apache.bcel.internal.generic.GOTO;
import netscape.javascript.JSUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        AddStudent addStudent = new AddStudent();
        //创建一个集合,收录所有学生信息
        ArrayList<Student> arrayList = new ArrayList<Student>();
        boolean flag = true;
        //循环控制
        while (flag){
            //编辑主界面
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择:");

            //用Scanner从键盘输入数据
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();

            //用switch完成选择
            switch (line) {
                case "1":
                    System.out.println("添加学生");
                    AddStudent.addStudent(arrayList);

                    Scanner act = new Scanner(System.in);
                    System.out.println("是否继续操作？y/n");
                    if (act.nextLine().equals("y")){
                        flag = true;
                    }else if (act.nextLine().equals("n")){
                        flag = false;
                        System.out.println("欢迎下次使用!");
                    }
                    break;
                case "2":
                    System.out.println("删除学生");
                    break;
                case "3":
                    System.out.println("修改学生");
                    break;
                case "4":
                    System.out.println("查看所有学生");
                    break;
                case "5":
                    System.out.println("退出程序");
                    System.exit(0);//JVM退出 程序结束
            }
        }
    }
}
