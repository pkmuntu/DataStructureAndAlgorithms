package com.muntu.test;

import com.muntu.node.Node;
import com.muntu.treeImpl.TreeTraversalIterative;


public class TreeTraversalIterativeTest {

	public static void main(String[] args) {

		TreeTraversalIterative t = new TreeTraversalIterative();
		t.
		rootI = new Node(1);
		t.rootI.left = new Node(2);
		t.rootI.right = new Node(3);
		t.rootI.left.left = new Node(4);
		t.rootI.left.right = new Node(5);
		t.rootI.right.left = new Node(6);
		t.rootI.right.right = new Node(7);

		System.out.println("Pre order travelsal is: ");
		t.preOrder(t.rootI);

		System.out.println("\n");
		System.out.println("In order travelsal is: ");
		t.inOrder(t.rootI);

		System.out.println("\n");
		System.out.println("Post order travelsal: ");
		t.postOrder(t.rootI);

		
	}

}
