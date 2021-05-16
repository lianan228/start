package com.longxi.www.Array.Set;
/*
哈希值
JDK根据对象的地址或者字符串或者数字算出来的int类型的数值
 */
public class Demo02 {
    public static void main(String[] args) {
        //public int hasCode();
        Student student = new Student("涟安",20);

        System.out.println(student.hashCode());//2133927002
        //同一个对象多次调用hashCode方法返回的哈希值是相同的

        Student student1 = new Student("涟安",21);
        System.out.println(student1.hashCode());
        //两次结果不相同
        //默认情况下
    }
}
