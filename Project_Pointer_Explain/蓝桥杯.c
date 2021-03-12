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
int main()
{
    long sum, n;//long型为长整型
    sum = 0;
    scanf("%d", &n);
    while (n != 0)
    {
        sum = sum + n % 10;
        n = n / 10;
    }
    printf("%ld\n", sum);
    return 0;
}