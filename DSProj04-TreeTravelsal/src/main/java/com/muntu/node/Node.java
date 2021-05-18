package com.muntu.node;

public class Node {

	public int data;
	public Node left;
	public Node right;

	// 1-param constructor
	public Node(int item) {
		data = item;
		left=right=null;
	}

}
