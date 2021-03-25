#include<stdio.h>
#pragma warning(disable:4996)
//int m, n, p, q, min = 9999999;
//int a[100][100];//1表示空地，2表示障碍物
//int v[100][100];//0表示未访问，1表示访问
//void dfs(int x, int y, int step)
//{
//	if (x==p && y == q)
//	{
//		if (step<min)
//			min = step;
//		return;
//	}
//	//顺时针试探
//	//右
//	if (a[x][y+1] == 1 && v[x][y+1] == 0)
//	{
//		v[x][y + 1] = 1;
//		dfs(x, y + 1, step+1);
//		v[x][y + 1] = 0;
//	}
//	//下
//	if (a[x+1][y] == 1 && v[x+1][y] == 0)
//	{
//		v[x+1][y] = 1;
//		dfs(x+1, y, step + 1);
//		v[x+1][y] = 0;
//	}
//	//左
//	if (a[x][y - 1] == 1 && v[x][y - 1] == 0)
//	{
//		v[x][y - 1] = 1;
//		dfs(x, y - 1, step + 1);
//		v[x][y - 1] = 0;
//	}
//	//上
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



//数字金字塔
//5
//7
//3 5
//8 1 0
//2 7 8 4 
//4 5 2 6 9

//30
//
//int n;
//int ans;
//int a[1005][1005];
//void dfs(int x, int y, int cur)
//{
//	if (x == n)
//	{
//		if (cur > ans)
//		{
//			ans = cur;
//			return;
//		}
//	}		
//	dfs(x + 1, y, cur + a[x + 1][y]);
//	dfs(x + 1, y + 1, cur + a[x + 1][y + 1]);
//}
//int main()
//{
//	scanf("%d", &n);
//	for (int i = 1; i <= n; i++)
//		for (int j = 1; j <= i; j++)
//			scanf("%d", &a[i][j]);
//	ans = 0;
//	dfs(1, 1, a[1][1]);
//	printf("%d\n", ans);
//	return 0;
//}





//冒泡排序
//int main()
//{
//	int n, a[10],t;
//	scanf("%d", &n);
//	for (int k = 1; k <= n; k++)
//		scanf("%d", &a[k]);
//	for(int i = 1;i<=n-1;i++)
//		for(int j = 1;j<=n-i;j++)
//			if (a[j] > a[j + 1])
//			{
//				t = a[j + 1];
//				a[j + 1] = a[j];
//				a[j] = t;
//			}
//	for (int l = 1; l <= n; l++)
//		printf("%d ", a[l]);
//	return 0;
//}





//桶排序
//int main()
//{
//	int i, j, a[11], t;
//	for (i = 0; i <= 10; i++)
//		a[i] = 0;
//	for (i = 1; i <= 5; i++)
//	{
//		scanf("%d", &t);
//		a[t]++;
//	}
//	for (i = 0; i <= 10; i++)
//		for (j = 1; j <= a[i]; j++)
//			printf("%d ", i);
//	return 0;
//}