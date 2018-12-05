package collection.java.Comperator;

import java.util.Comparator;

public class SortBynameRollNo implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int i =((Student) o1).getRollNo()-((Student) o2).getRollNo();
		if(i==0)
		return o1.getName().compareTo(o2.getName());
		return i;
	}

}
