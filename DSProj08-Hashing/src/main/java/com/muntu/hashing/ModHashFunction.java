package com.muntu.hashing;

public class ModHashFunction {

	public static void main(String[] args) {

		int[] arr = { 11, 172, 456, 678, 343, 875 };
		int[] hash = new int[10];
		for (int i = 0; i < 10; i++) {
			hash[i] = -1;
		}
		// inserting record in hash table
		for (int i = 0; i < 6; i++) {
			hash[arr[i] % 10] = arr[i];
		}
		// Displaying hash table
		for (int i = 0; i < 10; i++) {
			System.out.println("Element at position " + i + " is::" + hash[i]);
		}

		// searching of element in hash table
		if (hash[172% 10] == -1) {
			System.out.println("Element is not present");
		} else
			System.out.println("Element is present");

	}

}
