package com.muntu.test;

import java.util.Scanner;

import com.muntu.search.BinarySearch;

public class BinarySearchTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BinarySearch b = new BinarySearch();
		System.out.println("Enter the size of array ::");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the element of array::");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.println("Enter the element want to search::");
		int data = sc.nextInt();
		System.out.println("_____________BinarySearchIterative_________________");
		int index = b.binarySearchIterative(arr, 0, n - 1, data);
		if (index == -1)
			System.out.println("Element " + data + " not found!");
		else
			System.out.println("Element exit at index::" + index);
		System.out.println("_____________BinarySearchRecursive_________________");
		index = b.binarySearchRecursive(arr, 0, n - 1, data);
		if (index == -1)
			System.out.print("Element " + data + " not found!");
		else
			System.out.println("Element exit at index::" + index);
	}

}
