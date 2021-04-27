package com.longxi.www.Exception;

public class Test {
    public static void main(String[] args) {

        int a = 1;
        int b = 0;

        try {   //try监控区域
            System.out.println(a/b);
        }catch (Exception e){   //可以写多个catch  e 实例名
            System.out.println("Exception");
        }catch (Error error){
            System.out.println("Error");
        }catch (Throwable throwable){  //最大的范围在最后面
            System.out.println("throwable");
        }
        finally {
            System.out.println("finally");
        }

        //Exception
        //finally

        //出现异常
        //finally

        //finally 可以不要 假设io 资源 关闭
    }
}
