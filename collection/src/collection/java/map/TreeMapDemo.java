package collection.java.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap ts= new TreeMap();
        ts.put(01,"kartik");
        ts.put(02,"Pavan");
        ts.put(03,"viju");
        ts.put(04,"Rajesh");
        ts.put(05,"vijay");
        System.out.println("Tree map value is:"+ts);
        System.out.println("Tree map Size is:"+ts.size());
	    System.out.println("value:"+ts.get(01));
	    System.out.println("Keyset is:");
	    Set set=ts.keySet();
	    Iterator itr=set.iterator();
	    while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	System.out.println("Value Are:");
	Collection value=ts.values();
	Iterator itr1=value.iterator();
	while (itr1.hasNext()) {
		System.out.println(itr1.next());	
   }	
 }
}
