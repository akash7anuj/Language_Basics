#include<stdio.h>
#include<conio.h>
void main()
{
	int i,table;
	clrscr();
	i=1;
	printf("\nEnter the table number:");
	scanf("%d",&table);
	do
	{
		printf("\n%d*%d=%d",table,i,i*table);
		i+=1;
	}while(i<=10);

	getch();
}