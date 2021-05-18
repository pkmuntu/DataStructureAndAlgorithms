package com.muntu.queue;

import com.muntu.commans.Node;

public class PriorityQueue {

	Node front;
	
	public void insert(int data,int item_priority){
		Node newNode=null,q=null;
	    newNode=new Node(data,item_priority);
		//Queue is empty or item to be added has priority more then first item
		if(front==null||item_priority<front.priority) {
			newNode.link=front;
			front=newNode;
		}
		else
		{
			q=front;
			while(q.link!=null&&q.link.priority<=item_priority) {
				q=q.link;
			}
			newNode.link=q.link;
			q.link=newNode;
		}//End of else
	}//End of insert
	
	
	public void del() {
		Node temp;
		if(front==null) {
			System.out.println("Queue Underflow");
		}
		else {
			temp=front;
			System.out.println("Deleted item id::"+front.info);
			front=front.link;
		}
	}//End of del()
	
	public void display() {
		Node ptr;
		ptr=front;
		if(front==null) {
			System.out.println("Queue id empty");
		}
		else
		{
			System.out.println("Queue is: ");
			System.out.println("[priority   item]");
			while(ptr!=null) {
				System.out.println(ptr.priority+"		        "+ptr.info);
				ptr=ptr.link;
			}//End of else
			
		}//End of display()
	}
}
