package collection.java.Queues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Cities {

	public static void main(String[] args) {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    ArrayList al=new ArrayList();
    String str;
    try {
		System.out.println("Enter the Name of City:");
		System.out.println("Enter stop to quit");
		do {
			str=br.readLine();
			al.add(str);
		} while (!str.equals("stop"));
	} catch (Exception e) {
		e.getMessage();
	}
   System.out.println("Displaying Array List :"+ al);
   al.clear();
   System.out.println("After Removing All elements : " +al);
	}

}
