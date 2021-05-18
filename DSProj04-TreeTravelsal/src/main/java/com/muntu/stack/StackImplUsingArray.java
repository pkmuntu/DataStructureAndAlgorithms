package com.muntu.stack;

import com.muntu.node.Node;

public class StackImplUsingArray {

	int top = -1;
	int max;
	Node[] stack;

	public StackImplUsingArray(int max) {
		this.max = max;
		stack = new Node[max];
	}

	public void push(Node node) {
		if (top == max - 1) {
			System.out.println("Stack overflow");
			return;
		}
		stack[++top] = node;
	}

	public Node pop() {
		if (top == -1) {
			System.out.println("Stack Underflow");
			return null;
		}
		return stack[top--];
	}

	public void display() {
		int num = top;
		while (num != -1) {
			System.out.print(stack[num] + " ");
			num--;
		}
		System.out.println();

	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	public Node peek() {
		return stack[top];
	}

}
