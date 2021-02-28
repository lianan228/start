#include <stdio.h>
#include <Windows.h>
//int main()
//{
//	unsigned int i;
//	for (i = 9; i >= 0; i--)//当i=-1时，unsigned int 中-1是一个超大的数
//		//-1 补码 1111111111111111111111111111111
//	{
//		printf("%u\n", i);
//		Sleep(100);
//	}
//	//死循环 9 8 7 6 5 4 3 2 1 4543856798467……
//	return 0;
//}

//int main()
//{
//	char a[1000];//-128---127
//	int i;
//	for (i = 0; i < 1000; i++)
//	{
//		a[i] = -1 - i;//-1,-2,-3,-4……
//		//当a[i]=-129时 -129＝127，127，126，125，124……
//		//直到3，2，1，0  0->\0 所以-128---1 有255个元素
//	}
//	printf("%d", strlen(a));//输出255
//}


//unsigned char i = 0;
//int main()
//{
//	for (i; i <= 255; i++)
//	{
//		printf("hehe\n", i);//死循环
//		//unsigned char 的范围是0--255 255+1=0 i<=255恒成立
//	}
//}