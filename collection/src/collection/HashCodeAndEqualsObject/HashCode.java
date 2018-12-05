package collection.HashCodeAndEqualsObject;

public class HashCode {
	public static void main(String[] args) {
		Student s1=new Student(1,"anu");
		Student s2=new Student(1, "anu");
		
		System.out.println("s1 hashcode="+s1.hashCode());
		System.out.println("s2 hashcode="+s2.hashCode());
		System.out.println("checking equality between s1 and s2 ="+s1.equals(s2));
	}
  
  
}
