//Write a c program for sparse matrix|| exp 1 || date of experiment 11/7/2024||
#include<stdio.h>
#include<stdlib.h>
int main(){
	int row,col,i,j,a[10][10],count=0;
	printf("Enter row\n");
	scanf("%d",&row);
	printf("Enter Column\n");
	scanf("%d",&col);
	printf("Enter Element of Matrix1\n");
	for(i = 0;i< row; i++){
		for(j=0;j< col;j++){
			printf("%d\t",a[i][j]);
		}
		printf("");
	}
	/*checking sparse of matrix*/
	for(i=0;i<row;i++){
		for(j=0;j< col;j++){
			if(a[i][j]==0)
			count++;
		}
	}
	if(count > ((row * col)/2))
	printf("Matrix is a sparse matrix");
	else
	printf("Matrix is not sparse matrix");
}
