#include<stdio.h>

int main(){
	int i, j, arr[100], temp, n, minValue;
	
	n = 5;
	
	printf("enter the element\n");
	for(i=0; i<n; i++){
		scanf("%d",&arr[i]);
	}
	
	for(i=0; i<n-1; i++){
		minValue = i;
		for(j=i+1; j<n; j++){
			if(arr[j] < arr[minValue]){
				minValue = j;
			}
		}
		temp = arr[i];
		arr[i] = arr[minValue];
		arr[minValue] = temp;
	}
	
	printf("sorted element:\n");
	for(i=0; i<n; i++){
		printf("%d ",arr[i]);
	}
}
