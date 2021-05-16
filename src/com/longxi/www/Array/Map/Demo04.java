package com.longxi.www.Array.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Map集合的遍历(方式一)

获取所有键的集合 keySet
遍历键的集合，得到每一个键，用增强for
根据键去找值，get
 */
public class Demo04 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();

        map.put("小陈","小赵");
        map.put("涟安","珑玺");

        Set<String> strings = map.keySet();
        for(String key : strings){
            String value = map.get(key);//根据键获取值
            System.out.println(value+','+key);//这里输出反了
            //小赵,小陈
            //珑玺,涟安
        }
    }
}
