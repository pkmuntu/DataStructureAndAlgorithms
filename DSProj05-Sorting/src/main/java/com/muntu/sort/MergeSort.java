package com.muntu.sort;

public class MergeSort {
	int[] sarr;

	public MergeSort(int size) {
		sarr = new int[size];
	}

	private void merge(int[] arr, int low, int mid, int high) {
		int i = low;
		int j = mid + 1;
		int k = low;
		int m = 0;
		for (int a : arr) {
			sarr[m] = a;
			m++;
		}
		while (i <= mid && j <= high) {
			if (sarr[i] < sarr[j]) {
				arr[k] = sarr[i];
				i = i + 1;
				k = k + 1;
			} else {
				arr[k] = sarr[j];
				j = j + 1;
				k = k + 1;
			}
		}
		while (i <= mid) {
			arr[k] = sarr[i];
			i = i + 1;
			k = k + 1;
		}
		while (j <= high) {
			arr[k] = sarr[j];
			j = j + 1;
			k = k + 1;
		}

	}

	public void mergeSort(int[] arr, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}

	public void display(int[] array) {
		for (int a : array) {
			System.out.print(a + " ");
		}
		System.out.println();
	}// End of display
}
