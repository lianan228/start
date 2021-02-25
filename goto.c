#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#pragma warning(disable:4996)
//打乱代码的运行结构
//尽量少的用goto
//goto有特定的应用场景
//int main()
//{
//again:
//	printf("hehe\n");
//	goto again;//死循环 无限跳到again
//	return 0;
//}


//关机程序
//int main()
//{
//	char input[20] = {0};
//	system("shutdown -s -t 60");
//again:
//	printf("您的电脑将在一分钟内关机,请输入“我是猪”来取消指令\n");
//	scanf("%s", &input);
//	if (0 == strcmp(input,"我是猪"))
//	{
//		system("shutdown -a");
//	}
//	else
//	{
//		goto again;
//	}
//	return 0;
//}