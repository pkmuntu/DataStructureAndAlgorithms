package com.muntu.search;

public class SortedAndRotatedArraySearch {

	public int binarySearch(int[] arr, int low, int high, int data) {
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == data)
				return mid;
			if (arr[mid] > data)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}

	public int pivot(int[] arr, int start, int end) {
		if (start > end)
			return -1;
		int mid = start + (end - start) / 2;
		if (mid > start && arr[mid] < arr[mid - 1])
			return mid;
		if (mid < end && arr[mid] > arr[mid + 1])
			return mid + 1;
		if (arr[start] > arr[mid])
			return pivot(arr, start, mid - 1);
		return pivot(arr, mid + 1, end);
	}

	public int findKey(int[] arr, int n, int data) {
		int pivot = pivot(arr, 0, n - 1);
		if (pivot == -1)
			return binarySearch(arr, 0, n - 1, data);
		if (arr[pivot] == data)
			return pivot;
		if (arr[0] <=data)
			return binarySearch(arr, 0, pivot - 1, data);
		return binarySearch(arr, pivot + 1, n - 1, data);
	}

}
