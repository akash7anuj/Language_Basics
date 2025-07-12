#include<stdio.h>
#include<conio.h>
void main()
{
	int n1,n2;
	clrscr();
	printf("Enter value of n1:" );
	scanf("%d",&n1);
	printf("Enter value of n2:");
	scanf("%d",&n2);
	printf("\nBefore swaping....");
	printf("n1=%d\n",n1);
	printf("n2=%d\n",n2);
	n1=n1+n2;
	n2=n1-n2;
	n1=n1-n2;
	printf("\nAfter swapping...");
	printf("n1=%d\n",n1);
	printf("n2=%d\n",n2);
	getch();

}

