package com.muntu.hashing;

import java.util.Scanner;

public class QuadraticProbing {

	public static void main(String[] args) {
   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of hash table");
		int capacity=sc.nextInt();
		QuadraticTableSlot table=new QuadraticTableSlot(capacity);
		for(int i=0;i<capacity;i++) {
			System.out.println("Enter the key - value pair");
			int key=sc.nextInt();
			int value=sc.nextInt();
			table.insert(key, value);
		}
		table.display();
		System.out.println("Enter the element want to search");
		int key=sc.nextInt();
		System.out.println("Element present ?"+table.search(key));
		System.out.println("size::"+table.getSize());
		table.clear();
		System.out.println("After clear  table::");
		System.out.println("size::"+table.getSize());
	}

}

class QuadraticSlots {

	int key;
	int value;

	public QuadraticSlots(int key, int value) {
		this.key = key;
		this.value = value;
	}
}

class QuadraticTableSlot {

	private int size;
	private int table_size;
	private QuadraticSlots[] table;

	/*Constructor*/
	public QuadraticTableSlot(int capacity) {
		size = 0;
		table_size = capacity;
		table = new QuadraticSlots[capacity];
		for (int i = 0; i < capacity; i++) {
			table[i] = null;
		}
	}// End of constructor

	/*Function to get size */
	public int getSize() {
		return size;
	}

	/*Function to clear*/
	public void clear() {
		for (int i = 0; i < table_size; i++) {
			table[i] = null;
		}
		size = 0;
	}

	/*Function to insert key-value pairs */
	public void insert(int key, int value) {
		int index = key % table_size;
		int i = index;
		int p=1;
		do {
			if (table[i] == null) {
				table[i] = (QuadraticSlots) new QuadraticSlots(key, value);
				size++;
				return;
			}
			if (table[i].key == key) {
				System.out.println("Duplicate element is not allowed!");
			}
			i = (i + p*p) % table_size;
			p++;
		} while (i != index);
		System.out.println("HashTable is full!");
	}// End of method

	/*Function to search to key*/
	public boolean search(int key) {
		int index = key % table_size;
		int i = index;
		int p=1;
		do {
			if (table[i] == null)
				return false;
			if (table[i].key == key)
				return true;
			i = (i + p*p) % table_size;
			p++;
		} while (i != index);
		return false;
	}

	/*Function to display*/
	public void display() {
		for (int i = 0; i < table_size; i++) {
			if (table[i] == null)
				System.out.println("Element is not present at position index[" + i + "]");
			else
				System.out.println("Element present at index[" + i + "] ::" + table[i].value);
		}
	}
}