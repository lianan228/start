package com.longxi.www.Array.Generic;

public class Demo04GenericImpl<E> implements Demo04Generic<E>{
    @Override
    public void show(E e) {
        System.out.println(e);
    }
}
