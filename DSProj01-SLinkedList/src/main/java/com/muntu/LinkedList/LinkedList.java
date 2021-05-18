package com.muntu.LinkedList;

public class LinkedList {

	Node head = null;

	public void insertAtBegin(int data) {
		Node newNode = new Node(data);
		newNode.link = head;
		head = newNode;
	}

	public void insertAtEnd(int data) {
		Node temp = head;
		Node newNode = new Node(data);
		if (head == null)
			head = newNode;
		while (temp.link != null)
			temp = temp.link;

		temp.link = newNode;
	}

	public void insert(int num, int data) {
		Node temp = head;
		for (int count = 1; count < num; count++) {
			if (temp.link == null) {
				System.out.println("There is less number of node present");
				return;
			}
			temp = temp.link;
		}
		Node newNode = new Node(data);
		newNode.link = temp.link;
		temp.link = newNode;
	}

	public void del(int data) {
		if (head == null)
			System.out.println("List is empty");
		if (head.data == data) {
			head = head.link;
			return;
		}
		Node temp = head;
		while (temp.link.link != null) {

			if (temp.link.data == data) {
				temp.link = temp.link.link;
				return;
			}
			temp = temp.link;
		}
		if (temp.link.data == data)
			temp.link = null;
		else
			System.out.println("There is no such element present in the list");
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data+" ");
			temp=temp.link;
		}
		System.out.println();
	}

}
