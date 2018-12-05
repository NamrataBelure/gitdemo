package collection.java.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		ArrayList a2=new ArrayList<>();
		  al.add("a");
		  al.add("b");
		  al.add("c");
		  
		  a2.add("a");
		  a2.add("b");
		  a2.add("d");
		  a2.add("e");
		  
		  System.out.println(al.containsAll(a2));
		  System.out.println("Contain:"+al);
		  al.retainAll(a2);
		  System.out.println("Retain All:"+al);
		  
		  al.removeAll(a2);
		  System.out.println("Remove:"+al);
		  System.out.println("Remove a2:"+a2);
		  
		  
      Iterator itr=al.iterator();     
      while (itr.hasNext()) {
		String s = (String) itr.next();
			if(s.equals("b")){
				itr.remove();
			}
			System.out.println(al);
		}
	}

}
