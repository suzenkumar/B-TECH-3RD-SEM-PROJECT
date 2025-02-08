/*DOUBLE LINK LIST ALL FUNCTION*/

#include<stdio.h>
#include<stdlib.h>

struct node {
    struct node *prev;
    struct node *next;
    int data;
};
struct node *head = NULL;  // Define head globally

void insertion_beginning();
void insertion_last();
void insertion_specified();

int main() {
    int choice = 0;
    while (choice != 9) {
        printf("\n****Main Menu****\n");
        printf("\n Choose one option from the following list ..\n");
        printf("\n.....\n");
        printf("\n1. Insert in beginning\n2. Insert at last\n3. Insert at any random location\n4. Delete from beginning\n5. Delete from last\n6. Delete the node after the given data\n7. Search\n8. Show\n9. Exit\n");
        printf("\n Enter your choice:\n");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                insertion_beginning();
                break;
            case 2:
                insertion_last();
                break;
            case 3:
                insertion_specified();
                break;
            // Other cases like delete, search, etc., can be implemented as needed.
        }
    }
    return 0;
}

void insertion_beginning() {
    struct node *ptr;
    int item;
    ptr = (struct node *)malloc(sizeof(struct node));

    if (ptr == NULL) {
        printf("\nOVERFLOW");
    } else {
        printf("\nEnter item value: ");
        scanf("%d", &item);
        ptr->data = item;
        ptr->next = head;
        ptr->prev = NULL;

        if (head != NULL) {
            head->prev = ptr;
        }
        head = ptr;
        printf("\nNode Inserted at the beginning\n");
    }
}

void insertion_last() {
    struct node *ptr, *temp;
    int item;
    ptr = (struct node *)malloc(sizeof(struct node));

    if (ptr == NULL) {
        printf("\nOVERFLOW");
    } else {
        printf("\nEnter item value: ");
        scanf("%d", &item);
        ptr->data = item;
        ptr->next = NULL;

        if (head == NULL) {
            ptr->prev = NULL;
            head = ptr;
        } else {
            temp = head;
            while (temp->next != NULL) {
                temp = temp->next;
            }
            temp->next = ptr;
            ptr->prev = temp;
        }
        printf("\nNode Inserted at the end\n");
    }
}

void insertion_specified() {
    struct node *ptr, *temp;
    int item, loc, i;
    ptr = (struct node *)malloc(sizeof(struct node));

    if (ptr == NULL) {
        printf("\nOVERFLOW");
    } else {
        printf("\nEnter the location: ");
        scanf("%d", &loc);

        temp = head;
        for (i = 1; i < loc; i++) {
            temp = temp->next;
            if (temp == NULL) {
                printf("\nThere are less than %d elements\n", loc);
                return;
            }
        }

        printf("\nEnter item value: ");
        scanf("%d", &item);
        ptr->data = item;

        ptr->next = temp->next;
        ptr->prev = temp;
        if (temp->next != NULL) {
            temp->next->prev = ptr;
        }
        temp->next = ptr;

        printf("\nNode Inserted at location %d\n", loc);
    }
}

