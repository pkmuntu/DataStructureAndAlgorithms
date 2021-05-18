package com.muntu.sort;

public class SelectionSort {

	public void sort(int[] array) {
		int min;
		int temp;
		for (int i = 0; i < array.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min])
					min = j;
			} // End of inner loop
			temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		} // End of outer loop

	}// End of sort()

	public void display(int[] array) {
		for (int a : array) {
			System.out.print(a + " ");
		}
		System.out.println();
	}// End of display
}
