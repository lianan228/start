package com.longxi.www.OOP.Demo10;

public class Application {
    public static void main(String[] args) {
        Outer outer = new Outer();

        Outer.Inner inner = outer.new Inner();
        inner.in();
        inner.getID();

    }
}
