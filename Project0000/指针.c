#include <stdio.h>
#pragma warning(disable:4996)
//ָ��
//int main()
//{
	//int a = 10;
	//int*p = & a;//int*��p������ - ָ�����

	//*p = 20;//* - �����ò�����
	//printf("a = %d\n", sizeof(*p));//a = 20
	//return 0;
	/*double d = 3.14;
	double* pd = &d;
	*pd = 3.3;
	printf("d = %lf\n", d);
	return 0;*/
//}


//int main()
//{
//	int a = 10; //���ڴ��п���һ��ռ�
//	int* p = &a; //���������ǶԱ���a��ȡ�����ĵ�ַ��&����a�ĵ�ַ����p�����У�p��һ��ָ�����
//	return 0;
//}




//ָ���ָ������

//64λϵͳָ��Ϊ8���ֽ�
//int main()
//{
	//printf("%d\n", sizeof(char*));//8
	//printf("%d\n", sizeof(int*));//8
	//printf("%d\n", sizeof(float*));//8
	//printf("%d\n", sizeof(double*));//8


	//int a = 0x11223344;//4���ֽ�
	//int* pa = &a;
	//*pa = 0;//&a 00 00 00 00

	//int* �ܲ���4���ֽ�

	//char* pc = &a;
	//*pc = &a; // 00 33 22 11

	//char*ֻ�ܲ���һ���ֽ�

	//printf("%p\n", pa);
	//printf("%p\n", pc);
	//�����ͬ
//	return 0;
//}


//ָ�����;�����ָ����н����ò�����ʱ���ܷ��ʵĿռ�Ĵ�С
//int*p  *p�ܹ�����4���ֽ�
//char*p *p�ܹ�����1���ֽ�
//double*p *p�ܹ�����8���ֽ�



//ָ��ļӼ�����
//int main()
//{
//	int a = 0x11223344;
//	int* pa = &a;
//	char* pc = &a;
//	printf("%d\n", pa);//727381540
//	printf("%d\n", pa+1);//727381544
//
//	printf("%d\n", pc); //727381540
//	printf("%d\n", pc + 1);//727381541
//	return 0;
//}


//int main()
//{
//	int arr[10] = { 0 };//000000000
//	int* p = arr;
//	int i = 0;
//	for (i = 0; i < 10; i++)
//	{
//		*(p + i) = 1; 
//		printf("%d\n", arr[i]);
//	}
//	// 1111111111
//}






//Ұָ��

//int main()
//{
//	int* p;//�ֲ���ָ�����������ʼ�������ֵ
//	*p = 20;
//	return 0;
//}

//
//int main()
//{
//	int arr[10] = { 0 };
//	int* p = arr;
//	int i = 0;
//	for (i = 0; i < 12; i++)
//	{
//		p++;//Խ����ʣ���ΪҰָ��
//	}
//	return 0;
//}


//��ַ���ͷ�
//int* test()
//{
//	int a = 10;
//	return &a;
//}
////a �ĵ�ַ�Ѿ����ͷ�
//int main()
//{
//	int* p = test();//ָ���ͷŵ��ڴ�
//	*p = 20;
//	return 0;
//}



//��ָ��
//int main()
//{
//	int a = 0;
//	int* p = &a;
//	int* pa = NULL;//ǿ��ת�� 0 ��ֵΪ��ָ��
//	return 0;
//}




//ָ�������
//int main()
//{
//	int arr[10] = { 1,2,3,4,5,6,7,8,9,10 };
//	int i = 0;
//	int* p = arr;
//	for (i = 0; i < 10; i++)
//	{
//		printf("%d ", *p);
//		//p++;
//		p += 1;//ָ������� ����ָ������1
//	}
//	return 0;
//}

//ָ���ָ��
//int my_strlen(char* str)
//{
//	char* start = str;
//	char* end = str;
//	while (*end!='\0')
//	{
//		end++;
//	}
//	return end - start;
//}
//int main()
//{
//	char arr[] = "bit";
//	int len = my_strlen(arr);
//	printf("%d\n", len);// 3
//	return 0;
//}



//ָ�������
//
//int main()
//{
//	int arr[10] = { 0 };
//	printf("%p\n",arr);//��ַ - ��Ԫ�صĵ�ַ
//	//1.&arr - &������ - ������������Ԫ�ص�ַ.&��������ȥ��������������ĵ�ַ
//	//2.sizeof(arr) - sizeof(������) - ��ʱ����������ʾ�������飬������������Ĵ�С����λ�ֽ�
//	printf("%p\n", &arr);//��������ĵ�ַ��ֵ��������Ԫ�ص�ַһ��
//	return 0;
//}

//int main()
//{
//	int arr[10] = { 0 };
//	int* p = arr;
//	int i = 0;
//	for (i = 0; i < 10; i++)
//	{
//		*(p + i) = i;//��ָ��������ÿ��Ԫ�ظ�ֵ
//	}
//	for (i = 0; i < 10; i++)
//	{
//		printf("%d ", *(p + i));//0 1 2 3 4 5 6 7 8 9
//	}
//	return 0;
//}




//ָ������
//int main()
//{
//	int a = 10;
//	int b = 20;
//	int c = 30;
//	int* arr[3] = { &a,&b,&c };
//	int i = 0;
//	for (i = 0; i < 3; i++)
//	{
//		printf("%d ",*(arr[i]));
//	}
//	return 0;
//}





//ָ����������
//int main()
//{
//
//	return 0;
//}