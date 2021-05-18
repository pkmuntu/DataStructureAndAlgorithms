package com.muntu.test;

import java.util.Scanner;

import com.muntu.sort.QuickSort;

public class QuickSortTest {

	public static void main(String[] args) {

		QuickSort b=new QuickSort();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array::");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the element in array::");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Element of array before sorting::");
		b.display(array);
		b.quickSort(array,0,size-1);
		System.out.println("Element of array after sorting::");
		b.display(array);
	}
}
