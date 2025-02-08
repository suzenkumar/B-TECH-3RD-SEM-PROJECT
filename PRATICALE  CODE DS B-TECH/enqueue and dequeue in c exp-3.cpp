//enqueue  and dequeue operation in c ||exp-3|| date of experiment 25/7/24 ||
#include<stdio.h>
#include<stdlib.h>

// Define the queue size
#define n 5

// The queue is created, and front and back are initialized
int queue[n];
int back = 0;
int front = 0;

// Function prototypes
int enqueue(int data);
int dequeue();
void print();

int main() {
    int ch, data;

    // A loop to run the program while the user wants
    while (1) {
        printf("1. Enqueue\n2. Dequeue\n3. Print\n0. Quit\n");
        printf("Give your choice: ");
        scanf("%d", &ch);

        switch (ch) {
            case 1:
                // Input number to enqueue
                printf("Enter number to enqueue: ");
                scanf("%d", &data);
                if (enqueue(data))
                    printf("Enqueue operation successful\n");
                else
                    printf("Queue is full\n");
                break;

            case 2:
                data = dequeue();
                if (data)
                    printf("Dequeued data: %d\n", data);
                else
                    printf("Queue is empty\n");
                break;

            case 3:
                print();
                break;

            case 0:
                exit(0);

            default:
                printf("Invalid choice\n");
        }
        printf("\n");
    }
}

// Enqueue function
int enqueue(int data) {
    // Check if the queue is full
    if (back == n) {
        return 0;
    }
    queue[back] = data;
    back++;
    return 1;
}

// Dequeue function
int dequeue() {
    // Check if the queue is empty
    if (front == back) {
        return 0;
    } else {
        int data = queue[front];
        front++;
        return data;
    }
}

// Print the current queue
void print() {
    if (front != back) {
        printf("Queue: ");
        for (int i = front; i < back; i++) {
            printf("%d ", queue[i]);
        }
        printf("\n");
    } else {
        printf("Queue is empty\n");
    }
}

