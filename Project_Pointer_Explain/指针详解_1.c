#include <stdio.h>
#pragma warning(disable:4996)


//�ַ�ָ��
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
//	char* pc = arr;//arr��Ԫ�ص�ַ
//	printf("%s\n", pc);
//	return 0;
//}


//int main()
//{
//	char* p = "abcedf";
//	//abcdef\0
//	//p��ŵ���a�ĵ�ַ
//	printf("%s\n", p);//abcdef
//	return 0;
//}


//int main()
//{
//	const char* p = "abcdef";//�����ַ����������޸�
//	//*p = 'w';
//	printf("%s\n", p);
//	//������룬�д���
//}


//int main()
//{
//	char arr1[] = "abcdef";
//	char arr2[] = "abcdef";
//	const char* p1 = "abcdef";//�����޸�
//	const char* p2 = "abcdef";//�����޸�
//	if (arr1==arr2)
//	{
//		printf("11\n");
//	}
//	else
//	{
//		printf("22\n");//��ӡ22
//	}
//	if (p1 == p2)//p1,p2ָ��ͬһ��"abcdef"
//	{
//		printf("11\n");//��ӡ11
//	}
//	else
//	{
//		printf("22\n");
//	}
//	return 0;
//}






//ָ������ ������  �������ָ���

//int main()
//{
//	int arr[10] = { 0 };//��������
//	char ch[5] = { 0 };//�ַ�����
//	int* parr[4];//�������ָ�������
//	char* pch[5];//����ַ�ָ�������
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