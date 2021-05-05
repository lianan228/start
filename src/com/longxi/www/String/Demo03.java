package com.longxi.www.String;

//拼接字符串
public class Demo03 {
    public static void main(String[] args) {
        //定义一个int类型的数组，用静态初始化完成数组元素的初始化
        int[] arr = {1,2,3};

        //定义一个方法，用于把int数组中的数据按照指定格式拼接成要给字符串返回

        //调用方法
        String string = arrayToString(arr);
        System.out.println(string);
        //[1,2,3]
    }
    public static String arrayToString(int[] arr){
        String s = "";
        s+="[";
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                s+=arr[i];
            }else {
                s+=arr[i];
                s+=",";
            }
        }
        s+="]";

        return s;
    }
}
