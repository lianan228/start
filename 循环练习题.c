#include <stdio.h>
#include <math.h>
#pragma warning(disable:4996)

//int main()
//{
//	int arr[] = { 1,2,3,4,5,6,7,8,9,10 };
//	int k = 7;
//	//写一个代码，在arr数组中找到7
//	int i = 0;
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	for (i = 0; i < sz; i++)
//	{
//		if (k == arr[i])
//		{
//			printf("找到了，下标是%d\n", i);
//			break;
//		}
//	}
//	if (i==sz)
//	{
//		printf("没找到哦");
//	}
//	return 0;
//}




//算阶层的和
//int main()
//{
//	int i = 1;
//	int n = 0;
//	int sum = 1;
//	int ret = 0;
//	//scanf("%d", &n);
//	for(n=1;n<=3;n++) 
//	{
//		//sum = 1;
//		//for (i = 1; i <= n; i++)
//		//{
//		sum *= n;
//		//}
//		ret = ret + sum;
//	}
//	printf("%d\n", ret);
//	return 0;
////}
//
//
//
////二分查找算法
//int main()
//{
//	int arr[] = { 1,2,3,4,5,6,7,8,9,10 };
//	int k = 7;
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	int left = 0;
//	int right = sz - 1;
//	
//	while (left <= right)
//	{
//		int mid = (left + right) / 2;
//		if (arr[mid] > k)
//		{
//			right = mid - 1;
//		}
//		else if (arr[mid] < k)
//		{
//			left = mid + 1;
//		}
//		else
//		{
//			printf("找到了，下标是%d\n", mid);
//			break;
//		}
//	}
//	if (left > right)
//	{
//		printf("找不到\n");
//	}
//}





//比较三个数的大小
//
//int main()
//{
//	int a, b, c;
//	printf("请输入三个数字，中间带有空格");
//	scanf("%d %d %d", &a, &b, &c);
//	if (a < b)
//	{
//		int tmp = a;
//		a = b;
//		b = tmp;
//	}
//	if (a < c)
//	{
//		int tmp = a;
//		a = c;
//		c = tmp;
//	}
//	if (b < c)
//	{
//		int tmp = b;
//		b = c;
//		c = tmp;
//	}
//	printf("%d %d %d\n", a, b, c);
//	return 0;
//}





//打印1-100内3的倍数的和

//int main()
//{
//	int i;
//	int sum = 0;
//	for ( i = 1; i < 101; i++)
//	{
//		if (i % 3 == 0)
//		{
//			sum += i;
//		}
//	}
//	printf("%d\n", sum);
//	return 0;
//}



//打印最大公约数
//辗转相除法
//int main()
//{
//	int m = 24;
//	int n = 18;
//	int r;
//	while (m % n)
//	{
//		r = m % n;
//		m = n;
//		n = r;
//	}
//	printf("%d\n", n);//6
//	return 0;
//}



//打印闰年1000-2000
//int main()
//{
//	int year = 0;//
//	int count = 0;
//	for (year = 1000;year <= 2000; year++)
//	{
//		//判断year是否为闰年
//		//1.能被4整除，并且不能被100整除是闰年
//		//2.能被400整除是闰年
//
//		if (year % 4 == 0 && year % 100 != 0)
//		{
//			printf("%d ", year);
//			count++;
//		}
//		else if (year % 400 == 0)
//		{
//			printf("%d ", year);
//			count++;
//		}
//	}
//	printf("\ncount = %d\n", count);
//	return 0;
//}




//打印100-200之间的素数
//int main()
//{
//	int i = 0;
//	int count = 0;
//	for (i = 100; i <= 200; i++)
//	{
//		//判断 i 是否为素数
//		//素数判断规则
//		//1.试除法
//		// 产生2->i-1的数字
//		int j = 0;
//		for (j = 2; j <i; j++)
//		{
//			if (i % j == 0)
//			{
//				break;
//			}
//		}
//		if (j == i)
//		{
//			count++;
//			printf("%d\n", i);
//		}
//	}
//	printf("\ncount = %d ", count);
//	return 0;
//}




//int main()
//{
//	int i = 0;
//	int count = 0;
//	//sqrt - 开平方的数学库函数
//	for (i = 100; i <= 200; i++)//i = 101;i < =200 ;i += 2//除去偶数
//	{
//		//判断 i 是否为素数
//		//素数判断规则
//		int j = 0;
//		for (j = 2; j < sqrt(i); j++)
//		{
//			if (i % j == 0)
//			{
//				break;
//			}
//		}
//		if (j > sqrt(i))
//		{
//			count++;
//			printf("%d\n", i);
//		}
//	}
//	printf("\ncount = %d ", count);
//	return 0;
//}





//分数求和
//int main()
//{
//	int i = 0;
//	double sum = 0.0;
//	int flag = 1;
//	for (i = 1; i <= 100; i++)
//	{
//		sum += flag * 1.0 / i;
//		flag = -flag;
//	}
//	printf("%lf\n", sum);
//	return 0;
//}



//求10个数的最大值

//int main()
//{
//	int arr[] = { 1,2,3,4,5,6,7,8,9,10 };
//	int i = 0;
//	int max = arr[0];//最大值
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	for (i = 1; i < sz; i++)
//	{
//		if (arr[i] > max)
//		{
//			max = arr[i];
//		}
//	}
//	printf("max = %d", max);
//	return 0;
//}




//乘法口诀表
//int main()
//{
//	int i = 0;
//	int j = 0;
//	for (i = 1; i < 10; i++)
//	{
//		for (j = 1; j <= i; j++)
//		{
//			printf("%d * %d = %-2d", j, i, j * i);//-2d向左两位填充
//		}
//		printf("\n");
//	}
//	return 0;
//}