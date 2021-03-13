#include <stdio.h>
#include <string.h>
#pragma warning(disable:4996)
//圆面积
//#define PI 3.14159265358979323
//int main()
//{
//	int r;
//	scanf("%d", &r);
//	double s;
//	s = PI * r * r;
//	printf("%.7lf\n", s);
//	return 0;
//}




//字符倒序
//int main()
//{
//	char input[50];
//	scanf("%[^\n]", &input);
//
//	char output[50];
//	int i = 0, j = 0;
//	int len = strlen(input);
//	for (i = len - 1; i >= 0; i--)
//	{
//		output[j++] = input[i];
//	}
//	output[j] = '\0';
//	printf("%s\n", output);
//	return 0;
//}


//数列求和
//int main()
//{
//	int n;
//	scanf("%d", &n);
//	int i;
//	long long int sum = 0;
//	for (i = 1; i <= n; i++)
//	{
//		sum += i;
//	}
//	printf("%I64d", sum);
//	return 0;
//}



//筛选法求素数
//#include<stdio.h>
//int main()
//{
//    int n, i, j, f;
//    scanf("%d", &n);
//    for (i = 2; i <= n; i++)
//    {
//        f = 0;
//        for (j = 2; j < i; j++)
//        {
//            if (!(i % j))
//            {
//                f++;
//            }
//        }
//        if (!f)
//        {
//            printf("%d\n", i);;
//        }
//    }
//}




//判断闰年
//int main()
//{
//	int year;
//	scanf("%d", &year);
//	if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
//	{
//		printf("yes\n");
//	}
//	else
//	{
//		printf("no");
//	}
//	return 0;
//}




//回文数字
//int main()
//{
//	int a, b, c, d, e, f;
//	int flag = 0;
//	int n;
//	scanf("%d", &n);
//	for (int i = 10000; i < 999999; i++)
//	{
//		if (i / 100000 == 0)
//		{
//			a = i % 10;
//			b = ((i - a) / 10) % 10;
//			c = ((((i - a) / 10) - b) / 10) % 10;
//			d = ((((((i - a) / 10) - b) / 10) - c) / 10) % 10;
//			e = ((((((((i - a) / 10) - b) / 10) - c) / 10) - d) / 10) % 10;
//			int sum = a * 10000 + b * 1000 + c * 100 + d * 10 + e * 1;
//			if (sum == i && a + b + c + d + e == n)
//			{
//				printf("%d\n", sum);
//				flag = 1;
//			}
//		}
//		else
//		{
//			a = i % 10;
//			b = ((i - a) / 10) % 10;
//			c = ((((i - a) / 10) - b) / 10) % 10;
//			d = ((((((i - a) / 10) - b) / 10) - c) / 10) % 10;
//			e = ((((((((i - a) / 10) - b) / 10) - c) / 10) - d) / 10) % 10;
//			f = ((((((((((i - a) / 10) - b) / 10) - c) / 10) - d) / 10) - e) / 10) % 10;
//			int sum = a * 100000 + b * 10000 + c * 1000 + d * 100 + e * 10 + f;
//			if (sum == i && a + b + c + d + e + f == n)
//			{
//				printf("%d\n", sum);
//				flag = 1;
//			}
//		}
//	}
//	if (flag == 0)
//		printf("-1");
//
//	return 0;
//}




//字母图形
//#include<math.h>
//int main()
//{
//	int n, m, i, j;
//	scanf("%d%d", &n, &m);
//	for (i = 0; i < n; i++)
//	{
//		for (j = 0; j < m; j++)
//		{
//			printf("%c", abs(i - j) + 'A');
//		}
//		printf("\n");
//	}
//	return 0;
//}

//找落单数
//int main()
//{
//    int arr[9] = { 1,1,2,2,3,4,4,5,5 };
//    int num = 0;
//    for (int i = 0; i < 9; i++) 
//    {
//        num ^= arr[i];
//    }
//    printf("%d", num);
//}




//蛇形矩阵




//Tom数
//int main()
//{
//    long sum, n;//long型为长整型
//    sum = 0;
//    scanf("%d", &n);
//    while (n != 0)
//    {
//        sum = sum + n % 10;
//        n = n / 10;
//    }
//    printf("%ld\n", sum);
//    return 0;
//}





