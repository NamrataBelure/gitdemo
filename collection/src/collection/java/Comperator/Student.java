package collection.java.Comperator;

public class Student {
int rollNo;
String name;
String adderess;

public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAdderess() {
	return adderess;
}

public void setAdderess(String adderess) {
	this.adderess = adderess;
}

public Student(int rollNo, String name, String adderess) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.adderess = adderess;
}

@Override
public String toString() {
	return "\nStudent [rollNo=" + rollNo + ", name=" + name + ", adderess=" + adderess + "]";
}

}
