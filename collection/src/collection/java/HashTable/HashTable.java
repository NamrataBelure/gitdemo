
//WAP to accept the name and rollno of student & store it in 
// hash table &display the contain of the hashtable...
package collection.java.HashTable;
import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		Enumeration names;
		Hashtable<String,String> hash=new Hashtable<String,String>();
        hash.put("1","anu");
        hash.put("2","aayush");
        hash.put("3", "sambhvi");
        hash.put("4","sanvi");
        
        names=hash.keys();
        while (names.hasMoreElements()) {
			String key = (String) names.nextElement();
			System.out.println("key:"+key+" & values:"+hash.get(key));
		}       
	}
}
