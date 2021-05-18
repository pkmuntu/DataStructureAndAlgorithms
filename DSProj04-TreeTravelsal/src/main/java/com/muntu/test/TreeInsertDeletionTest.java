package com.muntu.test;

import java.util.Scanner;

import com.muntu.treeImpl.TreeInsertionAndDeletion;

public class TreeInsertDeletionTest {

	public static void main(String[] args) {
		TreeInsertionAndDeletion tree;
		int data;
		Scanner sc = new Scanner(System.in);
		tree = new TreeInsertionAndDeletion();
		while (true) {
			System.out.println("\nEnter your choice");
			System.out.println("1:Insertion");
			System.out.println("2:Deletion");
			System.out.println("3:Display");
			System.out.println("4:Search");
			System.out.println("5:Exit");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				System.out.println("Enter the element you want to insert");
				data = sc.nextInt();
				tree.insert(data);
				break;

			case 2:
				System.out.println("Enter the element you want to delete");
				data = sc.nextInt();
				tree.delete(data);
				break;

			case 3:
				tree.inOrder(tree.root);
				break;

			case 4:
				System.out.println("Enter the element want to search ::");
			    data=sc.nextInt();
				tree.search(data);
				break;
				
			case 5:
				System.exit(5);

			default:
				System.out.println("Wrong choice");

			}
		}
	}

}
