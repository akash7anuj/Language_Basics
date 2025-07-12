#include<stdio.h>

int main(){
	int i, j, row, col;
	int mat1[10][10], mat2[10][10], result[10][10];
	
	printf("enter the row no.: ");
	scanf("%d", &row);
	
	printf("enter the col no.: "); 
	scanf("%d", &col);
	
	
	printf("enter the first matrix elements\n");
	for(i=0; i<row; i++){
		for(j=0; j<col; j++){
			printf("enter the value for matrix position [%d][%d]: ",i,j);
			scanf("%d", &mat1[i][j]);
		}
	}
	
	printf("enter the second matrix elements\n");
	for(i=0; i<row; i++){
		for(j=0; j<col; j++){
			printf("enter the value for matrix position [%d][%d]: ",i,j);
			scanf("%d", &mat1[i][j]);
		}
	}
	
	for(i=0; i<row; i++){
		for(j=0; j<col; j++){
			result[i][j] = mat1[i][j] + mat2[i][j];
		}
	}
	
	printf("additional matrix:\n");
	for(i=0; i<row; i++){
		for(j=0; j<col; j++){
			printf("%d ", result[i][j]);
		}
		printf("\n");
	}
	
	return 0;
}
