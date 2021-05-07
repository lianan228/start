package com.longxi.www.StudentSystem;

import java.util.ArrayList;

public class ShowAllStudent {
    public void show(ArrayList<Student> arrayList) {
        //判断集合中是否有信息
        if(arrayList.size()==0){
            System.out.println("无信息，请先添加信息，再查询!");
        }else{
            //显示表头信息
            System.out.println("学号\t姓名\t年龄\t居住地");
            //将集合中数据取出
            for (int i = 0; i < arrayList.size(); i++) {
                Student student = arrayList.get(i);
                System.out.println(student.getSid() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getAddress());
            }
        }
        //或者
        // if(arrayList.size()==0){
        //     System.out.println("无信息，请先添加信息，再查询!");
        //     return;
        //     }
    }
}
