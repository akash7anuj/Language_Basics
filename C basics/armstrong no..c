#include<stdio.h>
#include<math.h>

int main(){
	int i, result = 0, n, num, remender;
	
	int number = 153;
	
	num = number;
	i = 0;
	while(num != 0){
		num /= 10;
		i++;
	}
	printf("%d\n", i);
	
	num = number;
	while(num != 0){
		remender = num % 10;
		result += pow(remender, i);
		num /= 10;
	
	}
	printf("%d\n", result);
	
	if (result == number)
        printf("%d is an Armstrong number.\n", number);
    else
        printf("%d is not an Armstrong number.\n", number);

    return 0;
}
