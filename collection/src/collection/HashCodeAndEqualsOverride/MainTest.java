package collection.HashCodeAndEqualsOverride;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainTest {

	public static void main(String[] args) {
		Hashtable<Employee,String> hash=new Hashtable<>();
		hash.put(new Employee("Anu", 01, 18000),"Anu");
		hash.put(new Employee("Deepali", 02,25000),"Deepali");
		hash.put(new Employee("Anju", 03,20000),"Anju");
		hash.put(new Employee("Aasd",04,35000), "Aasd");
		hash.put(new Employee("Anu", 01, 18000),"Anu");
		hash.put(new Employee("Aasd",04,35000), "Aasd");
		System.out.println("Employee details:");
		/*Set<employee>key=hash.keySet();
		for (employee emp : key) {
			System.out.println("key: "+ hash.get(emp)+" And "+ "values are: "+hash.values());
			
		}*/
		Set<Entry<Employee, String>>entryset=hash.entrySet();
		Iterator<Entry<Employee, String>>entryitr=entryset.iterator();
		while (entryitr.hasNext()) {
			Map.Entry<Employee,String> entry = entryitr.next();
			System.out.println("key is:"+entry.getKey()+"values are:"+entry.getValue());
		}
      System.out.println("Duplicate recover:");
	}
}
