//Write a C program to perform Selection Sort//EXP:-12//
#include<stdio.h>
void selection(int arr[], int n) {
    int i, j, small, temp;
    // Outer loop to traverse through all array elements
    for(i = 0; i < n - 1; i++) {
        small = i;
        // Inner loop to find the smallest element in the remaining unsorted part
        for(j = i + 1; j < n; j++) {
            if(arr[j] < arr[small]) {
                small = j;
            }
        }
        // Swap the found smallest element with the element at position i
        if(small != i) {
            temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
    }
}

void printArr(int a[], int n) {
    int i;
    // Function to print the array
    for(i = 0; i < n; i++) {
        printf("%d \t", a[i]);
    }
    printf("\n");
}

int main() {
    int a[] = {12, 31, 25, 8, 32, 17};
    int n = sizeof(a) / sizeof(a[0]);
    
    // Print the array before sorting
    printf("Before sorting array elements are-\n");
    printArr(a, n);
    
    // Perform selection sort
    selection(a, n);
    
    // Print the array after sorting
    printf("After sorting array elements are-\n");
    printArr(a, n);
    
    return 0;
}

