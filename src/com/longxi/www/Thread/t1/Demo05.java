package com.longxi.www.Thread.t1;
/*
实现Callable接口（了解即可）
1.实现Callable接口，需要返回值类型
2.重写call方法，需要抛出异常
3.创建目标对象
4.创建执行服务： ExecutorService ser = Executors.newFixedThreadPool(1);
5.提交执行：Future<Boolean> result1 = ser.submit(t1);
6.获取结果：boolean r1 = result.get()
7.关闭服务：ser.shutdownNow();
 */
public class Demo05 {

}
