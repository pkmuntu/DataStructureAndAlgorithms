package com.muntu.hashing;

public class DAT {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 6, 8, 4, 3, 2, 7, 10, 1, 10, 8, 7, 4 };
		int[] freq = new int[15];
		for (int i = 0; i < 15; i++) {
			freq[arr[i]]++;
		}
		for (int i = 0; i < 15; i++) {
			if (freq[i] != 0)
				System.out.println("Frequency of " + i + " is ::" + freq[i]);
		}
	}

}
