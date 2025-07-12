#include<stdio.h>

int main(){
	int i, num, a = 0, b = 1;
	
	num = 2;
	
	i = 1;
	while(i <= num){
		printf("%d ", a);
		int next = a + b;
		a = b;
		b = next;
		i++;
	}
}
