package collection.java.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
        hm.put(01,"Aauysh");
        hm.put(02,"Harsh");
        hm.put(03,"Bhagyshri");
        hm.put(04,"Anushri");
        hm.put(05,"sonali");
        System.out.println("Hash set is an :" +hm);
        
        hm.put(null, null);
        hm.put(05,"Asad");
        System.out.println("HashSet is an :" +hm);
        System.out.println("Size of hash map is : "+ hm.size());
        //feching key-value pair by passing keys
        System.out.println("value of position :"+hm.get(1));
        //getting set of all keys
        System.out.println("The key set is : ");
        Set set=hm.keySet();
        Iterator itr=set.iterator();
        while (itr.hasNext()) {
			System.out.println( itr.next());
		}
        //getting values of all keys
        System.out.println("The values are : ");
        Collection value=hm.values();
        Iterator itr1= value.iterator();
        while (itr1.hasNext()) {
			System.out.println( itr1.next());
			
		}
        
	}

}
