package com.longxi.www.Thread.t1;

public class Demo07_1 {

    static class Love2 implements ILove{

        @Override
        public void sayLove(String name) {
            System.out.println("我喜欢"+name+"! 2");
        }
    }

    public static void main(String[] args) {

        ILove love = new Love();
        love.sayLove("涟安");

        love = new Love2();
        love.sayLove("涟安");

        class Love3 implements ILove{
            @Override
            public void sayLove(String name) {
                System.out.println("我喜欢"+name+"! 3");
            }
        }
        love = new Love3();
        love.sayLove("涟安");

        love = new ILove() {
            @Override
            public void sayLove(String name) {
                System.out.println("我喜欢"+name+"! 4");
            }
        };
        love.sayLove("涟安");


        //--------------------------------------------

        love = (name) -> {
            System.out.println("我喜欢"+name+"! 4");
        };

        love = name -> {
            System.out.println("我喜欢"+name+"! 5");
        };
        love.sayLove("涟安");

        love = name -> System.out.println("我喜欢"+name+"! 6");
        love.sayLove("涟安");

        //--------------------------------------------
        //总结:
        //  lambda表达式只能有一行代码的情况下才能简化成为一行如果
        //  有多行就用代码块
        //  必须是函数式接口(只有一个方法)
        //  多个参数可以去掉类型,带上括号
    }
}

interface ILove{
    void sayLove(String name);
}

class Love implements ILove{

    @Override
    public void sayLove(String name) {
        System.out.println("我喜欢"+name+"! 1");
    }
}
