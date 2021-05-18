package com.muntu.sort;

public class QuickSort {

	public static int partition(int a[], int low, int high) {
		int i, j, temp, key;
		key = a[low];
		i = low + 1;
		j = high;
		while (true) {
			while (i < high && key >= a[i])
				i++;
			while (key < a[j])
				j--;
			if (i < j) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			} else {
				temp = a[low];
				a[low] = a[j];
				a[j] = temp;
				return j;
			}
		}
	}

	public void quickSort(int[] a, int low, int high) {
		int j;
		if (low < high) {
			j = partition(a, low, high);
			quickSort(a, low, j - 1);
			quickSort(a, j+ 1, high);
		}
	}

	public void display(int[] array) {
		for (int a : array) {
			System.out.print(a + " ");
		}
		System.out.println();
	}// End of display
}
