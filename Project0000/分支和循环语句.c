#include <stdio.h>
#pragma warning(disable:4996)


//int main()
//{ 
//	
//}




//	int line = 0;
//	while (line <= 2000)
//	{
//		printf("����д����\t%d\n",line);
//		line++;
//	}
//	if (line > 2000)
//		printf("��offer\n");
//	return 0;
//}



//1.˳��ṹ
//2.ѡ��ṹ
//3.ѭ���ṹ


//��֧���
//if
//switch
//int main()
//{
//	//switch
//	int day = 0;
//	scanf("%d", &day);//day ֻ�������α���
//	switch (day)
//	{
//	case 1:// ��1�� ���γ������ʽ
//	case 2:
//	case 3:
//	case 4:
//	case 5:
//		printf("������\n");
//		break;
//	case 6:
//	case 7:
//		printf("��Ϣ��\n");
//		break;
//	default:
//		printf("�������\n");
//		break;
//	}
//}
//	case 1:// ��1�� ���γ������ʽ
//		printf("����һ\n");
//		break;
//	case 2:
//		printf("���ڶ�\n");
//		break;
//	case 3:
//		printf("������\n");
//		break;
//	case 4:
//		printf("������\n");
//		break;
//	case 5:
//		printf("������\n");
//		break;
//	case 6:
//		printf("������\n");
//		break;
//	case 7:
//		printf("������\n");
//		break;
//	default:
//		printf("�������\n");
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
			printf("%d������\n", i);
		}
		i++;*/
//	}
//	return 0;




//	if
//}
	//int num = 4;
	//if (num == 5)// = Ϊ��ֵ
	//{
	//	printf("hehe\n");//��ӡhehe
	//}

	//if (condition)
	//{
	//	return x;
	//}
	//else
	//{
	//	return y;
	//}

	//����else
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
		printf("δ����\n");
		printf("����̸����\n");
	}
	else
	{
		if (age >= 18 && age < 28)
			printf("����\n");
		else if (age >= 28 && age < 50)
			printf("׳��\n");
		else if (age >= 50 && age < 90)
			printf("����\n");
		else
			printf("�ϲ���");
	}*/





//int main()
//{
//	                   
//	return 0;
//}


	//�˷���
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





//ѭ��
//int main()
//{
//	int ch = 0;
//	while ((ch = getchar()) != EOF)
//	{
//		if (ch<'0' || ch>'9')
//			continue;
//		putchar(ch);//���������ַ�
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


//������forѭ�������޸�ѭ����������ֹforѭ��ʧȥ����
//int main()
//{
//	int i = 0;
//	for (i = 0; i < 10; i++)
//	{
//		if (i = 5)
//			printf("haha\n");
//		printf("hehe\n");//��ѭ��
//	}
//}




//����ǰ�պ�ʽд��
//int main()
//{
//	int arr[10] = { 1,2,3,4,5,6,7,8,9,10 };
//	int i = 0;
//	for ( i = 0; i < 10; i++)//ǰ�պ�
//	{
//		printf("%d\n", arr[i]);
//	}
//	return 0;
//}



//int main()
//{
//	for (;;)
//	{
//		printf("hehe\n");//��ѭ�� ���޴�ӡhehe
//	}
//	return 0;
//}


//forѭ���ĳ�ʼ�����������жϣ�������ʡ��
//����
//for���жϲ��������ʡ�ԣ����������Ǻ�Ϊ��
//������Ƿǳ����������鲻Ҫʡ��

//int main()
//{
//	int i = 0;
//	int j = 0;
//	for (; i < 10; i++)
//	{
//		for (; j < 10; j++)
//		{
//			printf("hehe");
//		}//��ѭ��������j=10
//	}
//	return 0;//ֻ��ӡ10��hehe
//}


//һ��������

//int main()
//{
//	int i = 0;
//	int k = 0;
//	for ( i = 0,k=0; k = 0; i++,k++)//������ѭ����k=0 Ϊ��
//	{
//		k++;
//	}
//	return 0;
//}