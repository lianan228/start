#include <stdio.h>
#include <string.h>


//�ṹ��
//��
//��
//��w��
//
//����+���+����+���֤����+����
//�ȸ��Ӷ���
//
//����һ���ṹ������
//struct Book
//{
//	char name[20];//C���Գ������
//	short price;//55
//};
//int main()
//{
//	//���ýṹ�����ʹ���һ�������͵Ľṹ�����

//	struct Book b1 = {"C���Գ������",55};
//	struct Book* pb = &b1;

	//strcpy(b1.name,"C++"); // --string.h
	//printf("%s\n",b1.name);//������ΪC++

	//.  �ṹ�����.��Ա
	//��>  �ṹ��ָ��->��Ա

	//printf("%s\n", pb->name);
	//printf("%d\n", pb->price);

	//printf("%s\n", (*pb).name);
	//printf("������%s\n", b1.name);

	//b1.price = 15;
	//printf("�۸�%d\n", b1.price);//15
	
//	return 0;
//}



//����һ��ѧ��
/*struct Stu
{
	char name[20];
	short age;
	char tele[12];
	char sex[5];
};*///s1,s2,s3;//ȫ�ֱ���

//typedef struct Stu
//{
//	char name[20];
//	short age;
//	char tele[12];
//	char sex[5];
//}Stu;//��struct Stu ����Ϊ Stu
//int main()
//{
//	struct Stu s1 = {"����",20,"17604232336","��"};//�ֲ�����  //�ṹ���ʼ��
//	Stu s2 = {"����",10,"123","����"};//�ṹ���ʼ��
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
//	printf("%s\n", s.name);//����
//}
//
//void Print2(Stu* s)
//{
//	printf("%s\n", s->name);//����
//} 
//
//int main()
//{
//	Stu s = { "����" };
//	Print1(s);
//	Print2(&s);
//	//Print���� �������⿪�ٿռ� ���ÿ����ṹ��������
//}





//ѹջ
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