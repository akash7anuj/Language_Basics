#include<stdio.h>

int main(){
	int remender, reverse = 0, num, number;
	
	number = 451;
	
	num = number;
	
	while(num != 0){
		remender = num % 10;
		reverse = reverse * 10 + remender;
		num /= 10;
	}
	printf("%d\n", reverse);
	
	if(reverse == number){
		printf("%d is palinderom..", number);
	}
	else{
		printf("it's not'");
	}
}
