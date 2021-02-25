#include <stdio.h>


//#define MAX 100
//#define 还可以定义宏-带参数
//#define MAX(X,Y)(X>Y?X:Y)
//int main()
//{
//	int a = 10;
//	int b = 20;
//	int max = 0;
//
//	max = MAX(a, b);
//	printf("max = %d\n", max);
//	return 0;
//}
//函数方法
//int Max(int x, int y)
//{
//	int max = (x > y ? x : y);
//	return max;
//}
//int main()
//{
//	int a = 10;
//	int b = 20;
//	int max = Max(a, b);
//	printf("max = %d\n", max);
//	return 0;
//}




//static 修饰局部变量
//局部变量的生命周期变长
//出了作用域不再销毁

//void test()
//{
//	static int a = 1;//a 是一个静态的局部变量
//	a++;
//	printf("%d\n", a);// 2 3 4 5 6
//}
//int main()
//{
//	int i = 0;
//	while (i < 5)
//	{
//		test();
//		i++;
//	}
//	return 0;
//}




//static修饰函数
//声明外部函数
//extern int Add(int, int);
//int main()
//{
//	int a = 10;
//	int b = 20;
//	int sum = Add(a, b);
//	printf("sum = %d\n", sum);//sum = 30
//	//若Add函数前有static修饰，则Add函数不能被引用
//	//static改变了函数的外部链接属性，变为内部链接属性
//	return 0;
//}



//int main()
//{
//	//extern - 声明外部符号
//	extern int g_val;
//	printf("g_val = %d", g_val);
//	//打印了g_val = 2020
//
//	//若g_val前加上static修饰 则全局变量被限制，改变了变量的作用域
//	//让静态的全局变量只能在自己所在的源文件内部使用
//	//此代码报错
//	return 0;
//	//static修饰函数
//}




//int main()
//{
//	//typedef - 类型定义 - 类型重定义
//	typedef unsigned int u_int;
//	unsigned int num1 = 10;
//	u_int num2 = 12;
//	return 0;
//}



//常见关键字
//int  float  auto  break  case  const  ……
//int main()
//{
//	auto int a = 10;//局部变量-自动变量
//  register int a = 10;//建议把a定义成寄存器变量
//	unsigned int num = -1;//实际还是num = 1 unsigned 无符号的
//	struct - 结构体关键字
//  union  - 联合体/共用体
//	
//	return 0;
//}





//有符号数
//
//只要是整数，内存中存储的都是二进制的补码
//正数--原码，反码，补码 相同
//负数
//原码                 --->            反码         --->    补码
//直接按照正负		 原码的符号位不变			 反码+1 
//写出的二进制序列	 其他位按位取反得到
//-2
//10000000000000000000000000010  -  原码
//11111111111111111111111111101  -  反码
//11111111111111111111111111110  -  补码




//下标
//int main()
//{
//	int arr[] = { 0 };
//	arr[4];//[]下标引用操作符
//
//	return 0;
//}




//条件操作符 exp1？exp2：exp3；
//int main()
//{
//	int a = 10;
//	int b = 20;
//	int max = 0;
//
//	max = (a > b ? a : b);//如果a>b 则把a=10赋值给max，否则把b=20赋值给max
//	return 0;
//}




//int main()
//{
//	int a = 10;
//	int b = a++;//先使用，再++  
//	//++a前置++ 先++后使用  a = 11  b = 11
//	printf("%d\n%d", a, b);
//	//11 10
//	return 0;
//}




//int main()
//{
//	//交换两个整形变量
//	int a = 3;
//	int b = 4;
//	/*int c = 0;
//
//	c = a;
//	a = b;
//	b = c;*/
//
//	a = a + b;
//	b = a - b;
//	a = a - b;
//
//	printf("%d  %d", a, b);
//	return 0;
//}




//找出数组中只出现一次的元素
//int main()
//{
//	int arr[] = { 1,2,3,4,5,1,2,3,4 };
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	int i = 0;
//	for (i = 0; i < sz; i++)
//	{
//		int j = 0;
//		int count = 0;
//		for (j = 0; j < sz; j++)
//		{
//			if (arr[i] == arr[j])
//			{
//				count++;
//			}
//		}
//		if (count == 1)
//		{
//			printf("%d\n", arr[i]);
//			break;
//		}
//	}
//	return 0;
//}




//int main()
//{
//	int arr[] = { 1,2,3,4,5,1,2,3,4 };
//	int i = 0;
//	int ret = 0;
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	for (i = 0; i < sz; i++)
//	{
//		ret = ret ^ arr[i];
//	}
//	printf("单身狗：%d", ret);
//	return 0;
//}