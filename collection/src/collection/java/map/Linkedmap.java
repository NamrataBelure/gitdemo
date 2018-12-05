package collection.java.map;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Linkedmap {

	public static void main(String[] args) {
		LinkedHashMap hm=new LinkedHashMap<>();
		hm.put("Amul", new Double(3434.30));
		hm.put("Anushri", new Double(1234.30));
		hm.put("Aauysh", new Double(3514.50));
		hm.put("Akash", new Double(99.22));
		hm.put("Amar", new Double(-19.80));
		
		Set<Map.Entry> st=hm.entrySet();
		for (Map.Entry data : st) {
			System.out.println(data.getKey()+":");
			System.out.println(data.getValue());
		}
	}

}
