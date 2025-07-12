#include<stdio.h>
#include<string.h>

int main(){
	int i;
	
	char str[100] = "ANUJ";
	
	for(i=0; str[i] != '\0'; i++){
		if(str[i] >= 'A' && str[i] <='Z'){
			str[i] += 32;
		}
	}

	printf("%s\n", str);
	
	char str1[100] = "anuj";
	
	for(i=0; str1[i] != '\0'; i++){
		if(str1[i] >= 'a' && str1[i] <='z'){
			str1[i] -= 32;
		}
	}
	
		printf("%s", str1);

}
