package com.muntu.treeImpl;

import com.muntu.node.Node;

public class TreeInsertionAndDeletion {
	public Node root;

	public void insert(int key) {
		root = insertNodeRec(root, key);
	}

	public Node insertNodeRec(Node node, int key) {
		if (node == null) {
			node = new Node(key);
			return node;
		}
		if (key < node.data) {
			node.left = insertNodeRec(node.left, key);
		} else if (key > node.data) {
			node.right = insertNodeRec(node.right, key);
		}
		return node;
	}

	public void delete(int key) {
		if (root == null) {
			System.out.println("Tree is empty");
			return;
		}
		root = deleteNodeRec(root, key);
	}

	public Node deleteNodeRec(Node node, int key) {

		if (key < node.data) {
			node.left = deleteNodeRec(node.left, key);
		} else if (key > node.data) {
			node.right = deleteNodeRec(node.right, key);
		} else {
			if (node.left == null)
				return node.right;
			else if (node.right == null)
				return node.left;
			node.data = minimumVal(node.right);
			node.right = deleteNodeRec(node.right, node.data);
		}
		return node;
	}

	public int minimumVal(Node node) {
		int minValue = node.data;
		while (node.left != null) {
			minValue = node.left.data;
			node = node.left;
		}
		return minValue;
	}

	public void inOrder(Node node) {
		if (node == null)
			return;
		inOrder(node.left);
		System.out.print(node.data + "	");
		inOrder(node.right);
	}

	public void search(int key) {

		Node node = searchRec(root, key);
		if (node != null)
			System.out.println("Element " + key + " found");
		else
			System.out.println("Element " + key + " not found");
	}

	Node searchRec(Node node, int key) {
		if (node == null || node.data == key)
			return node;
		if (key < node.data)
			return searchRec(node.left, key);
		else
			return searchRec(node.right, key);
	}
}
