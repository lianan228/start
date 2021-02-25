#include <stdio.h>
#include <string.h>


//结构体
//人
//书
//‘w’
//
//名字+身高+年龄+身份证号码+……
//等复杂对象
//
//创建一个结构体类型
//struct Book
//{
//	char name[20];//C语言程序设计
//	short price;//55
//};
//int main()
//{
//	//利用结构体类型创建一个该类型的结构体变量

//	struct Book b1 = {"C语言程序设计",55};
//	struct Book* pb = &b1;

	//strcpy(b1.name,"C++"); // --string.h
	//printf("%s\n",b1.name);//书名变为C++

	//.  结构体变量.成员
	//—>  结构体指针->成员

	//printf("%s\n", pb->name);
	//printf("%d\n", pb->price);

	//printf("%s\n", (*pb).name);
	//printf("书名：%s\n", b1.name);

	//b1.price = 15;
	//printf("价格：%d\n", b1.price);//15
	
//	return 0;
//}



//描述一个学生
/*struct Stu
{
	char name[20];
	short age;
	char tele[12];
	char sex[5];
};*///s1,s2,s3;//全局变量

//typedef struct Stu
//{
//	char name[20];
//	short age;
//	char tele[12];
//	char sex[5];
//}Stu;//将struct Stu 改名为 Stu
//int main()
//{
//	struct Stu s1 = {"张三",20,"17604232336","男"};//局部变量  //结构体初始化
//	Stu s2 = {"旺财",10,"123","保密"};//结构体初始化
//	return 0;
//}



//struct S
//{
//	int a;
//	char c;
//	char arr[20];
//	double d;
//};
//struct T
//{
//	char ch[10];
//	struct S s;
//	char* pc;
//};
//
//int main()
//{
//	char arr[] = "hello world\n";
//	struct T t = { "hehe",{100,'w',"hello world",3.14},arr };
//	printf("%s\n", t.ch);//hehe
//	printf("%s\n", t.s.arr);//hello world 
//	printf("%s\n", t.pc);//hello world
//
//	return 0;
//}


//typedef struct Stu
//{
//	char name[5];
//}Stu;
//
//void Print1(Stu s)
//{
//	printf("%s\n", s.name);//李四
//}
//
//void Print2(Stu* s)
//{
//	printf("%s\n", s->name);//李四
//} 
//
//int main()
//{
//	Stu s = { "李四" };
//	Print1(s);
//	Print2(&s);
//	//Print更优 不用另外开辟空间 不用拷贝结构体内数据
//}





//压栈
//int Add(int x, int y)
//{
//	return x + y;
//}
//int main()
//{
//	int a = 10;
//	int b = 20;
//	int ret = 0;
//	ret = Add(a, b);
//	return 0;
//}