#include<stdio.h>
#pragma warning(disable:4996)
//int main()
//{
//	int n = 0;
//	int arr[14][14];
//	scanf("%d", &n);
//	for (int i = 1; i <= n; i++)
//	{
//		arr[i][1] = arr[i][i] = 1;
//	}
//	for (int i = 3; i <= n; i++)
//	{
//		for (int j = 2; j <= n - 1; j++)
//		{
//			arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
//		}
//	}
//	for (int i = 1; i <= n; i++)
//	{
//		for (int j = 1; j <= i; j++)
//		{
//			printf("%d ", arr[i][j]);
//		}
//		printf("\n");
//	}
//	return 0;
//}



//01数列
//void print(int a[])
//{
//	for (int i = 0; i < 5; i++)
//	{
//		printf("%d", a[i]);
//	}
//}
//int main()
//{
//	int a[5];
//	for (int i = 0; i < 2; i++)
//	{
//		a[0] = i;
//		for (int j = 0; j < 2; j++)
//		{
//			a[1] = j;
//			for (int k = 0; k < 2; k++)
//			{
//				a[2] = k;
//				for (int l = 0; l < 2; l++)
//				{
//					a[3] = l;
//					for (int p = 0; p < 2; p++)
//					{
//						a[4] = p;
//						print(a);
//						printf("\n");
//					}
//				}
//			}
//		}
//	}
//	return 0;
//}




//FJ的字符串
//ABACABA






//杨辉三角形
//int main()
//{
//	int n,i,j;
//	int a[14][14];
//	scanf("%d", &n);
//	for (i = 1; i <= n; i++)
//	{
//		a[i][1] = a[i][i] = 1;
//	}
//	for (i = 3; i <= n; i++)
//	{
//		for (j = 2; j <= n - 1; j++)
//		{
//			a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
//		}
//	}
//	for (i = 1; i <= n; i++)
//	{
//		for (j = 1; j <= i; j++)
//		{
//			printf("%d ", a[i][j]);
//		}
//		printf("\n");
//	}
//	return 0;
//}






//int main()
//{
//	int i, j, n;
//	//初始化
//	scanf("%d", &n);
//	int a[10][10];
//	for (i = 0; i < n; i++)
//		for (j = 0; j < n; j++)
//			a[i][j] = 0;
//	//给数组附值
//	for (i = 0; i < n; i++)
//	{
//		for (j = 0; j <= i; j++)
//		{
//			if (j < 1)a[i][j] = 1;//开头的第一个数为1
//			else if (i == 0)break;
//			else
//				a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
//			//杨辉三角的规律
//		}
//	}
//	//输出
//	for (i = 0; i < n; i++)
//	{
//		for (j = 0; j <= i; j++)
//			printf("%d ", a[i][j]);
//		printf("\n");
//	}
//	return 0;
//}