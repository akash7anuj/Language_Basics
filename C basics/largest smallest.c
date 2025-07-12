#include<stdio.h>

int main(){
	int i, n, arr[100];
	int largest, smallest;
	
	n = 5;
	
	printf("element of arr: \n");
	for(i=0; i<n; i++){
		scanf("%d", &arr[i]);
	}
	
	largest = arr[0];
	smallest = arr[0];
	
	for(i=1; i<n; i++){
		if(arr[i] > largest){
			largest = arr[i];
		}
		if(arr[i] < smallest){
			smallest = arr[i];
		}
	}
	
	printf("largest element is: %d\n", largest);
	printf("smallest element is: %d\n", smallest);
	
	return 0;
	
}
