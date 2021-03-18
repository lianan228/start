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
//3
//ABACABA
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






//01数列
//void print(int a[]) 
//{
//    for (int i = 0; i < 5; i++)
//        printf("%d", a[i]);
//}
//int main() {
//    int a[5];
//    for (int i = 0; i < 2; i++) 
//    {
//        a[0] = i;
//        for (int j = 0; j < 2; j++) 
//        {
//            a[1] = j;
//            for (int k = 0; k < 2; k++)
//            {
//                a[2] = k;
//                for (int l = 0; l < 2; l++)
//                {
//                    a[3] = l;
//                    for (int m = 0; m < 2; m++)
//                    {
//                        a[4] = m;
//                        print(a);
//                        printf("\n");
//                    }
//                }
//            }
//        }
//    }
//    return 0;
//}

//1
//1 1
//1 2 1
//1 3 3 1

//int main()
//{
//	int a[14][14];
//	int i,n,j;
//	scanf("%d", &n);
//	for (i = 0; i < n; i++)
//	{
//		a[i][0] = a[i][i] = 1;
//	}
//	for (i = 3; i < n; i++)
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





//杨辉三角
//void main()
//{
//    int i, j, n = 0, a[14][14];  /*定义二维数组a[14][14]*/
//    scanf("%d", &n);
//    for (i = 1; i <= n; i++)
//        a[i][1] = a[i][i] = 1;  /*两边的数令它为1，因为现在循环从1开始，就认为a[i][1]为第一个数*/
//    for (i = 3; i <= n; i++)
//        for (j = 2; j <= i - 1; j++)
//            a[i][j] = a[i - 1][j - 1] + a[i - 1][j];  /*除两边的数外都等于上两顶数之和*/
//    for (i = 1; i <= n; i++) 
//    {
//        for (j = 1; j <= i; j++)  /*j<=i的原因是不输出其它的数，只输出我们想要的数*/
//        {
//            printf("%d ", a[i][j]);
//        }
//        printf("\n");  /*当一行输出完以后换行继续下一行的输出*/
//    }
//    printf("\n");
//}






//查找整数
//#define N 1000
//int a[N + 8];
//int main() {
//    int n, i, m, k = -1;
//    scanf("%d", &n);
//    for (i = 0; i < n; i++) {
//        scanf("%d", &a[i]);
//    }
//    scanf("%d", &m);
//    for (i = 0; i < n; i++) {
//        if (a[i] == m) {
//            k = i + 1;
//            printf("%d\n", k);
//            break;
//        }
//    }
//    if (k == -1) {
//        printf("-1");
//    }
//    return 0;
//}




//黑色星期五
//int rd(int m)
//{
//	if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
//	{
//		return 31;
//	}
//	else if (m == 4 || m == 6 || m == 9 || m == 11)
//	{
//		return 30;
//	}
//	else if (m == 2)
//		return 29;
//}
//int pd(int m)
//{
//	if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
//	{
//		return 31;
//	}
//	else if (m == 4 || m == 6 || m == 9 || m == 11)
//	{
//		return 30;
//	}
//	else if (m == 2)
//		return 28;
//}
//int run(int y)
//{
//	if ((y % 4 == 0) && (y % 100 != 0)||(y % 400 == 0))
//	{
//		return 1;
//	}
//	return 0;
//}
//int main()
//{
//	int n,i,sum=0,j;
//	while (scanf("%d", &n) != EOF)
//	{
//		sum = 0;
//		for (i = 1; i <= n; i++)
//		{
//			if (i!=n)
//			{
//				if (run(i) == 1)
//					sum += 366;
//				else
//					sum += 365;
//			}
//			else
//			{
//				if (run(i) == 1)
//				{
//					for (j = 1; j <= 12; j++)
//					{
//						sum += 13;
//						if (sum % 7 == 5)
//						{
//							printf("%04d-%02d-13\n",i,j);
//							sum += rd(j) - 13;
//						}
//						else
//							sum += rd(j) - 13;
//					}
//				}
//				else
//				{
//					for (j = 1; j <= 12; j++)
//					{
//						sum += 13;
//						if (sum % 7 == 5)
//						{
//							printf("%04d-%02d-13\n",i,j);
//							sum += pd(j) - 13;
//						}
//						else
//							sum += pd(j) - 13;
//					}
//				}
//			}
//		}
//	}
//	return 0;
//}





