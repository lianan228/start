#include<stdio.h>
#include <string.h>
#pragma warning(disable:4996)
//int main(void)
//{
//    char strinput[100];
//    scanf("%[^\n]", strinput); //���˻��з�������ַ�ȫ������
//
//    char stroutput[100];
//    int i = 0;
//    int j = 0;
//    int len = strlen(strinput);
//    //���򿽱�
//    for (i = len - 1; i >= 0; i--)
//    {
//        stroutput[j++] = strinput[i];
//    }
//    stroutput[j] = '\0';//j=4  '\0'��ֹ
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


//��30���ˣ����������ˡ�Ů�˺�С������һ�ҷ�����Է�������50���ÿ�����˸���3���
//ÿ��Ů�˸���2���ÿ��С������1������̼������ˡ�Ů�˺�С�����м���

//int main()
//{
//    int i, j;
//    printf("Man   Women   Children\n");
//    for (i = 0; i < 50/3; i++)//���˲����ܳ���50/3��
//    {
//        for (j = 0; j < 25; j++)//Ů�˲����ܳ���50/2��
//        {
//            if (3 * i + 2 * j + (30 - i - j) == 50)
//            {
//                printf("%3d%8d%8d\n", i, j, 30 - i - j);
//            }
//        }
//    }
//    return 0;
//}



//�����˵�����Ϊÿ������75�£���̴Ӽ���������ĳ�����ͽ������ݣ�
//Ȼ������Ϊ��λ���㲢������������ʼ��ĿǰΪֹ�����������е�����������Ҫ�������꣩

//int isleap(int n)//�ж�����
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






//int main()
//{
//	int n, m, count = 0, i;
//	int a[10] = { 0 };
//	printf("Please enter the number:\n");
//	scanf("%d", &n);
//	m = n > 0 ? n : -n;
//	while (m!=0)
//	{
//		a[m % 10]++;
//		m /= 10;
//		count++;
//	}
//	printf("%d: %d bits\n", n, count);
//	for (i = 0; i < 10; i++)
//	{
//		if (a[i]!=0)	
//		{
//			printf("%d: %d\n", i, a[i]);
//		}
//	}
//	return 0;
//}


//int main()
//{
//	int x[3][2] = { 0 }, i;
//	for (i = 0; i < 3; i++)
//	{
//		scanf("%d", x[i]);
//		printf("%3d%3d%3d\n", x[0][0], x[0][1], x[1][0]);
//	}
//	return 0;
//}




//int fun(int m,int n,int arr[])
//{
//	int i = m;
//	for (i; i < m+4; i++)
//	{
//		if (i!=m)
//		{
//			printf("%d ", i);
//		}
//	}
//	return arr;
//}
//
//int main()
//{
//	int m,i,n;
//	int arr[5] = { 0 };
//	scanf("%d%d", &m,&n);
//	arr[4] = fun(m,n,arr);
//	for (i = 0; i < 4; i++);
//	{
//		printf("%d ",arr[i]);
//	}
//	return 0;
//}





//��Լ����
//int fun1(int m, int n)
//{
//	if (m % n != 0)
//	{
//		return 1;
//	}
//	return 0;
//}
//int fun(int from, int to)
//{
//	int fz;//��zi
//	int count = 0;
//	for (fz = from; fz <= to; fz++)
//	{
//		int fm;//��mu
//		for (fm = from; fm <= to; fm++)
//		{
//			if (fun1(fz,fm)==1)
//			{
//				count++;
//			}
//		}
//	}
//}
//int main()
//{
//	printf("%d\n",fun(1,2020));
//	return 0;
//}




//int main()
//{
//    int n, i, j, t, z = 1;
//    scanf("%d", &n);
//    int a[] = { 0 };
//    for (i = 0; i < n; i++)
//        scanf("%d", &a[i]);
//    for (i = 0; i < n; i++) {
//
//        for (j = i + 1; z <= n - i - 1; j++, z++)
//        {
//            if (a[i] > a[j]) {
//                t = a[i];
//                a[i] = a[j];
//                a[j] = t;
//            }
//        }
//        z = 1;
//    }
//    for (i = 0; i < n; i++)
//        printf("%d ", a[i]);
//    printf("\n");
//    return 0;
//
//}


//���ű���һ��
//int main()
//{
//	int s, n, i;
//	scanf("%d", &n);
//	int a[201];
//	for (i = 0; i < n; i++)
//	{
//		scanf("%d", &a[i]);
//	}
//	int j;
//	for (i = 0; i < n; i++)
//	{
//		for (j = i + 1; j < n; j++)
//		{
//			if (a[i] > a[j])
//			{
//				s = a[j];
//				a[j] = a[i];
//				a[i] = s;
//			}
//		}
//	}
//	for (i = 0; i < n; i++)
//	{
//		printf("%d ", a[i]);
//	}
//	return 0;
//}





//Ψһ���ֵĳɶ���
int fun(int* arr, int last)
{
	int i;
	for (i = 0; i < 10; i++)
	{
		int j;
		j = arr[i] ^ last;
		if (j == 0)
		{
			return 1;
		}
	}
}
int main()
{
	int i,j;
	int arr[11] = {0};
	for (i = 0; i < 10; i++)
	{
		arr[i] = i;
	}
	int last = 9;
	arr[10] = last;
	j = fun(arr, last);
	if (j == 1)
	{
		printf("%d", arr[i]);
	}
	return 0;
}


