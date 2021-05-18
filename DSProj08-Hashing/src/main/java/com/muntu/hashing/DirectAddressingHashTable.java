package com.muntu.hashing;

import java.util.Scanner;

public class DirectAddressingHashTable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of hash table");
		int capacity = sc.nextInt();
		HashTable table = new HashTable(capacity);
		for (int i = 0; i < capacity; i++) {
			System.out.println("Enter the key and value");
			int key = sc.nextInt();
			int value = sc.nextInt();
			table.insert(key, value);
		}
		table.printHashTable();
		System.out.println("size::"+table.getSize());
		System.out.println("Enter the key for value");
		int value=table.getElement(sc.nextInt());
		System.out.println("Searched value is::"+value);
		table.clear();
		System.out.println("size::"+table.getSize());
	}

}

class LinkedHash {
	public int key;
	public int value;
	public LinkedHash next;

	// Constructor
	public LinkedHash(int key, int value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}
}

class HashTable {
	private int table_size;
	private int size;
	private LinkedHash[] table;

	// Constructor
	public HashTable(int capacity) {
		size = 0;
		table_size = capacity;
		table = new LinkedHash[capacity];
		for (int i = 0; i < capacity; i++) {
			table[i] = null;
		}
	}

	// Function to insert a key value pair
	public void insert(int key, int value) {
		int hash = (key % table_size);
		if (table[hash] == null) {
			table[hash] = new LinkedHash(key, value);
		} else {
			LinkedHash entry = table[hash];
			while ((entry.next != null) && !(entry.key == key)) {
				entry = entry.next;
			}
			if (entry.key == key) {
				System.out.println("Duplicate key is not allowed!");
				return;
			} else {
				entry.next = new LinkedHash(key, value);
			}
		} // End of else
		size++;
	}// End of insert()

	public void printHashTable() {
		System.out.println("key        value");
		for (int i = 0; i < table_size; i++) {
			LinkedHash entry = table[i];
			
			if (entry != null) {
				while (entry != null) {
					System.out.println(entry.key + "              " + entry.value);
					System.out.println();
					entry = entry.next;
				} // end of while
			} // end of if
		} // End of for
	}// End of method

	/*To get the size of table*/
	public int getSize() {
		return size;
	}

	/*search element in table*/
	public int getElement(int key) {
		int hash = (key % table_size);
		if (table[hash] == null)
			return -1;
		else {
			LinkedHash entry = table[hash];
			while ((entry != null) && !(entry.key == key))
				entry = entry.next;

			if (entry == null)
				return -1;
			else
				return entry.value;
		} // End of else
	}// End of getElement

	public void clear() {
		for (int i = 0; i < table_size; i++) {
			table[i] = null;
		}
		size=0;
	}
}