#include<stdio.h>

int main(){
	int i, num, sum = 0;
	num = 6;
	
	i = 1;
	while(i <= num/2){
		if(num % i == 0){
			sum = sum + i;
		}
		printf("%d\n", i);
		i++;
	}
	printf("%d\n", sum);
}


