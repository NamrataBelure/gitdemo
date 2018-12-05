package collection.java.ComperatorIN2Tables;

import java.util.ArrayList;
import java.util.Collections;

import collection.java.Comperator.SortByName;
import collection.java.Comperator.SortByRollNo;

public class MainTest {

	public static void main(String[] args) {
	
		Vendor v1=new Vendor("pune",413101);
		Vendor v2=new Vendor("solapur",412002);
		Vendor v3=new Vendor("mumbai",412002);
		
		Product p1=new Product(01,"anu",v1);
		Product p2=new Product(02,"taher",v3);
		Product p3=new Product(03,"akash",v2);
		
	   ArrayList<Product> list=new ArrayList<>();
	    list.add(p1);
	    list.add(p2);
	    list.add(p3);	 
	    
		System.out.println("unsorted list:");
        for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
      
        Collections.sort(list,new SortByPincode());
       
        System.out.println("\n Sorted By pincodewise:");
        for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
        
        Collections.sort(list,new SortByCity());
        System.out.println("\n Sorted By cityWise:");
        for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
        
        Collections.sort(list,new SortedByPincodeOrCity());
        System.out.println("\n Sorted By pincode vs cityWise:");
        for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
