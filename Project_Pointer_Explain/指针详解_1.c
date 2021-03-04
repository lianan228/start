#include <stdio.h>
#pragma warning(disable:4996)


//字符指针
//int main()
//{
//	char ch = 'w';
//	char* pc = &ch;
//
//	return 0;
//}

//int main()
//{
//	char arr[] = "abcdef";
//	char* pc = arr;//arr首元素地址
//	printf("%s\n", pc);
//	return 0;
//}


//int main()
//{
//	char* p = "abcedf";
//	//abcdef\0
//	//p存放的是a的地址
//	printf("%s\n", p);//abcdef
//	return 0;
//}


//int main()
//{
//	const char* p = "abcdef";//常量字符串，不可修改
//	//*p = 'w';
//	printf("%s\n", p);
//	//问题代码，有错误
//}


//int main()
//{
//	char arr1[] = "abcdef";
//	char arr2[] = "abcdef";
//	const char* p1 = "abcdef";//不可修改
//	const char* p2 = "abcdef";//不可修改
//	if (arr1==arr2)
//	{
//		printf("11\n");
//	}
//	else
//	{
//		printf("22\n");//打印22
//	}
//	if (p1 == p2)//p1,p2指向同一个"abcdef"
//	{
//		printf("11\n");//打印11
//	}
//	else
//	{
//		printf("22\n");
//	}
//	return 0;
//}






//指针数组 是数组  用来存放指针的

//int main()
//{
//	int arr[10] = { 0 };//整形数组
//	char ch[5] = { 0 };//字符数组
//	int* parr[4];//存放整形指针的数组
//	char* pch[5];//存放字符指针的数组
//}



//int main()
//{
//	int a = 10;
//	int b = 20;
//	int c = 30;
//	int d = 40;
//	int* arr[4] = { &a,&b,&c,&d };
//	int i;
//	for (i = 0; i < 4; i++)
//	{
//		printf("%d\n", *(arr[i]));
//	}
//	return 0;
//}




//int main()
//{
//	int arr1[] = { 1,2,3,4,5 };
//	int arr2[] = { 2,3,4,5,6 };
//	int arr3[] = { 3,4,5,6,7 };
//	
//	int* parr[] = { arr1,arr2,arr3 };
//	int i;
//	for (i = 0; i < 3; i++)
//	{
//		int j;
//		for (j = 0; j < 5; j++)
//		{
//			printf("%d ", *(parr[i] + j));
//		}
//		printf("\n");
//	}
//	return 0;
//}