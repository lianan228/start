package com.longxi.www.Thread.t1;
/*
Lambda表达式
函数式接口
    任何接口，如果只包含唯一一个抽象方法，那么它就是一个函数式接口
    对于函数式接口，我们可以通过lambda表达式来创建一个接口对象
 */
public class Demo07 {

    //3.静态内部类
    static class Like2 implements iLike{
        @Override
        public void lambda() {
            System.out.println("I like lambda2!");
        }
    }

    public static void main(String[] args) {
        iLike like = new Like();


        like.lambda();

        like = new Like2();
        like.lambda();

        //4.局部内部类
        class Like3 implements iLike{
            @Override
            public void lambda() {
                System.out.println("I like lambda3!");
            }
        }

        like = new Like3();
        like.lambda();


        //5.匿名内部类  没有类的名称，借助接口或者父类
        like = new iLike() {
            @Override
            public void lambda() {
                System.out.println("I like lambda4!");
            }
        };
        like.lambda();

        //6.用lambda简化
        like = ()-> {
            System.out.println("I like lambda5!");
        };
    }
}

//1.定义一个函数式接口
interface iLike{
    void lambda();
}

//2.实现类
class Like implements iLike{
    @Override
    public void lambda() {
        System.out.println("I like lambda!");
    }
}