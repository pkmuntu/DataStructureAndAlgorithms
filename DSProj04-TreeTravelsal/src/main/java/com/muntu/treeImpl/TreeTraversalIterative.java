package com.muntu.treeImpl;

import com.muntu.node.Node;
import com.muntu.stack.StackImplUsingArray;

public class TreeTraversalIterative {

	public Node rootI;

	public void preOrder(Node root) {

		Node cur;
		Node[] s = new Node[20];
		int top = -1;
		if (root == null) {
			System.out.println("Tree is empty");
			return;
		}
		cur = root;
		for (;;) {
			while (cur != null) {
				System.out.print(cur.data + " ");
				s[++top] = cur;
				cur = cur.left;
			}
			if (top != -1) {
				cur = s[top--];
				cur = cur.right;
			} else {
				return;
			} // End of else
		} // End of for loop
	}// End of preOrder()

	public void inOrder(Node root) {

		Node cur;
		Node s[] = new Node[20];
		int top = -1;
		if (root == null) {
			System.out.println("Tree is empty");
			return;
		}
		cur = root;
		for (;;) {
			while (cur != null) {
				s[++top] = cur;
				cur = cur.left;
			}
			if (top != -1) {
				cur = s[top--];
				System.out.print(cur.data + " ");
				cur = cur.right;
			} else {
				return;
			} // End of else
		} // End of for loop
	}// End of inOrder()

	/*public void postOrder(Node root) {
		
	   class Stack{
		Node add;
		int flag;
		}
	   Node cur;
	   Stack s[]=new Stack[20];
	   int top=-1;
	   if(root==null) {
		   System.out.println("Tree is empty");
		   return;
	   }
	   cur=root;
	   for( ; ;) {
		   
		   while(cur!=null) {
			   top++;
			   s[top].add=cur;
			   s[top].flag=1;
			   cur=cur.left;
		   }
		   while(s[top].flag<0) {
			   cur=s[top].add;
			   top--;
			   System.out.print(cur.data+" ");
			   if(top==-1)
				   return;
		   }
		   cur=s[top].add;
		   cur=cur.right;
		   s[top].flag=-1;
	   }
	}*/
	public void postOrder(Node node) {
		StackImplUsingArray stack = new StackImplUsingArray(20);
		while (true) {
			while (node != null) {
				stack.push(node);
				stack.push(node);
				node = node.left;
			}
			// check for empty stack
			if (stack.isEmpty())
				return;
			node=stack.pop();
			if ((!stack.isEmpty()) && (stack.peek() == node))
				node = node.right;
			else {
					System.out.print(node.data + " ");
			node = null;
			}
		}
	}
}
