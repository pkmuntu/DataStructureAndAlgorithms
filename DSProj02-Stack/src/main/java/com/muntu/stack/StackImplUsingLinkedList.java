package com.muntu.stack;

import com.muntu.commans.Node;

public class StackImplUsingLinkedList {

	Node head = null;

	public void push(int num) {
		Node newNode = new Node(num);
		if (head == null) {
			head = newNode;
		} else {
			newNode.link = head;
			head = newNode;
		}

	}

	public int pop() {
		
		if(head==null) {
			System.out.println("Stack Underflow");
		   return -1;
		}
		int data=head.data;
		head=head.link;
	   return data;
	}
	
	public void display()
	{
		Node temp=head;
		if(temp==null)
		   System.out.println("Stack is empty:");
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.link;
		}
		System.out.println();
	}
}
