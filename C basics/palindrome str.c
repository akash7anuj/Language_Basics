#include<stdio.h>
#include<string.h>

int main(){
	char name[100], reverse[100];
	int i, length, isplindrome = 1;
	
//	name[100] = "anuj";
	strcpy(name, "ana");
	
	length = strlen(name);
	
	i = 0;
	while(i < length/2){
		if(name[i] != name[length - i -1]){
			printf("it's not plindrome");
			return;
		}
		i++;
	}
	
	printf("it's palindrome");
}
