package com.longxi.www.Array.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/*
需求:
    ArrayList存储学生对象，使用Collections对ArrayList进行排序
要求:
    按照年龄从小到大，年龄相同时，按照姓名的字母顺序排序
 */
public class Demo02 {
    public static void main(String[] args) {
        ArrayList<Demo02_Student> arrayList = new ArrayList<Demo02_Student>();

        Demo02_Student s1 = new Demo02_Student("lianan",12);
        Demo02_Student s2 = new Demo02_Student("longxi",13);
        Demo02_Student s3 = new Demo02_Student("xiaochen",15);

        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);

        //sort (List<T> list, Comparator<? super T> c)
        Collections.sort(arrayList, new Comparator<Demo02_Student>() {
            @Override
            public int compare(Demo02_Student s1, Demo02_Student s2) {
                //按照年龄大小从小到大排列，如果年龄相同，按照姓名的字母顺序排列
                int num = s1.getAge()-s2.getAge();
                int num2 = (num == 0) ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });
        //遍历集合
        for(Demo02_Student ds : arrayList){
            System.out.println(ds.getName()+','+ ds.getAge());
        }
    }
}
