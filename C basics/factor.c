#include<stdio.h>

int main(){
	int i, num;
	
	num = 8;
	
	i = 1;
	while(i != num){
		if(num % i == 0){
			printf("%d", i);
		}
		i++;
	}
}
