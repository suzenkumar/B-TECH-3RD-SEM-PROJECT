//Write a C program to perform Quick Sort.//EXP:-13//
#include<stdio.h>
void swap(int* a,int* b)
{
	int t=*a;
	*a=*b;
	*b=t;
}
int partition(int arr[],int low,int high)
{
	int j;
	int pivot=arr[high];
	int i=(low-1);
	for(j=low;j<=high-1;j++)
	{
		if(arr[j]<pivot)
		{
			i++;
			swap(&arr[i],&arr[j]);
		}
	}
	swap(&arr[i+1],&arr[high]);
	return(i+1);
}
void quickSort(int arr[],int low,int high)
{
	if(low<high)
	{
		int pi=partition(arr,low,high);
		quickSort(arr,low,pi-1);
		quickSort(arr,pi+1,high);
	}
}
void printArr(int arr[],int size)
{
	int i;
	for(i=0;i<size;i++)
	printf("%d \t",arr[i]);
	printf("\n");
}
int main()
{
	int arr[]={12,17,6,25,15};
	int n=sizeof(arr)/sizeof(arr[0]);
	quickSort(arr,0,n-1);
	printf("Sorted array \n");
	printArr(arr,n);
	return 0;
}
