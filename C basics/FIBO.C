#include<stdio.h>
#include<conio.h>
void main()
{
	int num,n1,n2,i;
	clrscr();
	n1=0;
	n2=1;
	printf("\nEnter number of terms:");
	scanf("%d",&num);
	printf("\n%d\n%d",n1,n2);
	for(i=1;i<num;i++)
	{
		n2=n1+n2;
		printf("\n%d",n2);
		n1=n2-n1;

	}
	getch();
}