//查找整数
//int main()
//{
//	int i, k, n;
//	scanf("%d", &n);
//	int a[1001];
//	for (i = 0; i < n; i++)
//	{
//		scanf("%d", &a[i]);
//	}
//	scanf("%d", &k);
//	for (i = 0; i < n; i++)
//	{
//		if (a[i] == k)
//		{
//			printf("%d", i + 1);
//			break;
//		}
//	}
//	return 0;
//}





//数列特征
//int main()
//{
//	int n, a, i = 0, min, max;
//	int sum = 0;
//	scanf("%d", &n);
//	for (; i < n; i++)
//	{
//		scanf("%d", &a);
//		if (i == 0)
//		{
//			max = a;
//			min = a;
//		}
//		if (max < a)
//			max = a;
//		if (min > a)
//			min = a;
//		sum += a;
//	}
//	printf("%d\n%d\n%d\n", max, min, sum);
//	return 0;
//}


//int Min(int arr[], int n)
//{
//	int a = 0;
//	for (n; n > 0; n--)
//		a = arr[n] < arr[n - 1] ? arr[n] : arr[n - 1];
//	return a;
//}
//int Max(int arr[],int n)
//{
//	int a = 0;
//	for (n; n > 0; n--)
//		a = arr[n] > arr[n - 1] ? arr[n] : arr[n - 1];
//	return a;
//}
//int main()
//{
//	int i, n, arr[1001],sum = 0;
//	scanf("%d", &n);
//
//	for (i = 0; i < n; i++)
//		scanf("%d", &arr[i]);
//
//	for (i = 0; i < n; i++)
//	{
//		sum += arr[i];
//	}
//	int m, j;
//	m = Max(arr, n);
//	j = Min(arr, n);
//	printf("%d\n", m);
//	printf("%d\n", j);
//	printf("%d\n", sum);
//	return 0;
//}





//分糖果

//未解决

//void transfer(int* x, int* tmp, int len, int& ans)
//{
//	for (int i = 0; i < len; i++)
//	{
//		x[i] = tmp[i] + tmp[(len + i - 1) % len];
//		//		printf("%d ", x[i]);
//	}
//	//	printf("\n");
//	for (int i = 0; i < len; i++)
//	{
//		if (x[i] % 2 != 0)
//		{
//			ans++;
//			x[i]++;
//		}
//	}
//}
//
//bool isSame(int* x, int len)
//{
//	for (int i = 0; i < len - 1; i++)
//	{
//		if (x[i] != x[i + 1])
//			return false;
//	}
//	return true;
//}
//
//int main()
//{
//	int n, ans = 0;
//	int x[105], tmp[105];
//	scanf("%d", &n);
//	for (int i = 0; i < n; i++)
//		scanf("%d", &x[i]);
//	while (!isSame(x, n))
//	{
//		for (int i = 0; i < n; i++)
//			tmp[i] = x[i] / 2;
//		transfer(x, tmp, n, ans);
//	}
//	printf("%d\n", ans);
//	return 0;
//}





//模拟计算器
//void fun(int i, int j, char ch)
//{
//	switch (ch)
//	{
//	case '+':
//		printf("%d\n", i + j); break;
//	case '-':
//		printf("%d\n", i - j); break;
//	case '*':
//		printf("%d\n", i * j); break;
//	case '/':
//		printf("%d\n", i / j); break;
//	case '%':
//		printf("%d\n", i % j); break;
//	default:
//		break;                          
//	}
//}
//int main()
//{
//	int i, j;
//	char ch;
//	scanf("%d %d %c", &i, &j, &ch);
//	fun(i, j, ch);
//	return 0;
//}





