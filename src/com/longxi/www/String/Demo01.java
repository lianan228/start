package com.longxi.www.String;
//用户登录
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        String username = "longxi";
        String password = "123456";

        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("请输入用户名和密码：");
            String name = scanner.nextLine();
            String pwd = scanner.nextLine();

            //equals() 对比两个字符串是否相同
            //对象.equals(比较对象)
            if (name.equals(username)&&pwd.equals(password)){
                System.out.println("登录成功!");
                break;
            }else {
                if (i-2==0){
                    System.out.println("账户被锁定");
                }else {
                    System.out.println("登录失败，剩余"+(2-i)+"次机会");
                }
            }
        }

    }
}
