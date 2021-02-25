#include <stdio.h>
#include <string.h>
//字符串类型 char

//int main()
//{
//	char arr1[] = "abc";//arr1数组中实际有一个0 "abc" - 'a','b','c','\0'--'\0'字符串的结束标志
//	char arr2[] = { 'a','b','c',0 }; //与arr1数组内容相同
//	printf("%s\n", arr1);
//	printf("%s\n", arr2);
//
//	return 0;
//}

//int main()
//{
//	char arr1[] = "abc";
//	char arr2[] = { 'a','b','c' };
//	printf("%d\n", strlen(arr1));//3
//	printf("%d\n", strlen(arr2));//15-随机值 
//	//若 arr2[] = {'a','b','c','\0'} 则输出3
//
//	return 0;
//}


//转义字符
//“abcn”  “abc\n”   "\n"换行
//int main()
//{
//	//printf("c\test\32\test.c");//\t \32[两个八进制数字 对应十进制26 ASCII码表转义为向右箭头]
//								会被解析成转义字符
//	printf("c\\test\\32\\test.c");//用\来转义\ 打印结果为  c\test\32\test.c
//
//	\xdd 两个十六进制数字	
//	return 0;
//}


//注释
//＋内容
/*
内容
*/