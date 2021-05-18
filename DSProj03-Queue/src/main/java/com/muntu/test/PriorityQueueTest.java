package com.muntu.test;

import java.util.Scanner;

import com.muntu.queue.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		PriorityQueue q=new PriorityQueue();
		while(true) {
			  System.out.println("1:Insert");
			  System.out.println("2:Delete");
			  System.out.println("3:Display");
			  System.out.println("4:Exit");
			  System.out.print("Enter your choice:: ");
			  
			  int choice=sc.nextInt();
			  switch(choice) {
			           
			  case 1:System.out.print("Enter the data::");
			               int data=sc.nextInt();
			               System.out.print("Enter the priority::");
			               int item_priority=sc.nextInt();
			               q.insert(data, item_priority);
			               break;
			               
			  case 2: q.del();
			               break;
			               
			  case 3:q.display();
			                break;
			               
			  case 4: System.exit(4);
			  
			  default :System.out.println("Wrong choice");
			  }
		}
		
	}
}
