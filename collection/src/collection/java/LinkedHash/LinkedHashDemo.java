package collection.java.LinkedHash;

import java.util.LinkedHashSet;

public class LinkedHashDemo {

	public static void main(String[] args) {
		boolean[]ba=new boolean[6];
		LinkedHashSet hs=new LinkedHashSet();
		ba[0]=hs.add("a");
		ba[1]=hs.add("b");
		ba[2]=hs.add("c");
		ba[3]=hs.add("d");
		ba[4]=hs.add("e");
		//duplicate are not allowed
		ba[5]=hs.add("a");
		for (int i = 0; i < ba.length; i++) {
			System.out.println(""+ba[i]);
		}
        //order is as per inserting the items
        System.out.println(""+hs);
	}

}
