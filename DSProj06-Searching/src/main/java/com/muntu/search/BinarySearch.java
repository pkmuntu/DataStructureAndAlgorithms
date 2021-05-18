package com.muntu.search;

public class BinarySearch {

	public int binarySearchRecursive(int[] arr, int low, int high, int data) {
		if (low > high)
			return -1;
		int mid = low + (high - low) / 2;
		if (arr[mid] == data)
			return mid;
		if (data < arr[mid])
			return binarySearchRecursive(arr, low, mid - 1, data);
		return binarySearchRecursive(arr, mid + 1, high, data);
	}

	public int binarySearchIterative(int[] arr, int low, int high, int data) {

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (data == arr[mid])
				return mid;
			if (arr[mid] > data)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}

}
