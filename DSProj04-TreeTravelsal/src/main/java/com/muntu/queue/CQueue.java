package com.muntu.queue;

import com.muntu.node.Node;

public class CQueue {

	public int front = -1;
	int rear = -1;
	int max;
	Node[] cqueue_arr;

	public CQueue(int size) {
		max = size;
		cqueue_arr = new Node[size];
	}

	public void insert(Node node) {
		if ((front == 0 && rear == max - 1) || (front == rear + 1)) {
			System.out.println("Queue Overflow");
			return;
		}
		if (front == -1)// if queue is empty
		{
			front = 0;
			rear = 0;
		} else if (rear == max - 1)// rear is at a last position of queue
		{
			rear = 0;
		} else {
			rear = rear + 1;
		}
		cqueue_arr[rear] = node;
	}// End of insertion

	public Node del() {
		if (front == -1) {
			System.out.println("Queue Underflow");
			return null;
		}
		Node n= cqueue_arr[front];
		if (front == rear) {
			front = -1;
			rear = -1;
		} else if (front == max - 1)
			front = 0;
		else
			front = front + 1;
		return n;
	}// End of del()

	public void display() {
		int front_pos = front, rear_pos = rear;
		if (front == -1) {
			System.out.println("Queue is empty");
			return;
		}
		System.out.println("Queue elements : ");
		if (front_pos <= rear_pos)
			while (front_pos <= rear_pos) {
				System.out.print(cqueue_arr[front_pos] + " ");
				front_pos++;
			}
		else {
			while (front_pos <= max - 1) {
				System.out.print(cqueue_arr[front_pos] + " ");
				front_pos++;
			}
			front_pos = 0;
			while (front_pos <= rear_pos) {
				System.out.print(cqueue_arr[front_pos] + " ");
				front_pos++;
			}
		} // End of else
		System.out.println();
	}// End of display()

	public boolean isEmpty() {
		if (front == -1)
			return true;
		else
			return false;
	}
}
