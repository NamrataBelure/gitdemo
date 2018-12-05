package LinkedHashmap;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class LinkedHashMapDmo {

	public static void main(String[] args) {
		Adderess ad1=new Adderess(412003, "pune");
		Adderess ad2=new Adderess(412000, "Mumbai");
		Adderess ad3=new Adderess(417000, "surat");
		
		college c1=new college(01,"Anu", ad1);
		college c2=new college(02,"sonu", ad2);
		college c3=new college(03,"Aishu", ad3);
		college c4=new college(04,"Anu", ad1);
		college c5=null;
		college c6=null;
		LinkedHashMap<college,String>collmap=new LinkedHashMap<>();
		collmap.put(c1, "X1");
		collmap.put(c2, "X2");
		collmap.put(c3, "X3");
		collmap.put(c4, "X4");
		collmap.put(c5, "x5");
		collmap.put(c6, "x6");
		
		System.out.println("Collage Data size is:"+collmap.size());
		System.out.println("Collage Data is:"+collmap);
		
		System.out.println("Iterator using Entry set:");
		for(Map.Entry<college, String>entry:collmap.entrySet()){
			System.out.print(" key: "+entry.getKey());
			System.out.print(" values: "+entry.getValue());
		}
		
		System.out.println("\nIterator using Keyset:");
		Set<college>set=collmap.keySet();
		Iterator<college>clgitr=set.iterator();
		while (clgitr.hasNext()) {
			System.out.print(clgitr.next()); 
		}
		
		IdentityHashMap<college,String>collmapI=new IdentityHashMap<>();
		collmapI.put(c1, "X1");
		collmapI.put(c2, "X2");
		collmapI.put(c3, "X3");
		collmapI.put(c4, "X4");
		collmapI.put(c5, "x5");
		collmapI.put(c6, "x6");
		System.out.println("\nIdentity map size:"+collmapI.size());
		System.out.println("\nCollage Data is Identity Map:"+collmapI);
	
	   WeakHashMap<college,String>collWeak=new WeakHashMap<>();
	   collWeak.put(c1, "X1");
	   collWeak.put(c2, "X2");
	   collWeak.put(c3, "X3");
	   collWeak.put(c4, "X4");
	   collWeak.put(c5, "x5");
	   collWeak.put(c6, "x6");
		System.out.println("WeakHashMap size is:"+collWeak.size());
		System.out.println("weakHashMap data is:"+collWeak);
	
	
	}

}
class college{
	private int sId;
	private String Name;
	private Adderess adderess;
	@Override
	public String toString() {
		return "\ncollege [sId=" + sId + ", Name=" + Name + ", adderess=" + adderess + "]";
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Adderess getAdderess() {
		return adderess;
	}
	public void setAdderess(Adderess adderess) {
		this.adderess = adderess;
	}
	/**
	 * @param sId
	 * @param name
	 * @param adderess
	 */
	public college(int sId, String name, Adderess adderess) {
		super();
		this.sId = sId;
		Name = name;
		this.adderess = adderess;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result=prime*result+getAdderess().getPinCode();
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		college other = (college) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if(getAdderess().getPinCode()!=other.getAdderess().getPinCode())
			return false;
		return true;
	}
	
}

class Adderess{
	private int pinCode;
	private String city;
	@Override
	public String toString() {
		return "\nAdderess [pinCode=" + pinCode + ", city=" + city + "]";
	}
	/**
	 * @param pinCode
	 * @param city
	 */
	public Adderess(int pinCode, String city) {
		super();
		this.pinCode = pinCode;
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pinCode;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Adderess other = (Adderess) obj;
		if (pinCode != other.pinCode)
			return false;
		return true;
	}
	
}