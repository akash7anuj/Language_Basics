#include<stdio.h>

int main(){
	int num, remender = 0, reverse = 0;
	
	num = 3456;
	
	while(num != 0 ){
		remender = num % 10;
		reverse = reverse * 10 + remender;
		num /= 10;
	}
	
	printf("%d\n", reverse);
}
