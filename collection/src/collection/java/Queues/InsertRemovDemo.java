package collection.java.Queues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class InsertRemovDemo {
    public static void main(String[] args) {
    	int i=0;
    	Stack s=new Stack();
    	try {
			do {
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		        ArrayList al=new ArrayList();
				System.out.println("Enter the elements how want to u:");
				i=Integer.parseInt(br.readLine());
				s.push(new Integer(i));
			} while (i!=5);
			Iterator itr=s.listIterator();
			System.out.println("Displaying:");
			{
				System.out.println(""+itr.next());
			}
			System.out.println("poping elements in LIFO manner:");
			while (s!=null) {
				System.out.println(s.pop());
			}
		} catch (Exception e) {
			System.out.println(e);
			
		}
  }
}
