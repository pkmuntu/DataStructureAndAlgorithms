package com.muntu.stack;

public class StackImplUsingArray {

	int top = -1;
	int max;
	int[] stack;

	public StackImplUsingArray(int max) {
		this.max = max;
		stack = new int[max];
	}

	public void push(int n) {
		if (top == max - 1) {
			System.out.println("Stack overflow");
			return;
		}
		stack[++top] = n;
	}
	
	public int  pop() {
		if(top==-1)
		{
			System.out.println("Stack Underflow");
			return -1;
		}
		return stack[top--];
	}
	
	
	public void display() {
		int num=top;
		while(num!=-1) {
			System.out.print(stack[num]+" ");
			num--;
		}System.out.println();
		
	}

}
