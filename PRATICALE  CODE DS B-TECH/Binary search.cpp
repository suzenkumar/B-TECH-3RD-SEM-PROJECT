//implementation of linear search
#include<stdio.h>

int main() {
    int c, first, last, middle, n, search, array[100];

    // Input number of elements
    printf("Enter number of elements: ");
    scanf("%d", &n);

    // Input elements
    printf("Enter %d integers: \n", n);
    for (c = 0; c < n; c++)
        scanf("%d", &array[c]);

    // Sorting the array using bubble sort (required for binary search)
    for (int i = 0; i < n-1; i++) {
        for (int j = 0; j < n-i-1; j++) {
            if (array[j] > array[j+1]) {
                // Swapping array[j] and array[j+1]
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    }

    // Input value to search
    printf("Enter value to find: ");
    scanf("%d", &search);

    // Binary search algorithm
    first = 0;
    last = n - 1;
    middle = (first + last) / 2;

    while (first <= last) {
        if (array[middle] < search)
            first = middle + 1;
        else if (array[middle] == search) {
            printf("%d found at location %d.\n", search, middle + 1);
            break;
        } else
            last = middle - 1;

        middle = (first + last) / 2;
    }

    if (first > last)
        printf("Not found! %d isn't present in the list.\n", search);

    return 0;
}

