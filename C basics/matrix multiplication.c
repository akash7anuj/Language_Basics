#include<stdio.h>

int main(){
	int i, j, k, row1, row2, col1, col2;
	int mat1[10][10], mat2[10][10], result[10][10] ={0};
	
	printf("enter the row1: ");
	scanf("%d", &row1);
	
	printf("enter the col1.: ");
	scanf("%d", &col1);
	
	printf("enter the row2: ");
	scanf("%d", &row2);
	
	printf("enter the col2: ");
	scanf("%d", &col2);
	
	if(col1 != row2){
		printf("matrix mutiplication not possible!");
		return 0;
	}
	
	printf("enter the first matrix elements\n");
	for(i=0; i<row1; i++){
		for(j=0; j<col1; j++){
			printf("enter the value for matrix position [%d][%d]: ",i,j);
			scanf("%d", &mat1[i][j]);
		}
	}
	
	printf("enter the second matrix elements\n");
	for(i=0; i<row2; i++){
		for(j=0; j<col2; j++){
			printf("enter the value for matrix position [%d][%d]: ",i,j);
			scanf("%d", &mat2[i][j]);
		}
	}
	
	for(i=0; i<row1; i++){
		for(j=0; j<col2; j++){
			for(k=0; k<col1; k++)
				result[i][j] += mat1[i][k] * mat2[k][j];
		}
	}
	
	
	printf("results of matrix multiplication:\n");
	for(i=0; i<row1; i++){
		for(j=0; j<col2; j++){
			printf("%d ", result[i][j]);
		}
		printf("\n");
	}
	
	return 0;
}
