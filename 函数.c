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
//	strcpy(arr2, arr1);//��arr1�����ݿ�����arr2��
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

//�˴��벻�ܽ���a��b��ֵ
//x��y �� a��b��ռ�õ��ڴ�ռ䲻һ�� ���޹�ϵ
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

//��ȷ��������
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


//������Ƕ�׵��ú���ʽ����

//Ƕ�׵���
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
//    three_line();//��ӡ����hehe
//    return 0;
//}
//
//
//
////��ʽ����
//
////��һ�������ķ���ֵ��Ϊ��һ�������Ĳ���
//int main()
//{
//    int len = 0;
//    //1
//    len = strlen("abc");
//    printf("%d\n", len);
//    //2 ��
//    printf("%d\n", strlen("abc"));
//}




//int main()
//{
//    printf("%d", printf("%d", printf("%d", 43)));//4321
//    //printf����ֵΪ���� ���ش�ӡ�ַ��ĸ���
//    //�ȴ�ӡ43 ���ӡ432 ���ӡ4321
//    return 0;
//}



//�����������Ͷ���

//����
//int Add(int, int);
//int main()
//{
//	int a = 10;
//	int b = 20;
//	int sum = 0;
//	//��������
//	sum = Add(a, b);
//	printf("%d\n", sum);
//	return 0;
//} 
//
////��������
//int Add(int x, int y)
//{
//	int z = x + y;
//	return z;
//}

//дһ��add.h add.c 
//.hд����   .cд������
//���Լ�д��ͷ�ļ��á��� #include "add.h"

//.h�ڲ�
//#ifndef __����������д��_H__
//#define __����������д��_H__
//int ������(int ,int);

//#endif

//���û�����룬����ú�����������Ȼ��ֹͣ
//��������˸ú�����������������



//�����ĵݹ�

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
//	//�ݹ�
//	print(num);
//	//print(123) 4
//	//print(12) 3 4
//	//����
//	return 0;
//}

// ��ӡ�� 1 2 3 4




//�Զ����ӡ�ַ�������
//strlen()

//int my_strlen(char* str)//���ݽ���arr�е�һ��Ԫ�صĵ�ַ
//{
//	int count = 0;//������   
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




//�ݹ���ײ�
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





//���n��쳲�������

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