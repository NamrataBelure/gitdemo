package collection.java.Treeset;

import java.util.TreeSet;

public class TreeSetDemo {
public static void main(String[] args) {
	boolean ba[]= new boolean[5];
	TreeSet ts=new TreeSet<>();
	ba[0]=ts.add("A");
	ba[1]=ts.add("B");
	ba[2]=ts.add("C");
	ba[3]=ts.add("D");
	ba[4]=ts.add("E");
	//duplicate are not allowed
	ba[4]=ts.add("A");
	for (int i = 0; i < ba.length; i++) {
		System.out.println(""+ba[i]);
	}
	System.out.println(ts);
}
}
