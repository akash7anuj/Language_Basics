#include<stdio.h>
#include<conio.h>
void swap(int,int);
void main()
{
	int x,y;
	clrscr();
	x=10;
	y=20;
	swap(x,y);
	getch();
}
void swap(int a, int b)
{
	printf("\nBefore swapping\n");
	printf("\nx=%d, y=%d",a,b);
	a=a+b;  //a=30
	b=a-b;  //b=30-20=10
	a=a-b;
	printf("\nx=%d, y=%d",a,b);
}