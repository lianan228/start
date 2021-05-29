package com.longxi.www.Thread.t1;
/*
静态代理
 */

/*
静态代理模式总结
1.真实对象和代理对象都要实现同一个接口
2.代理对象要代理真是角色
3.代理对象可以做很多真实对象做不了的事情
  真实对象专注做自己的事情
 */
public class Demo06 extends Thread{
    public static void main(String[] args) {
        You you = new You();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱你");
            }
        }).start();
        new WeddingCompany(new You()).HappyMarry();

//        WeddingCompany weddingCompany = new WeddingCompany(you);
//        weddingCompany.HappyMarry();
    }
}

interface Marry{
    //结婚方法
    void HappyMarry();
}

//真实角色，你去结婚
class You implements Marry{
    @Override
    public void HappyMarry() {
        System.out.println("涟安要和珑玺结婚啦");
    }
}
//代理角色，帮助结婚
class WeddingCompany implements Marry{

    //代理谁--->真实目标角色
    private Marry target;

    public WeddingCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void HappyMarry() {
        before();
        this.target.HappyMarry();//真实对象
        after();
    }

    private void after() {
        System.out.println("结婚之后，花烛夜");
    }

    private void before() {
        System.out.println("结婚前，布置婚宴");
    }
}