//Fibonacci数列
//int main()
//{
//	int i, n, sum = 0, s1 = 1,s2 = 1;
//	scanf("%d", &n);
//	for (i = 3; i <= n; i++)
//	{
//		sum = s1 + s2;
//		s1 = s2;
//		s2 = sum;
//	}
//	printf("%d\n", sum % 10007);
//	return 0;
//}


//int main(void)
//{
//    int n;
//    int s1 = 1, s2 = 1, s3;
//    scanf("%d", &n);
//
//    int i;
//    for (i = 3; i <= n; i++)
//    {
//        s3 = (s1 + s2) % 10007;
//        s1 = s2;
//        s2 = s3;
//    }
//
//    printf("%d\n", s3);
//
//    return 0;
//}




//回文数
//int main(void)
//{
//	int i, a, b, c, d;
//	for (i = 1001; i < 10000; i++)//1234
//	{
//		a = i % 10;
//		b = i / 10 % 10;
//		c = i / 100 % 10;
//		d = i / 1000;
//		if ((a==d)&&(b==c))
//		{
//			printf("%d\n", i);
//		}
//	}
//	return 0;
//}



//分糖果
//int main()
//{
//	int n, s1, s2, s3, m,count = 0;
//	scanf("%d", &n);
//	scanf("%d %d %d", &s1, &s2, &s3);
//	for (m = 0; m < 100; m++)
//	{
//		s1 += s2 / 2;
//		s2 += s3 / 2;
//		if (s1 % 2 == 1)
//		{
//			s1++;
//			count++;
//			if (s2 % 2 == 1)
//			{
//				s2++;
//				count++;
//				if (s3 % 2 == 1)
//				{
//					s3++;
//					count++;
//				}
//			}
//		}
//		if ((s1 == s2) && (s2 = s3))
//		{
//			break;
//		}
//	}
//	printf("%d\n", count);
//}







//特殊回文数
//int main()
//{
//	int n, i;
//	scanf("%d", &n);
//
//	for (i = 10001; i < 999999; i++) {
//		if (i < 100000 && (i / 10000) % 10 == i % 10 && (i / 1000) % 10 == (i / 10) % 10 && (i / 10000) % 10 + (i / 1000) % 10 + (i / 100) % 10 + (i / 10) % 10 + i % 10 == n)//输出五位数
//		{
//			printf("%d\n", i);
//		}
//		if (i > 100000 && (i / 100000) % 10 + (i / 10000) % 10 + (i / 1000) % 10 + (i / 100) % 10 + (i / 10) % 10 + (i % 10) == n && (i / 100000) % 10 == i % 10 && (i / 10000) % 10 == (i / 10) % 10 && (i / 1000) % 10 == (i / 100) % 10)//输出六位数
//		{
//			printf("%d\n", i);
//		}
//	}
//	return 0;
//}




//FJ的字符串
//void shuchu(int n)
//{
//    if (n == 1)
//        printf("%c", 65);
//    else
//    {
//        shuchu(n - 1);  
//        printf("%c", 65 + (n - 1)); 
//        shuchu(n - 1);
//    }
//}
//int main()
//{
//    int n;
//    scanf("%d", &n);
//    shuchu(n);
//}







//特殊的数字
#include <math.h>

//int main() 
//{
//	int i, a, b, c;
//	for (i = 100; i < 1000; i++)
//	{
//		a = i / 100;
//		b = i / 10 % 10;
//		c = i % 10;
//		if (i == pow(a, 3) + pow(b, 3) + pow(c, 3))
//		{
//			printf("%d\n", i);
//		}
//		/*if (i == a * a * a + b * b * b + c * c * c)
//		{
//			printf("%d\n", i);
//		}*/
//	}
//	return 0;
//}





//01数列
//int main()
//{
//	int n = 0;
//	
//}



//分核桃
//int main()
//{
//	int a, b, c;
//	scanf("%d %d %d", &a, &b, &c);
//	int i, j, k, l;
//	j = a > b ? a : b;
//	k = a > c ? a : c;
//	l = j > k ? j : k;
//	for (i = l;; i++)
//	{
//		if ((i%a==0)&&(i%b==0)&&(i%c==0))
//		{
//			printf("%d\n", i);
//			break;
//		}
//	}
//	return 0;
//}







//int main()
//{
//
//}