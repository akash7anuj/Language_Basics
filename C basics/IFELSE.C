#include<stdio.h>
#include<conio.h>
void main()
{
	int n1,n2,n3;
	clrscr();

	printf("Enter value of n1:" );
	scanf("%d",&n1);
	printf("Enter value of n2:");
	scanf("%d",&n2);
	if(n1>n2)
	{
		printf("%d>%d",n1,n2);
	}
	else
	{
		printf("%d<%d",n1,n2);
	}
	getch();

}

