#include<stdio.h>
#include<string.h>

int main(){
	int i, count = 1;
	
	char str[100] ="anuj kumar singh akash";
	printf("%s", str);
	
	for(i=0; str[i]!='\0';i++){
		if(str[i] == ' ' && str[i+1] != ' ' && str[i+1] != '\n'){
			count++;
		}
	}	
	printf("\n%d", count);
	
	return 0;
}
