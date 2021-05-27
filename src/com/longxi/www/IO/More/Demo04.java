package com.longxi.www.IO.More;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class Demo04 {
    public static void main(String[] args) throws Exception{

        //创建一个集合
        ArrayList<Student_Demo04> arrayList = new ArrayList<Student_Demo04>();
        //创建学生对象
        Student_Demo04 s1 = new Student_Demo04(1,"珑玺",21,"辽宁");
        Student_Demo04 s2 = new Student_Demo04(2,"涟安",22,"抚顺");
        //将学生对象添加进集合中
        arrayList.add(s1);
        arrayList.add(s2);
        //创建字符缓冲输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\涟安\\Desktop\\一些文件\\a\\123.txt"));
        //循环遍历集合元素
        for(Student_Demo04 s : arrayList){
            //重构输出内容格式
            StringBuilder sb = new StringBuilder();
            sb.append(s.getNum()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getPlace());
            //toString方法转变成字符串类型
            bw.write(sb.toString());
            //换行
            bw.newLine();
            //刷新
            bw.flush();
        }
        //回收资源
        bw.close();
    }
}
