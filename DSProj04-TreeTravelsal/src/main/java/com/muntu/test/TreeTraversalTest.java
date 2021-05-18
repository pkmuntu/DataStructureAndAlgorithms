package com.muntu.test;

import com.muntu.node.Node;
import com.muntu.treeImpl.TreeTraversalRecursive;

public class TreeTraversalTest {

	public static void main(String[] args) {

		TreeTraversalRecursive t = new TreeTraversalRecursive();
		t.root = new Node(1);
		t.root.left = new Node(2);
		t.root.right = new Node(3);
		t.root.left.left = new Node(4);
		t.root.left.right = new Node(5);
		t.root.right.left = new Node(6);
		t.root.right.right = new Node(7);

		System.out.println("Pre order travelsal is: ");
		t.preOrderTravelsal(t.root);

		System.out.println("\n");
		System.out.println("In order travelsal is: ");
		t.inOrderTravelsal(t.root);

		System.out.println("\n");
		System.out.println("Post order travelsal: ");
		t.postOrderTravelsal(t.root);

		System.out.println("\n");
		System.out.println("Hight of tree is: " + t.hightOfTree(t.root));

		System.out.println("\n");
		System.out.println("Size of tree is : " + t.sizeOfTree(t.root));

		System.out.println("\n");
		System.out.println("level order travelsal: ");
		t.levelOrderTraversal(t.root);

	}

}
