package com.longxi.www.File;

//重命名

import java.io.File;

public class Demo04 {
    public static void main(String[] args) throws Exception{

        File file = new File("C:\\Users\\涟安\\Desktop\\Desktop\\a");
        file.mkdir();
        File file1 = new File("C:\\Users\\涟安\\Desktop\\Desktop\\c.txt");
        file1.createNewFile();

        //把a改成aa
        File file2 = new File("C:\\Users\\涟安\\Desktop\\Desktop\\aa");
        file.renameTo(file2);

        //移动文件
        file1.renameTo(new File("C:\\Users\\涟安\\Desktop\\Desktop\\aa\\ccc.txt"));
        //移动到了aa目录下并重命名为ccc.txt

        //如果File改名的路径不在当前文件夹下，那么就剪切到目标文件夹并改名

    }
}
