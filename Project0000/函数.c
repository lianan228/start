#include <stdio.h>
//#include <string.h>
#pragma warning(disable:4996)
//
//int Add(int x, int y)
//{
//	int z = x + y;
//	return z;
//}
//
//
//int main()
//{
//	int num1 = 10;
//	int num2 = 20;
//	int a = 100;
//	int b = 200;
//	int sum = 0;
//	sum = Add(num1, num2);
//	sum = Add(a, b);
//	printf("sum = %d\n", sum);
//	return 0;
//}





//int main()
//{
//	char arr1[] = "bit";
//	char arr2[20] = "###########";
//	strcpy(arr2, arr1);//将arr1的内容拷贝到arr2中
//	printf("%s\n", arr2);
//
//	return 0;
//}





//int main()
//{
//	char arr[] = "hello world";
//	memset(arr, '*', 5);//***** world
//	printf("%s\n", arr);
//}

//此代码不能交换a和b的值
//x，y 和 a，b所占用的内存空间不一样 并无关系
//void swap(int x, int y)
//{
//	int tmp = 0;
//	tmp = x;
//	x = y;
//	y = tmp;
//}
//
//int main()
//{
//	int a = 10;
//	int b = 20;
//	swap(a, b);
//
//	printf("%d %d", a, b);
//	return 0;
//}

//正确代码如下
//void swap1(int* pa,int* pb)
//{
//	int tmp = 0;
//	tmp = *pa;
//	*pa = *pb;
//	*pb = tmp;
//}
//int main()
//{
//	int a = 10;
//	int b = 20;
//
//	swap1(&a, &b);
//	printf("%d,%d",a, b);
//	return 0;
//}


//函数的嵌套调用和链式访问

//嵌套调用
//void line()
//{
//    printf("hehe\n");
//}
//void three_line()
//{
//    int i = 0;
//    for (i = 0; i < 3; i++)
//    {
//        line();
//    }
//}
//int main()
//{
//    three_line();//打印三次hehe
//    return 0;
//}
//
//
//
////链式访问
//
////把一个函数的返回值作为另一个函数的参数
//int main()
//{
//    int len = 0;
//    //1
//    len = strlen("abc");
//    printf("%d\n", len);
//    //2 链
//    printf("%d\n", strlen("abc"));
//}




//int main()
//{
//    printf("%d", printf("%d", printf("%d", 43)));//4321
//    //printf返回值为整形 返回打印字符的个数
//    //先打印43 后打印432 后打印4321
//    return 0;
//}



//函数的声明和定义

//声明
//int Add(int, int);
//int main()
//{
//	int a = 10;
//	int b = 20;
//	int sum = 0;
//	//函数调用
//	sum = Add(a, b);
//	printf("%d\n", sum);
//	return 0;
//} 
//
////函数定义
//int Add(int x, int y)
//{
//	int z = x + y;
//	return z;
//}

//写一个add.h add.c 
//.h写声明   .c写函数体
//引自己写的头文件用“” #include "add.h"

//.h内部
//#ifndef __函数名（大写）_H__
//#define __函数名（大写）_H__
//int 函数名(int ,int);

//#endif

//如果没有引入，则定义该函数，后引用然后停止
//如果引用了该函数，则不再重新引用



//函数的递归

//void print(int n)
//{
//	if (n > 9)
//	{
//		print(n / 10);
//	}
//	printf("%d ", n % 10);
//}
//
//int main()
//{
//	unsigned int num = 0;
//	scanf("%d",&num);//1234
//	//递归
//	print(num);
//	//print(123) 4
//	//print(12) 3 4
//	//……
//	return 0;
//}

// 打印了 1 2 3 4




//自定义打印字符串长度
//strlen()

//int my_strlen(char* str)//传递进来arr中第一个元素的地址
//{
//	int count = 0;//计数器   
//	while (str != '\0')
//	{
//		count++;
//		str++;
//	}
//	return 0;
//}
//
//int main()
//{
//	char arr[] = "wasd";
//	int len = my_strlen(arr);
//	printf("len = %d", len);
//
//	return 0;
//}




//递归求阶层
//int Fac1(int n)
//{
//	if (n<=1)
//	{
//		return 1;
//	}
//	else
//	{
//		return n * Fac1(n - 1);
//	}
//}
//
//int main()
//{
//	int i = 0;
//	int ret = 1;
//	scanf("%d",&i);
//	ret = Fac1(i);
//	printf("%d", ret);
//
//	return 0;
//}





//求第n个斐波那契数

//int Fib(int n)
//{
//	int a = 1;
//	int b = 1;
//	int c = 1;
//	while (n > 2)
//	{
//		c = a + b;
//		a = b;
//		b = c;
//		n--;
//	}
//	return c;
//}
//int main()
//{
//	int i = 0;
//	int ret = 0;
//	scanf("%d", &i);
//	ret = Fib(i);
//	printf("%d", ret);
//
//	return 0;
//}