package com.muntu.test;

import java.util.Scanner;

import com.muntu.queue.CQueue;

public class CQueueTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		CQueue q = new CQueue(size);
		while (true) {
			System.out.println("1:Insert");
			System.out.println("2:Delete");
			System.out.println("3:Display");
			int option = sc.nextInt();

			switch (option) {

			case 1:
				System.out.println("Input the element for the Insertion in queue");
				int data = sc.nextInt();
				q.insert(data);
				break;

			case 2:
				q.del();
				break;

			case 3:
				q.display();
				break;
			}
		}

	}

}
