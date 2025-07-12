#include<stdio.h>
// #include<conio.h>
#define N 7
void main()
{
	int i,j, marks[N], temp;
	// clrscr();
	for(i=0;i<N;i++)
	{
		printf("\nEnter the marks:");
		scanf("%d",&marks[i]);
	}
	for(i=0;i<N-1;i++)
	{
		for(j=0;j<N-1-i;j++)
		{
			if(marks[j]>marks[j+1])
			{
				temp=marks[j];
				marks[j]=marks[j+1];
				marks[j+1]=temp;
			}
		}

	}
	for(i=0;i<N;i++)
	{
	printf("\n%d",marks[i]);
	}

	getch();
}