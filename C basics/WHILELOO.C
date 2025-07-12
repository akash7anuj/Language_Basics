#include<stdio.h>
#include<conio.h>
void main()
{
	int i,table;
	clrscr();
	i=1;
	printf("\nEnter the table number:");
	scanf("%d",&table);
	while(i<=10)
	{
		printf("\n%d*%d=%d",table,i,i*table);
		i+=1;
	}
	getch();
}