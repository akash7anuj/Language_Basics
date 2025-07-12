#include <stdio.h>

int main(){
	int num, remender, sum = 0;
	
	num = 34556;
	
	while(num != 0){
		remender = num % 10;
		sum = sum + remender;
		num /= 10;
	}
	
	printf("%d\n", sum);
}

