#include <stdio.h>
#include <string.h>
//int main()
//{
//	int arr[10] = { 1,2,3,4,5,6,7,8,9,0 };
//	//        �±�{ 0,1,2,3,4,5,6,7,8,9 }
//	/*char ch[5] = {'a','b','c','d','e'};
//	float fl[5] = {1.1,1.2,1.3,1.4,1.5};*/
//	//printf("%d\n", arr[4]);
//	int i = 0;
//	while (i < 10)
//	{
//		printf("%d\n", arr[i]);
//		i++;
//	}
//	return 0;
//}



//һά����Ĵ����ͳ�ʼ��

//����Ĵ���
//int main()
//{
	//int arr[10] = { 0 };
	//char arr4[] = "abcdef";
	//printf("%d\n", sizeof(arr4));//7
	//// ����\0 һ��ռ7���ռ�
	//printf("%d\n", strlen(arr4));//6
	////�ַ����ĳ��� \0֮ǰ���ַ����� һ��6��
	//char arr1[] = "abc";  //  a b c \0
	//char arr2[] = { 'a','b','c' };  // a b c  
	//printf("%d\n", sizeof(arr1));// 4
	//printf("%d\n", sizeof(arr2));// 3
	//printf("%d\n", strlen(arr1));// 3
	//printf("%d\n", strlen(arr2));// ����arr2[]û��ָ��\0��λ�� �����Ǹ����ֵ

	//return 0;
//}




//һά����ķ���

//int main()
//{
//	char arr1[] = "abcdef";
//	int i = 0;
//	//int j = 0;
//	//j = sizeof(arr1) / sizeof(arr1[0]);
//	for (i = 0; i < (int)strlen(arr1); i++)
//	{
//		printf("%c ", arr1[i]);
//	}
//	return 0;
//}

//
//��ά����

//int main()
//{
//	int arr1[3][4] = { 0 };// �������е�������
//	int arr2[][3] = { {1,2,3},{1,3,4} };//��ά����ĳ�ʼ����ʡ���� ������ʡ����
//}



//ð��������
//int bubble_sort(int arr[], int sz)
//{
//	int i = 0;
//	for (i = 0; i < sz - 1; i++);
//	{
//		//int flag = 1;//�ж��Ƿ��Ѿ�������ѭ��
//		int j = 0;
//		for (j = 0; j < sz - 1 - i; j++)
//		{
//			if (arr[j] > arr[j + 1])
//			{
//				int tmp = arr[j];
//				arr[j] = arr[j + 1];
//				arr[j + 1] = tmp; 
//				//flag = 0;
//
//			}
//			//if (flag == 1)
//			//{
//			//	break;
//			//}
//		}
//	}
//	return arr;
//}
//int main()
//{
//	int arr[] = { 9,8,7 };
//	int i = 0;
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	bubble_sort(arr, sz);
//
//	for (i = 0; i < sz; i++)
//	{
//		printf("%d ", arr[i]);
//	}
//	return 0;
//}