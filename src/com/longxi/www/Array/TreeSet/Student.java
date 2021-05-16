package com.longxi.www.Array.TreeSet;

//实现接口
public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student(){}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //重写方法
    @Override
    public int compareTo(Student o) {
//        return 0;//会认为元素重复
//        return 1;//正序  -1逆序
        int num = this.age - o.age;
        return num;
        //年龄升序
    }
}
