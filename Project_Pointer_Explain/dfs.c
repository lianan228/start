#include<stdio.h>
#pragma warning(disable:4996)
//int m, n, p, q, min = 9999999;
//int a[100][100];//1��ʾ�յأ�2��ʾ�ϰ���
//int v[100][100];//0��ʾδ���ʣ�1��ʾ����
//void dfs(int x, int y, int step)
//{
//	if (x==p && y == q)
//	{
//		if (step<min)
//			min = step;
//		return;
//	}
//	//˳ʱ����̽
//	//��
//	if (a[x][y+1] == 1 && v[x][y+1] == 0)
//	{
//		v[x][y + 1] = 1;
//		dfs(x, y + 1, step+1);
//		v[x][y + 1] = 0;
//	}
//	//��
//	if (a[x+1][y] == 1 && v[x+1][y] == 0)
//	{
//		v[x+1][y] = 1;
//		dfs(x+1, y, step + 1);
//		v[x+1][y] = 0;
//	}
//	//��
//	if (a[x][y - 1] == 1 && v[x][y - 1] == 0)
//	{
//		v[x][y - 1] = 1;
//		dfs(x, y - 1, step + 1);
//		v[x][y - 1] = 0;
//	}
//	//��
//	if (a[x - 1][y] == 1 && v[x - 1][y] == 0)
//	{
//		v[x - 1][y] = 1;
//		dfs(x - 1, y, step + 1);
//		v[x - 1][y] = 0;
//	}
//	return;
//}
//int main() 
//{
//	int startx, starty;
//	scanf("%d%d", &m, &n);
//	for (int i = 1; i <= m; i++)
//		for (int j = 1; j <= n; j++)
//			scanf("%d", & a[i][j]);
//	scanf("%d%d%d%d", &startx, &starty,&p,&q);
//
//	v[startx][starty] = 1;
//	dfs(startx, starty, 0);
//	printf("%d\n", min);
//
//	return 0;
//}



//���ֽ�����
int n, ans, a[1005][1005];
void dfs(int x, int y, int cur)
{
	if (x == n)
	{
		if (cur > ans)
		{
			ans = cur;
			return;
		}
		dfs(x + 1, y, cur + a[x + 1][y]);
		dfs(x + 1, y + 1, cur + a[x + 1][y + 1]);
	}
}
int main()
{
	scanf("%d", &n);
	for (int i = 1; i <= n; i++)
		for (int j = 1; j <= i; j++)
			scanf("%d", &a[i][j]);
	ans = 0;
	dfs(1, 1, a[1][1]);
	printf("%d\n", ans);
	return 0;
}