#include <stdio.h>

//	//const - 常属性
//	//const修饰的常变量
//	const int num = 1;
//	printf("%d\n", num);
//	num = 8;//不可改变
//	printf("%d\n", num);
//	//本质还是变量，const赋予了常属性 


//	//数组
//int main()
//{
	//const int n = 10;//n是变量，但是有常属性。n为常变量
	//int arr[n] = { 0 };//[]内需要常量
	//define 定义的标识符常量
//#define MAX 10 

//int main()
//{
//	int arr[MAX] = { 0 };
//	printf("%d\n", MAX);
//	return 0;
//}


//枚举常量

//枚举——列举
//三原色——红，绿，蓝
//枚举关键字 enum
//enum Color
//{
//	red,
//	green,
//	bule
//};
//int main()
//{
//	printf("%d\n", red);//0
//	printf("%d\n", green);//1
//	printf("%d\n", bule);//2
//
//	enum Color color = bule;
//	color = red;
//	return 0;
//	//枚举常量—{}内的不可改
//	//通过枚举类型创建的变量是可以改的
//}