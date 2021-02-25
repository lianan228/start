#include <stdio.h>
#pragma warning(disable:4996)
//指针
//int main()
//{
	//int a = 10;
	//int*p = & a;//int*是p的类型 - 指针变量

	//*p = 20;//* - 解引用操作符
	//printf("a = %d\n", sizeof(*p));//a = 20
	//return 0;
	/*double d = 3.14;
	double* pd = &d;
	*pd = 3.3;
	printf("d = %lf\n", d);
	return 0;*/
//}


//int main()
//{
//	int a = 10; //在内存中开辟一块空间
//	int* p = &a; //在这里我们对变量a，取出他的地址，&，将a的地址放在p变量中，p是一个指针变量
//	return 0;
//}




//指针和指针类型

//64位系统指针为8个字节
//int main()
//{
	//printf("%d\n", sizeof(char*));//8
	//printf("%d\n", sizeof(int*));//8
	//printf("%d\n", sizeof(float*));//8
	//printf("%d\n", sizeof(double*));//8


	//int a = 0x11223344;//4个字节
	//int* pa = &a;
	//*pa = 0;//&a 00 00 00 00

	//int* 能操作4个字节

	//char* pc = &a;
	//*pc = &a; // 00 33 22 11

	//char*只能操作一个字节

	//printf("%p\n", pa);
	//printf("%p\n", pc);
	//结果相同
//	return 0;
//}


//指针类型决定了指针进行解引用操作的时候能访问的空间的大小
//int*p  *p能够访问4个字节
//char*p *p能够访问1个字节
//double*p *p能够访问8个字节



//指针的加减整数
//int main()
//{
//	int a = 0x11223344;
//	int* pa = &a;
//	char* pc = &a;
//	printf("%d\n", pa);//727381540
//	printf("%d\n", pa+1);//727381544
//
//	printf("%d\n", pc); //727381540
//	printf("%d\n", pc + 1);//727381541
//	return 0;
//}


//int main()
//{
//	int arr[10] = { 0 };//000000000
//	int* p = arr;
//	int i = 0;
//	for (i = 0; i < 10; i++)
//	{
//		*(p + i) = 1; 
//		printf("%d\n", arr[i]);
//	}
//	// 1111111111
//}






//野指针

//int main()
//{
//	int* p;//局部的指针变量，被初始化是随机值
//	*p = 20;
//	return 0;
//}

//
//int main()
//{
//	int arr[10] = { 0 };
//	int* p = arr;
//	int i = 0;
//	for (i = 0; i < 12; i++)
//	{
//		p++;//越界访问，成为野指针
//	}
//	return 0;
//}


//地址的释放
//int* test()
//{
//	int a = 10;
//	return &a;
//}
////a 的地址已经被释放
//int main()
//{
//	int* p = test();//指向被释放的内存
//	*p = 20;
//	return 0;
//}



//空指针
//int main()
//{
//	int a = 0;
//	int* p = &a;
//	int* pa = NULL;//强制转化 0 赋值为空指针
//	return 0;
//}




//指针的运算
//int main()
//{
//	int arr[10] = { 1,2,3,4,5,6,7,8,9,10 };
//	int i = 0;
//	int* p = arr;
//	for (i = 0; i < 10; i++)
//	{
//		printf("%d ", *p);
//		//p++;
//		p += 1;//指针的运算 整型指针向后加1
//	}
//	return 0;
//}

//指针减指针
//int my_strlen(char* str)
//{
//	char* start = str;
//	char* end = str;
//	while (*end!='\0')
//	{
//		end++;
//	}
//	return end - start;
//}
//int main()
//{
//	char arr[] = "bit";
//	int len = my_strlen(arr);
//	printf("%d\n", len);// 3
//	return 0;
//}



//指针和数组
//
//int main()
//{
//	int arr[10] = { 0 };
//	printf("%p\n",arr);//地址 - 首元素的地址
//	//1.&arr - &数组名 - 数组名不是首元素地址.&数组名是去出的是整个数组的地址
//	//2.sizeof(arr) - sizeof(数组名) - 此时的数组名表示整个数组，计算整个数组的大小，单位字节
//	printf("%p\n", &arr);//整个数组的地址，值和数组首元素地址一样
//	return 0;
//}

//int main()
//{
//	int arr[10] = { 0 };
//	int* p = arr;
//	int i = 0;
//	for (i = 0; i < 10; i++)
//	{
//		*(p + i) = i;//用指针把数组的每个元素赋值
//	}
//	for (i = 0; i < 10; i++)
//	{
//		printf("%d ", *(p + i));//0 1 2 3 4 5 6 7 8 9
//	}
//	return 0;
//}




//指针数组
//int main()
//{
//	int a = 10;
//	int b = 20;
//	int c = 30;
//	int* arr[3] = { &a,&b,&c };
//	int i = 0;
//	for (i = 0; i < 3; i++)
//	{
//		printf("%d ",*(arr[i]));
//	}
//	return 0;
//}





//指针内容延续
//int main()
//{
//
//	return 0;
//}