package com.longxi.www.StringBuilder;

public class Demo04 {
    public static void main(String[] args) {

        //定义一个数组
        int[] arr = {1,2,3};


        //调用方法，用一个变量接收结果
        String string = arrayToString(arr);
        //输出结果
        System.out.println(string);//[1,2,3]

        //在方法中用StringBuilder按照要求进行拼接，并把结果转成String返回
    }

    //定义一个方法，用于把int数组中的数据按照指定格式拼接成一个字符串返回，返回值类型String，参数列表int[] arr
    public static String arrayToString(int[] arr){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1){
                stringBuilder.append(arr[i]);
            }else{
                stringBuilder.append(arr[i]).append(",");
            }
        }
        stringBuilder.append("]");
        String s = stringBuilder.toString();
        return s;
    }
}
