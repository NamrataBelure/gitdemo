import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import collection.java.map.hashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,Double> map= new HashMap<String,Double>();
		map.put("Akash",87.55);
		map.put("Anushri",58.58);
		map.put("Harsh",60.65);
		map.put("amay",70.58);
		map.put(null, null);
		map.put("sandesh", null);
		
		System.out.println("Size of map:"+map.size());
		System.out.println("......");
		
		System.out.println("Elements are...");
		Set set= map.keySet();
		
		Iterator keysetIterator=set.iterator();
		while (keysetIterator.hasNext()) {
			Object key = (Object) keysetIterator.next();
			System.out.println(key+":"+map.get(key));
		}
		
		System.out.println("...........");
		
		
		System.out.println("Does this map has Akash as key?"+map.containsKey("Anushri"));
		System.out.println("Does this map has 70.58 as value?"+map.containsValue(70.58));
		System.out.println("..........");
		
		System.out.println("value removed from the map :"+map.remove("amay"));

	}

}
