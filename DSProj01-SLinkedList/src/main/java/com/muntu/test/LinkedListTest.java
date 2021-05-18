package com.muntu.test;

import com.muntu.LinkedList.LinkedList;

public class LinkedListTest 
{
    public static void main( String[] args )
    {
       LinkedList list=new LinkedList();
       list.insertAtBegin(2);
       list.insertAtEnd(3);
       list.insertAtBegin(1);
       list.insertAtEnd(5);
       list.insert(3, 4);
       list.print();
       list.del(4);
       list.print();
       list.del(5);
       list.print();
       list.del(1);
       list.print();
       
    }
}