//石头剪刀布
//enum play { a = -1, b, c = 1};
//int _play(int p1, int p2)
//{
//    if ((p1 == 0 && p2 == 2) || (p1 == 1 && p2 == 0) || (p1 == 2 && p2 == 1))
//    {
//         return c;
//    }
//    else if ((p2 == 0 && p1 == 2) || (p2 == 1 && p1 == 0) || (p2 == 2 && p1 == 1))
//    {
//         return a;
//    }
//    else
//        return b;
//}
//int main()
//{
//	int i, j;
//	scanf("%d %d", &i, &j);
//	printf("%d\n",_play(i,j));
//  return 0;
//}



//int max(int x, int y)
//{
//	int c;
//	if (x > y)
//		c = x;
//	else
//		c = y;
//	return (c);
//}
//void main()
//{
//	int a, b, i;
//	int max(int x, int y);
//	scanf("%d,%d",&a,&b);
//	i = max(a, b);
//	printf("%d\n", i);
//}





//算法训练 猴子吃包子
//int main()
//{
//	int a, b, c, d, e, f;
//	int n;
//	scanf("%d%d%d%d%d%d%d", &a, &b, &c, &d, &e, &f,&n);
//	
//	float s1 = (float)d / a;
//	float s2 = (float)e / b;
//	float s3 = (float)f / c;
//	float s = s1 + s2 + s3;
//	printf("%.*f\n",n, s);
//	return 0;
//}






//字符串合并
//int main()
//{
//	char s1[100], s2[100];
//	gets(s1);
//	gets(s2);
//	printf("%s", strcat(s1, s2));
//	return 0;
//}






//加法练习




//成绩统计
//int main()
//{
//	double a1 = 0, a2 = 0;
//	int i, n;
//	scanf("%d", &n);
//	for (i = 0; i < n; i++)
//	{
//		int s;
//		scanf("%d", &s);
//		if (s >= 60)a1++;
//		if (s >= 85)a2++;
//	}
//	a1 = (a1 / n + 0.005) * 100;
//	a2 = (a2 / n + 0.005) * 100;
//	printf("%d%%\n%d%%", (int)a1,(int)a2);
//	return 0;
//}




//字符串比较
//int main()
//{
//	char a1[11],a2[11];
//	int i;
//	scanf("%s%s",&a1, &a2);
//	int sz1 = strlen(a1);
//	int sz2 = strlen(a2);
//	if (sz1 != sz2)
//		printf("1");
//	else
//	{
//		if (!strcmp(a1,a2))
//			printf("2");
//		else
//		{
//			for (i = 0; i < sz1; i++)
//			{
//				if (abs(a1[i] - a2[i]) == 32 || a1[i] == a2[i])
//					printf("3");
//				else
//				{
//					for (i = 0; i < sz1; i++)
//					{
//						if (a1[i]!=a2[i])
//						{
//							printf("4");
//							break;
//						}
//					}
//				}
//				break;
//			}
//		}
//	}
//	return 0;
//}




//五次方数
//int main() {
//    for (int i = 1000; i <= 999999; i++) {
//        int t1 = i % 10, t2 = i / 10 % 10, t3 = i / 100 % 10, t4 = i / 1000 % 10, t5 = i / 10000 % 10, t6 = i / 100000;//分别是个,十,白,千,万,十万位
//        if (pow(t1, 5) + pow(t2, 5) + pow(t3, 5) + pow(t4, 5) + pow(t5, 5) + pow(t6, 5) == i)
//            printf("%d\n", i);
//    }
//    return 0;
//}





//乘法运算
//int main()
//{
//	int m, n;
//	scanf("%d%d", &m, &n);
//	printf("%4d\n", m);
//	printf("×%3d\n", n);
//	printf("━━━\n");
//	if (m>10&&n>10)
//	{
//		int i = n % 10;
//		printf("%4d\n", m * i);
//		int j = n / 10;
//		printf("%3d \n", m * j);
//		printf("━━━\n");
//	}
//	printf("%4d\n", m * n);
//	return 0;
//}




//不同的单词统计
int main()
{
	char s[101];
	gets(s);
	int count = 1;
	for (int i = 0; s[i] != '\0'; i++)
	{
		if (s[i] == ' ')
		{
			count++;
		}
	}
	printf("%d\n", count);
	return 0;
}

