#include<stdio.h>

int main(){
	int i, j, n, temp, arr[100];
	
	n = 5;
	
	printf("enter element of array: \n");
	for(i=0; i<n; i++){
		scanf("%d", &arr[i]);
	}
	
	for(i=1; i<n; i++){
		int key = arr[i];
		for(j = i-1; j >= 0 && arr[j] > key; j--){
			arr[j+1] = arr[j];			
		}
		arr[j+1] = key;
	}
	
	printf("sorted array \n");
	for(i=0; i<n; i++){
		printf("%d ",arr[i]);
	}
	
	return 0;
}
