#include<stdio.h>
#include <string.h>
#pragma warning(disable:4996)
//int main(void)
//{
//    char strinput[100];
//    scanf("%[^\n]", strinput); //除了换行符以外的字符全部接收
//
//    char stroutput[100];
//    int i = 0;
//    int j = 0;
//    int len = strlen(strinput);
//    //逆序拷贝
//    for (i = len - 1; i >= 0; i--)
//    {
//        stroutput[j++] = strinput[i];
//    }
//    stroutput[j] = '\0';//j=4  '\0'终止
//
//    printf("%s\n", stroutput);
//
//    return 0;
//}




//1 2 3
//4 5 6
//7 8 9
//int main()
//{
//	int arr[3][3] = { 1,2,3,4,5,6,7,8,9 };
//	int i, j;
//	int sum = 0;
//	for (i = 0; i < 3; i++)
//	{
//		for (j = 0; j < 3; j++)
//		{
//			if (i == j)
//			{
//				sum += arr[i][j];
//			}
//		}
//	}
//	printf("%d\n", sum);
//}


//有30个人，其中有男人、女人和小孩，在一家饭馆里吃饭共花了50先令，每个男人各花3先令，
//每个女人各花2先令，每个小孩各花1先令，请编程计算男人、女人和小孩各有几人

//int main()
//{
//    int i, j;
//    printf("Man   Women   Children\n");
//    for (i = 0; i < 50/3; i++)//男人不可能超过50/3个
//    {
//        for (j = 0; j < 25; j++)//女人不可能超过50/2个
//        {
//            if (3 * i + 2 * j + (30 - i - j) == 50)
//            {
//                printf("%3d%8d%8d\n", i, j, 30 - i - j);
//            }
//        }
//    }
//    return 0;
//}



//假设人的心率为每分钟跳75下，编程从键盘输入你的出生年和今年的年份，
//然后以年为单位计算并输出从你出生开始到目前为止的生命中已有的心跳总数（要求考虑闰年）

//int isleap(int n)//判断闰年
//{
//	if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) 
//		return 1;
//	else 
//		return 0;
//}
//int main()
//{
//	int day1 = 365;
//	int day2 = 366;
//	int begin, end, number;
//	long unsigned int count = 0;
//	printf("Input your birth year:");
//	scanf("%d", &begin);
//	printf("Input this year:");
//	scanf("%d", &end);
//	for (; begin < end; begin++)
//	{
//		number = isleap(begin) ? day1 : day2;
//		count += number * 60 * 24 * 75;
//	}
//	printf("The heart beats in your life: %lu", count);
//	return 0;
//}






int main()
{
	int n, m, count = 0, i;
	int a[10] = { 0 };
	printf("Please enter the number:\n");
	scanf("%d", &n);
	m = n > 0 ? n : -n;
	while (m!=0)
	{
		a[m % 10]++;
		m /= 10;
		count++;
	}
	printf("%d: %d bits\n", n, count);
	for (i = 0; i < 10; i++)
	{
		if (a[i]!=0)
		{
			printf("%d: %d\n", i, a[i]);
		}
	}
	return 0;
}