#include<stdio.h>
#include<string.h>

int main(){
	int i, count = 0;
//	char str[100];
	
	char str[100] = "anuj kumar";
	printf("%s\n", str);
	
	for(i=0; str[i] != '\0'; i++){
		if(str[i] != ' '){
			count++;
		}
	}
	printf("%d", count);
	
	return 0;
	
}
