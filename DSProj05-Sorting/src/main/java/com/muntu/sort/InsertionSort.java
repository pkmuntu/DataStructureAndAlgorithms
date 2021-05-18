package com.muntu.sort;

public class InsertionSort {

	public void sort(int[] arr) {
		int n = arr.length;
		int key, j;
		for (int i = 1; i < n; i++) {
			key = arr[i];
			j = i;
			while (j >= 1 && arr[j - 1] > key) {
				arr[j] = arr[j - 1];
				j--;
			} // End of while loop
			arr[j] = key;
		} // End of for loop
	}// method

	public void display(int[] array) {
		for (int a : array) {
			System.out.print(a + " ");
		}
		System.out.println();
	}// End of display
}
