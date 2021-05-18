package com.muntu.commans;

public class Node {

	public int priority;
	public int info;
	public Node link;

	public Node(int data, int priority) {
		this.info = data;
		this.priority = priority;
	}
}
