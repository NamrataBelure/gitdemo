package collection.java.Queues;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
	LinkedList list=new LinkedList();
     list.add(0,1);
     list.add(1,15);
     list.add(2,30);
     list.add(3,50);
     System.out.println("The linked list is:"+list);
     list.addFirst(5);
     list.addLast(6);
     System.out.println("After adding linked list is :"+list);
     //list.removeFirst();
     list.removeLast();
	System.out.println("after removing Linked list is:"+list);
	}

}
