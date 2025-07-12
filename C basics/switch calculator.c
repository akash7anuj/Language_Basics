#include<stdio.h>

int main(){
	char operators;
	int num1, num2, result;
	
	printf("enter the operator: ");
	scanf("%c",&operators);
	printf("enter the num1: ");
	scanf("%d",&num1);
	printf("enter the num2: ");
	scanf("%d",&num2);
	
	switch (operators){
		case'+':
			result = num1 + num2;
			printf("sum is: %d",result);
			break;
		case'-':
			result = num1 - num2;
			printf("subtract is: %d",result);
			break;
			
		case'*':
			result = num1 * num2;
			printf("multilpy is: %d",result);
			break;
		
		case'/':
			if(num2 != 0){
				result = num1 / num2;
				printf("division result is: %d",result);
				break;
			}
			else{
				printf("not divisible by 0");
			}
			break;
			
		default:
            printf("Error: Invalid operator.\n");
            break;
	}
	return 0;
}
