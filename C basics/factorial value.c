#include<stdio.h>

int main(){
	int i , n, factorial;
	
	n = 6;
	
	i = 1;
	
	while(i <= n){
		factorial *= i;
		i++;
	}
	printf("%d", factorial);
}

