#include <stdio.h>
#pragma warning(disable:4996)
//
//int main()
//{

	//int a = 5 + 2;
	//5 - 2;
	//5 * 2;
	//5 / 2;//表示除法取整
	//5 % 2;//表示除法取余
	//printf("%d\n", a);
	//
	// 移位操作符   
	// 移(二进制)位操作符
	// <<左移    >>右移
	//int a = 1;
	//int b = a << 1;
	////a = 1 ---- 00000……001
	//printf("%d\n", b);//输出结果为2

	//位操作符  & ^ |


	//赋值操作符 =  +=  -=   *=  /=   &=  ^=   |=   >>=   <<=

	//int arr[10] = { 0 };
	////int a = 10;
	//printf("%d\n", sizeof(arr));//4
	//printf("%d\n", sizeof(int));//4
	//printf("%d\n", sizeof arr);//4
	////数组总大小 = 数组元素个数 * 数组元素大小
	////sizeof 括号内是变量名的时候可以省略括号
	//return 0; 
//}



//位操作符
//int main()
//{
	//& - 按二进制位与
	//int a = 3;
	//int b = 5;
	//int c = a & b;
	//0000000000000000000000000000000000000011 
	//0000000000000000000000000000000000000101
	//0000000000000000000000000000000000000001
	//printf("%d", c);// 1

	// | 按二进制位或
	//int c = a | b; 
	//0000000000000000000000000000000000000111
	//printf("%d", c);// 7

	//按二进制异或
	//相同为0，相异为1
	//int c = a ^ b;
	//0000000000000000000000000000000000000110
	//printf("%d", c);//6

	//return 0;
//}


//统计一个整数二进制中1的个数
//int main()
//{
//	int num = 0;
//	int count = 0;
//	scanf("%d", &num);
//	int i = 0;
//	for (i = 0; i < 32; i++)
//	{
//		if (1 == ((num >> i) & 1))
//			count++;
//	}
//	printf("%d\n", count);
//	return 0;
//}



//&&
//int main()
//{
//	int a = 0;
//	int b = 1;
//	int c = a && b;//a或b只要有一个为假 即为零
//	printf("%d\n", c);// 0
//	return 0;
//}




//int main()
//{
//	int i = 0, a = 0, b = 2, c = 3, d = 4;
//	i = a++ && ++b && d++;
//	printf("a = %d\nb = %d\nc = %d\nd = %d\n", a, b, c, d);
//	//1 2 3 4
//	//a++ 为假 后续++b之后不继续执行 a++自增为1
//	return 0;
//}



//exp1 ? exp2 : exp3
//int main()
//{
//	int a = 0;
//	int b = 0;
//	if (a > 5)
//	{
//		b = 3;
//	}
//	else
//	{
//		b = -3;
//	}
//	b = (a > 5 ? 3 : -3); 
//}



//逗号表达式
//int main()
//{
//	int a = 1;
//	int b = 2;
//	int c = (a > b, a = b + 10, a, b = a + 1);
//	printf("%d\n", a);//12
//	printf("%d\n", b);//13
//	printf("%d\n", c);//13 最后一个表达式结果赋值给c
//	//a 和 b 均经过计算 值已改变
//}