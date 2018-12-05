package collection.java.Queues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReverseOrder {

	public static void main(String[] args) {
		String str;
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			ArrayList al=new ArrayList();
			System.out.println("Enter the element how want to u:");
		    int i=Integer.parseInt(br.readLine());
		    for (int j = 0; j <i; j++) {
				System.out.println("Enter the string:");
				str=br.readLine();
				al.add(str);
			}
		    System.out.println("Before the Reverse order,ArrayList contains:"+al);
		    Collections.reverse(al);
		    System.out.println("After the reverse order,ArrayList Contains:"+al);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
