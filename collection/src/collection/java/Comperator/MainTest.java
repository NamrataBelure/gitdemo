package collection.java.Comperator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainTest {

	public static void main(String[] args) {
		ArrayList<Student>ar=new ArrayList<Student>();
        ar.add(new Student(01,"Akash","pune"));
        ar.add(new Student(03,"Anushri","Surat"));
        ar.add(new Student(04,"Harsh","Solapur"));
        ar.add(new Student(02,"Taher","pune"));
        
        System.out.println("unsorted list:");
        for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
      
        Collections.sort(ar,new SortByRollNo());
       
        System.out.println("\n Sorted By RollNoWise:");
        for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
        
        Collections.sort(ar,new SortByName());
        System.out.println("\n Sorted By NameWise:");
        for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

        Collections.sort(ar,new SortBynameRollNo());
        System.out.println("\n Sorted By NamerollnoWise:");
        for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
        
        Collections.sort(ar,new SortByNameIdAddwise());
        System.out.println("\n Sorted By name id adderess wish:");
        for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	
	}

}



