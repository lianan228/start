package com.longxi.www.Array.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
创建一个HashMap集合，键是学号(String) 值是学生对象相关(Student) 存储三个键值对元素并遍历

 */
public class Demo05 {
    public static void main(String[] args) {
        HashMap<String,Demo05_Student> hm = new HashMap<String, Demo05_Student>();

        Demo05_Student s1 = new Demo05_Student("涟安",21);
        Demo05_Student s2 = new Demo05_Student("珑玺",22);

        hm.put("001",s1);
        hm.put("002",s2);

        Set<String> keySet = hm.keySet();
        for(String key : keySet){
            Demo05_Student value = hm.get(key);
            System.out.println(key+','+value.getName()+','+value.getAge());
        }
        System.out.println("--------------------");

        Set<Map.Entry<String, Demo05_Student>> entries = hm.entrySet();
        for(Map.Entry<String, Demo05_Student> me : entries){
            String key = me.getKey();
            Demo05_Student value = me.getValue();
            System.out.println(key+','+value.getName()+','+value.getAge());
        }
        //001,涟安,21
        //002,珑玺,22
    }
}
