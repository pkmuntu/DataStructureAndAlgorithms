package com.muntu.sort;

public class BubbleSort {

	public void sort(int[] array) {
		int temp = 0, count = 0;
		for (int i = 0; i < array.length - 1; i++) {

			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					count = 1;
				}
			} // inner loop
			if (count == 0)
				return;
			count = 0;
		} // outer loop
	}// method

	public void display(int[] array) {
		for (int a : array) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
}
