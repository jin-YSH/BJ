#include<stdio.h>
int arr[3072][6144] = { 0, };
char pattern[3][5] = {
	{ 0,0,'*',0,0 },
	{ 0,'*',0,'*',0 },
	{ '*','*','*','*','*' }
};
void draw(int n, int x, int y)
{

	if (n == 1)
	{
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j <5; j++)
			{
				arr[y + i][x + j] = pattern[i][j];
			}
		}
	}
	else if(n>1)
	{
		draw(n / 2, x + 3 *( n / 2), y);
		draw(n / 2, x, y + 3 * (n / 2));
		draw(n / 2, x + 3 * n, y + 3 * (n / 2));
	}
}
int main(void)
{
	int n;

	scanf("%d", &n);
	draw(n / 3, 0, 0);
	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j <(2 * n)-1; j++)
		{
			if (arr[i][j] == 0)
				printf(" ");
			else
				printf("%c", arr[i][j]);
		}
		printf("\n");
	}

}