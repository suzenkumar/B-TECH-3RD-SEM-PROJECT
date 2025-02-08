//infix to postfix expression
#include<limits.h>
#include<stdio.h>
#include<stdlib.h>
#define MAX20

char stk[20];
int top=-1;

int isEmpty()
{
	return top==-1;
}
int isFull()
{
	return top==MAX-1;
}

char peek()
{
	return stk[top];
}

char pop()
{
	if(isEmpty())
	return-1;
	
	char ch=stk[top];
	top--;
	return(ch);
}

void push(char oper)
{
	if(isFull())
	printf("Stack Full!!!!");
	
	else{
		top++;
		stk[top]=oper;
	}
}

