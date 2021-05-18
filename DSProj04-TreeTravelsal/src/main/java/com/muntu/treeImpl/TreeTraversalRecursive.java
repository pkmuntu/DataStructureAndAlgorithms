package com.muntu.treeImpl;

import com.muntu.node.Node;
import com.muntu.queue.CQueue;

public class TreeTraversalRecursive {

	public Node root;

	public void preOrderTravelsal(Node node) {
		if (node == null)
			return;
		System.out.print(node.data + " ");
		preOrderTravelsal(node.left);
		preOrderTravelsal(node.right);

	}

	public void inOrderTravelsal(Node node) {
		if (node == null)
			return;
		inOrderTravelsal(node.left);
		System.out.print(node.data + " ");
		inOrderTravelsal(node.right);
	}

	public void postOrderTravelsal(Node node) {
		if (node == null)
			return;
		postOrderTravelsal(node.left);
		postOrderTravelsal(node.right);
		System.out.print(node.data + " ");
	}

	public int hightOfTree(Node node) {
		if (node == null)
			return -1;
		int left = hightOfTree(node.left);
		int right = hightOfTree(node.right);
		if (left > right)
			return left + 1;
		else
			return right + 1;
	}

	public int sizeOfTree(Node node) {
		if (node == null)
			return 0;
		else {
			int leftNumber = sizeOfTree(node.left);
			int rightNumber = sizeOfTree(node.right);
			return leftNumber + rightNumber + 1;
		}
	}

	CQueue queue = new CQueue(20);

	public void levelOrderTraversal(Node node) {
		if (node == null)
			return;
		queue.insert(node);
		while (!queue.isEmpty()) {

			node = queue.del();
			System.out.print(node.data+" ");
			if (node.left != null)
				queue.insert(node.left);
			if (node.right != null)
				queue.insert(node.right);
		}

	}

}
