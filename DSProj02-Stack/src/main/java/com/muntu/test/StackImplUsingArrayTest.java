package com.muntu.test;

import java.util.Scanner;

import com.muntu.stack.StackImplUsingArray;

public class StackImplUsingArrayTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Stack size");
		int n = sc.nextInt();
		StackImplUsingArray stack = new StackImplUsingArray(n);

		while (true) {
			System.out.println("1:push()");
			System.out.println("2:pop()");
			System.out.println("3:display()");
			System.out.println("4:Exit");
			int option = sc.nextInt();
			switch (option) {

			case 1:
				System.out.print("Enter the number want to push: ");
				int num = sc.nextInt();
				stack.push(num);
				break;

			case 2:
				int data=stack.pop();
				if(data!=-1)
				System.out.println("popped element is: "+data);
				break;

			case 3:
				stack.display();
				break;

			case 4:
				System.exit(4);

			}
		}

	}

}
