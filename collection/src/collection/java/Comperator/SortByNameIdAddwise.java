package collection.java.Comperator;

import java.util.Comparator;

public class SortByNameIdAddwise implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
	int i=o1.getRollNo()-o2.getRollNo();
	if (i==0) 	
		return i;
	 int l=o1.getName().compareTo(o2.getName());
		if (l==0) 
	return o1.getAdderess().compareTo(o2.getAdderess());
	
	return l;
	}

}
