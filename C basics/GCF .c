#include<stdio.h>

int main(){
	int a = 20;
	int b = 12;
	
	while(b != 0){
		int temp = b;
		b = a % b;
		a = temp;
		
	}
	printf("%d\n", a);
		
}
