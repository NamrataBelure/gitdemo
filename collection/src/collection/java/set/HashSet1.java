package collection.java.set;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		//unsorted,unorderd set
		//use hashcode of the object being insorted
		boolean []br=new boolean[7];
		HashSet hs= new HashSet();
		br[0]=hs.add("A");
		br[1]=hs.add("B");
		br[2]=hs.add("C");		
		br[3]=hs.add("G");
		br[4]=hs.add("D");
		
     
		//duplicates are not allowed
		br[5]=hs.add("A");
		
		//without duplicates we add any kind of elements
		br[6]=hs.add("p");

		for (int i = 0; i < br.length; i++) {
			System.out.println(""+br[i]);
		}
		//order is unpredicatble
		System.out.println(""+hs);
	
	}

}
