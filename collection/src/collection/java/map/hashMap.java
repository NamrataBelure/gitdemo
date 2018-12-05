package collection.java.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashMap {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(01,"Anu");
		hm.put(02,"sonu");
		hm.put(03,"sanu");
		hm.put(04,"Akash");
	 Set<Map.Entry> st=hm.entrySet();//return set view
	 for (Entry entry : st) {
		System.out.println(entry.getKey()+":");
		System.out.println(entry.getValue());
	}
	}

}
