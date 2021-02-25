#include <stdio.h>
//一下不属于指针内容 是练习
//int main()
//{
//	int arr[3][3] = { 0 };
//	int i = 0;
//	int j = 0;
//	for (i = 0; i < 3; i++)
//	{
//		for (j = 0; j < 3;j++)
//		{
//			scanf("%d", &arr[i][j]);
//		}
//	}
//	for (i = 0; i < 3; i++)
//	{
//		for (j = 0; j < 3; j++)
//		{
//			printf("arr[%d][%d] == %d\n",i,j,arr[i][j]);
//		}
//	}
//}

//有警告
//int main()
//{
//	int arr[] = { 0 };
//	int i;
//	for (i = 0; i < 3; i++)
//	{
//		scanf("%d", &arr[i]);
//	}
//	for (i = 0; i < 3; i++)
//	{
//		printf("arr[%d] == %d\n", i, arr[i]);
//	}
//	return 0;
//}

//
//
//
//void Init(int arr[],int sz)
//{
//	int i = 0;
//	for (i = 0; i < sz; i++)
//	{
//		arr[i] = 0;
//	}
//}
//void Print(int arr[], int sz)
//{
//	int i = 0;
//	for (i = 0; i < sz; i++)
//	{
//		printf("%d ",arr[i]);
//	}
//}
//void Reverse(int arr[], int sz)
//{
//	int left = 0;
//	int right = sz - 1;
//	while (left < right)
//	{
//		int tmp = arr[left];
//		arr[left] = arr[right];
//		arr[right] = tmp;
//		left++;
//		right--;
//	}
//}
//int main()
//{
//	int i = 0;
//	int arr[10] = { 1,2,3,4,5,6,7,8,9,10 };
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	//Init(arr, sz);
//	Print(arr, sz);
//	printf("\n");
//	Reverse(arr,sz);
//	Print(arr, sz);
//	return 0;
//}
//冒泡排序
void bubble_sort(int arr[], int sz)
{
	int i,j;
	
	for(i=0;i<sz-1;i++)
	{ 
		for (j = 0; j < sz - 1; j++)
		{
			if (arr[j] > arr[j+1])
			{
				int tmp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = tmp;
			}
		}
	}
}
int main()
{
	int i = 0;
	int arr[5] = { 5,7,3,2,1 };
	int sz = sizeof(arr) / sizeof(arr[0]);
	bubble_sort(arr, sz);
	for (i; i < sz; i++)
	{
		printf("%d ", arr[i]);
	}
}