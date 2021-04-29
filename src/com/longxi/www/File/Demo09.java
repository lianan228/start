package com.longxi.www.File;

import java.io.File;
import java.io.StringReader;

//批量修改文件名称
public class Demo09 {
    public static void main(String[] args) {
        //A.得到所有的文件对象（把所有要改名字的文件变成File对象）
        File file = new File("C:\\Users\\涟安\\Desktop\\Desktop\\新建文件夹 (2)");

            //1.得到所有文件的目录
        File[] files = file.listFiles();
            //2.通过对这个目录进行File对象的包装，得到下面所有的File对象(listFiles)

        //B.遍历所有的文件对象，在遍历的过程中对文件进行改名
        for (File file1:files) {
            //1.得到原来文件名字（getName）
            String name = file1.getName();
            //System.out.println(name);//abcd_123_001x.txt
            //2.对原来文件中的名字进行提取（字符串内容截取，substring）

            //1.截取前部分名字
            int i = name.indexOf("_");
            String first = name.substring(i+1, i+5);//截取123_部分

            //2.截取后部分名字
            int i1 = name.lastIndexOf("_");
            String last = name.substring(i1+1);//截取001x.txt部分

            //接收新名字
            String newName = first+last;//123_001x
            File newFile = new File(file,newName);
            //file 原路径  newName 新名字
            //如果不加file 则执行renameTo方法会把原路径的文件剪切到当前路径下
            //重命名
            file1.renameTo(newFile);
        }
                    //原：abcd_123_001x
                    //现：123 001x
                //截取后拼接成一个新名字
                //改名
                    //利用原来文件所在的文件路径+新名字，构建一个新的file对象
                    //原来文件对象.renameTo(构造的新的File对象)

    }
}
