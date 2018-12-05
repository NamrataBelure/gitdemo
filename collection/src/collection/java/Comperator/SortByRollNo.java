package collection.java.Comperator;

import java.util.Comparator;

public class SortByRollNo implements Comparator<Student> {

	@Override
	public int compare(Student a, Student b) {
		return a.rollNo-b.rollNo;
	}

	
}
