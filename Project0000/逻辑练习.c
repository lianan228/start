#include <stdio.h>


//#define MAX 100
//#define �����Զ����-������
//#define MAX(X,Y)(X>Y?X:Y)
//int main()
//{
//	int a = 10;
//	int b = 20;
//	int max = 0;
//
//	max = MAX(a, b);
//	printf("max = %d\n", max);
//	return 0;
//}
//��������
//int Max(int x, int y)
//{
//	int max = (x > y ? x : y);
//	return max;
//}
//int main()
//{
//	int a = 10;
//	int b = 20;
//	int max = Max(a, b);
//	printf("max = %d\n", max);
//	return 0;
//}




//static ���ξֲ�����
//�ֲ��������������ڱ䳤
//����������������

//void test()
//{
//	static int a = 1;//a ��һ����̬�ľֲ�����
//	a++;
//	printf("%d\n", a);// 2 3 4 5 6
//}
//int main()
//{
//	int i = 0;
//	while (i < 5)
//	{
//		test();
//		i++;
//	}
//	return 0;
//}




//static���κ���
//�����ⲿ����
//extern int Add(int, int);
//int main()
//{
//	int a = 10;
//	int b = 20;
//	int sum = Add(a, b);
//	printf("sum = %d\n", sum);//sum = 30
//	//��Add����ǰ��static���Σ���Add�������ܱ�����
//	//static�ı��˺������ⲿ�������ԣ���Ϊ�ڲ���������
//	return 0;
//}



//int main()
//{
//	//extern - �����ⲿ����
//	extern int g_val;
//	printf("g_val = %d", g_val);
//	//��ӡ��g_val = 2020
//
//	//��g_valǰ����static���� ��ȫ�ֱ��������ƣ��ı��˱�����������
//	//�þ�̬��ȫ�ֱ���ֻ�����Լ����ڵ�Դ�ļ��ڲ�ʹ��
//	//�˴��뱨��
//	return 0;
//	//static���κ���
//}




//int main()
//{
//	//typedef - ���Ͷ��� - �����ض���
//	typedef unsigned int u_int;
//	unsigned int num1 = 10;
//	u_int num2 = 12;
//	return 0;
//}



//�����ؼ���
//int  float  auto  break  case  const  ����
//int main()
//{
//	auto int a = 10;//�ֲ�����-�Զ�����
//  register int a = 10;//�����a����ɼĴ�������
//	unsigned int num = -1;//ʵ�ʻ���num = 1 unsigned �޷��ŵ�
//	struct - �ṹ��ؼ���
//  union  - ������/������
//	
//	return 0;
//}





//�з�����
//
//ֻҪ���������ڴ��д洢�Ķ��Ƕ����ƵĲ���
//����--ԭ�룬���룬���� ��ͬ
//����
//ԭ��                 --->            ����         --->    ����
//ֱ�Ӱ�������		 ԭ��ķ���λ����			 ����+1 
//д���Ķ���������	 ����λ��λȡ���õ�
//-2
//10000000000000000000000000010  -  ԭ��
//11111111111111111111111111101  -  ����
//11111111111111111111111111110  -  ����




//�±�
//int main()
//{
//	int arr[] = { 0 };
//	arr[4];//[]�±����ò�����
//
//	return 0;
//}




//���������� exp1��exp2��exp3��
//int main()
//{
//	int a = 10;
//	int b = 20;
//	int max = 0;
//
//	max = (a > b ? a : b);//���a>b ���a=10��ֵ��max�������b=20��ֵ��max
//	return 0;
//}




//int main()
//{
//	int a = 10;
//	int b = a++;//��ʹ�ã���++  
//	//++aǰ��++ ��++��ʹ��  a = 11  b = 11
//	printf("%d\n%d", a, b);
//	//11 10
//	return 0;
//}




//int main()
//{
//	//�����������α���
//	int a = 3;
//	int b = 4;
//	/*int c = 0;
//
//	c = a;
//	a = b;
//	b = c;*/
//
//	a = a + b;
//	b = a - b;
//	a = a - b;
//
//	printf("%d  %d", a, b);
//	return 0;
//}




//�ҳ�������ֻ����һ�ε�Ԫ��
//int main()
//{
//	int arr[] = { 1,2,3,4,5,1,2,3,4 };
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	int i = 0;
//	for (i = 0; i < sz; i++)
//	{
//		int j = 0;
//		int count = 0;
//		for (j = 0; j < sz; j++)
//		{
//			if (arr[i] == arr[j])
//			{
//				count++;
//			}
//		}
//		if (count == 1)
//		{
//			printf("%d\n", arr[i]);
//			break;
//		}
//	}
//	return 0;
//}




//int main()
//{
//	int arr[] = { 1,2,3,4,5,1,2,3,4 };
//	int i = 0;
//	int ret = 0;
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	for (i = 0; i < sz; i++)
//	{
//		ret = ret ^ arr[i];
//	}
//	printf("������%d", ret);
//	return 0;
//}