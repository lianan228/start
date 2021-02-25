#include <stdio.h>
#pragma warning(disable:4996)


//int main()
//{ 
//	
//}




//	int line = 0;
//	while (line <= 2000)
//	{
//		printf("继续写代码\t%d\n",line);
//		line++;
//	}
//	if (line > 2000)
//		printf("好offer\n");
//	return 0;
//}



//1.顺序结构
//2.选择结构
//3.循环结构


//分支语句
//if
//switch
//int main()
//{
//	//switch
//	int day = 0;
//	scanf("%d", &day);//day 只能是整形变量
//	switch (day)
//	{
//	case 1:// “1” 整形常量表达式
//	case 2:
//	case 3:
//	case 4:
//	case 5:
//		printf("工作日\n");
//		break;
//	case 6:
//	case 7:
//		printf("休息日\n");
//		break;
//	default:
//		printf("输入错误\n");
//		break;
//	}
//}
//	case 1:// “1” 整形常量表达式
//		printf("星期一\n");
//		break;
//	case 2:
//		printf("星期二\n");
//		break;
//	case 3:
//		printf("星期三\n");
//		break;
//	case 4:
//		printf("星期四\n");
//		break;
//	case 5:
//		printf("星期五\n");
//		break;
//	case 6:
//		printf("星期六\n");
//		break;
//	case 7:
//		printf("星期天\n");
//		break;
//	default:
//		printf("输入错误\n");
//		break;
//	}
//}


//	while

	/*int i = 1;
	while (i <= 100)
	{
		printf("%d\n", i);
		i += 2;
*/

		/*if (i % 2 == 1)
		{
			printf("%d是奇数\n", i);
		}
		i++;*/
//	}
//	return 0;




//	if
//}
	//int num = 4;
	//if (num == 5)// = 为赋值
	//{
	//	printf("hehe\n");//打印hehe
	//}

	//if (condition)
	//{
	//	return x;
	//}
	//else
	//{
	//	return y;
	//}

	//悬空else
	//int a = 0;
	//int b = 1;
	//if (a == 1)
	//	if (b == 2)
	//		printf("hehe\n");
	//	else
	//		printf("haha\n");


	/*int age = 20;
	if (age < 18)
	{
		printf("未成年\n");
		printf("不能谈恋爱\n");
	}
	else
	{
		if (age >= 18 && age < 28)
			printf("青年\n");
		else if (age >= 28 && age < 50)
			printf("壮年\n");
		else if (age >= 50 && age < 90)
			printf("老年\n");
		else
			printf("老不死");
	}*/





//int main()
//{
//	                   
//	return 0;
//}


	//乘法表
	/*int i = 1;
	for ( i = 1; i <= 9; i++)
	{
		int j = 1;
		for (j = 1; j <= i; j++)
		{
			printf("%d * %d = %d\t", j, i, i * j);
		}
		printf("\n");*/


	/*int i = 0;
	int sum = 0;
	for (i = 0; i <= 100; i++)
	{
		sum = sum + i;
	}
	printf("sum = %d\n", sum);*/





//循环
//int main()
//{
//	int ch = 0;
//	while ((ch = getchar()) != EOF)
//	{
//		if (ch<'0' || ch>'9')
//			continue;
//		putchar(ch);//输出输入的字符
//	}
//	return 0;
//}



//int main()
//{
//	int i = 1;
//	for (i = 1; i <= 10; i++)
//	{
//		if (i == 5)
//			continue;
//		printf("%d\n", i);//1234678910
//	}
//	return 0;
//}


//不可在for循环体内修改循环变量，防止for循环失去控制
//int main()
//{
//	int i = 0;
//	for (i = 0; i < 10; i++)
//	{
//		if (i = 5)
//			printf("haha\n");
//		printf("hehe\n");//死循环
//	}
//}




//建议前闭后开式写法
//int main()
//{
//	int arr[10] = { 1,2,3,4,5,6,7,8,9,10 };
//	int i = 0;
//	for ( i = 0; i < 10; i++)//前闭后开
//	{
//		printf("%d\n", arr[i]);
//	}
//	return 0;
//}



//int main()
//{
//	for (;;)
//	{
//		printf("hehe\n");//死循环 无限打印hehe
//	}
//	return 0;
//}


//for循环的初始化，调整，判断，都可以省略
//但是
//for的判断部分如果被省略，那条件就是恒为正
//如果不是非常熟练，建议不要省略

//int main()
//{
//	int i = 0;
//	int j = 0;
//	for (; i < 10; i++)
//	{
//		for (; j < 10; j++)
//		{
//			printf("hehe");
//		}//此循环结束后，j=10
//	}
//	return 0;//只打印10个hehe
//}


//一道笔试题

//int main()
//{
//	int i = 0;
//	int k = 0;
//	for ( i = 0,k=0; k = 0; i++,k++)//不进入循环，k=0 为假
//	{
//		k++;
//	}
//	return 0;
//}