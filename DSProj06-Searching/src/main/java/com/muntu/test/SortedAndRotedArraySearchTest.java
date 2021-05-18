package com.muntu.test;

import java.util.Scanner;

import com.muntu.search.SortedAndRotatedArraySearch;

public class SortedAndRotedArraySearchTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);System.out.println("Enter number of Test case ");
		int t = sc.nextInt();
		SortedAndRotatedArraySearch b = new SortedAndRotatedArraySearch();
		System.out.println("Enter the size of array ::");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the element of array::");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		while (t-- > 0) {
			
			System.out.println("Enter the element want to search::");
			int data = sc.nextInt();
			System.out.println("_____________SortedAndRotatedArray_________________");
			int index = b.findKey(arr, n, data);
			if (index == -1)
				System.out.println("Element " + data + " not found!");
			else
				System.out.println("Element exit at index::" + index);
		}
	}
}
