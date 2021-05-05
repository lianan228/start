package com.longxi.www.StringBuilder;

public class Demo01 {
    public static void main(String[] args) {
        //StringBuilder内容是可变的
        //StringBuilder sb = new StringBuilder();

        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println(stringBuilder+"World");
        System.out.println(stringBuilder.length());
        //HelloWorld
        //5
    }
}
