package com.longxi.www.Array.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Map集合的遍历（方式2）

获取每个结婚证的集合
遍历结婚证的集合，得到每一个结婚证
根据结婚证获取丈夫和妻子

Set<Map.Entry<K,V>>entrySet(); 获取所有值对对象的集合
 */
public class Demo04_1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        //转换为Map集合中的操作
        //获取所有键值对对象的集合
        //Set<Map.Entry<K,V>>entrySet(); 获取所有值对对象的集合
        //遍历键值对对象的集合，得到没有给键值对对象
        //用增强for实现，得到没有给Map.Entry
        //根据键值对对象获取键和值
        //getKey()得到键
        //getValue()得到值
        map.put("涟安","二十");
        map.put("珑玺","二十一");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for(Map.Entry<String, String> me : entrySet){
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key+','+value);
            //涟安,二十
            //珑玺,二十一
        }
    }
}
