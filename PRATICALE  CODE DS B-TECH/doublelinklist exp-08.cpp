//Double link list || exp-08||date of expriment-||
#include <stdio.h>
#include <stdlib.h>

struct node {
    struct node *prev;
    struct node *next;
    int data;
};

struct node *head = NULL;

void insertion_beginning();
void insertion_last();
void insertion_specified();
void deletion_beginning();
void deletion_last();
void deletion_specified();
void display();
void search();

int main() {
    int choice = 0;
    while (choice != 9) {
        printf("\n********* Main Menu *********\n");
        printf("Choose one option from the following list ...\n");
        printf("1. Insert at beginning\n");
        printf("2. Insert at last\n");
        printf("3. Insert at a specified location\n");
        printf("4. Delete from beginning\n");
        printf("5. Delete from last\n");
        printf("6. Delete the node after a given data\n");
        printf("7. Search\n");
        printf("8. Show\n");
        printf("9. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1: insertion_beginning(); break;
            case 2: insertion_last(); break;
            case 3: insertion_specified(); break;
            case 4: deletion_beginning(); break;
            case 5: deletion_last(); break;
            case 6: deletion_specified(); break;
            case 7: search(); break;
            case 8: display(); break;
            case 9: exit(0);
            default: printf("Please enter a valid choice.\n");
        }
    }
    return 0; // Change main return type to int
}

void insertion_beginning() {
    struct node *ptr;
    int item;
    ptr = (struct node *)malloc(sizeof(struct node));
    if (ptr == NULL) {
        printf("OVERFLOW\n");
    } else {
        printf("Enter Item value: ");
        scanf("%d", &item);
        ptr->data = item;
        ptr->prev = NULL;
        ptr->next = head;

        if (head != NULL) {
            head->prev = ptr;
        }
        head = ptr;
        printf("Node inserted\n");
    }
}

void insertion_last() {
    struct node *ptr, *temp;
    int item;
    ptr = (struct node *)malloc(sizeof(struct node));
    if (ptr == NULL) {
        printf("OVERFLOW\n");
    } else {
        printf("Enter value: ");
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
        printf("Node inserted\n");
    }
}

void insertion_specified() {
    struct node *ptr, *temp;
    int item, loc, i;
    ptr = (struct node *)malloc(sizeof(struct node));
    if (ptr == NULL) {
        printf("OVERFLOW\n");
        return;
    }
    printf("Enter the location (0-based index): ");
    scanf("%d", &loc);
    
    temp = head;
    for (i = 0; i < loc && temp != NULL; i++) {
        temp = temp->next;
    }

    if (i != loc) {
        printf("There are less than %d elements\n", loc);
        free(ptr); // Free memory if location is invalid
        return;
    }

    printf("Enter value: ");
    scanf("%d", &item);
    ptr->data = item;
    ptr->next = temp;

    if (temp != NULL) {
        ptr->prev = temp->prev;
        if (temp->prev != NULL) {
            temp->prev->next = ptr;
        } else {
            head = ptr; // Inserting at head
        }
        temp->prev = ptr;
    } else {
        // Inserting at the end
        ptr->prev = NULL;
    }
    printf("Node inserted\n");
}

void deletion_beginning() {
    struct node *ptr;
    if (head == NULL) {
        printf("UNDERFLOW\n");
    } else {
        ptr = head;
        head = head->next;
        if (head != NULL) {
            head->prev = NULL;
        }
        free(ptr);
        printf("Node deleted\n");
    }
}

void deletion_last() {
    struct node *ptr;
    if (head == NULL) {
        printf("UNDERFLOW\n");
    } else {
        ptr = head;
        while (ptr->next != NULL) {
            ptr = ptr->next;
        }
        if (ptr->prev != NULL) {
            ptr->prev->next = NULL;
        } else {
            head = NULL; // List is now empty
        }
        free(ptr);
        printf("Node deleted\n");
    }
}

void deletion_specified() {
    struct node *ptr, *temp;
    int val;
    printf("Enter the data after which the node is to be deleted: ");
    scanf("%d", &val);
    
    ptr = head;
    while (ptr != NULL && ptr->data != val) {
        ptr = ptr->next;
    }
    
    if (ptr == NULL || ptr->next == NULL) {
        printf("Can't delete\n");
    } else {
        temp = ptr->next;
        ptr->next = temp->next;
        if (temp->next != NULL) {
            temp->next->prev = ptr;
        }
        free(temp);
        printf("Node deleted\n");
    }
}

void display() {
    struct node *ptr = head;
    printf("Printing values:\n");
    while (ptr != NULL) {
        printf("%d\n", ptr->data);
        ptr = ptr->next;
    }
}

void search() {
    struct node *ptr;
    int item, i = 0;
    ptr = head;
    if (ptr == NULL) {
        printf("Empty List\n");
        return;
    }
    printf("Enter item which you want to search: ");
    scanf("%d", &item);
    while (ptr != NULL) {
        if (ptr->data == item) {
            printf("Item found at location %d\n", i + 1);
            return; // Exit on first match
        }
        i++;
        ptr = ptr->next;
    }
    printf("Item not found\n");
}

