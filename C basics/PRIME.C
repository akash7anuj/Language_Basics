#include<stdio.h>
#include<conio.h>
void main()
{
	int num,i,j;
	clrscr();
	printf("\nEnter any Positive Integer:");
	scanf("%d",&num);
	for(i=2;i<=num;i++)
	{
		for(j=2;j<=i/2;j++)
		{
			if(i%j==0)
			{
				break;
			}
		}
		if(j>i/2)
		{
			printf("\n%d",i);
		}
	}

	getch();
}