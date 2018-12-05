package collection.HashCodeAndEquals;

public class HashCode {
	public static void main(String[] args) {
		Student s1=new Student(1,"anu");
		Student s2=new Student(1, "anu");
		Student s3=new Student(2,"harsh");
		Student s4=s1;
		
		System.out.println("s1 hashcode="+s1.hashCode());
		System.out.println("s2 hashcode="+s2.hashCode());
		System.out.println("s3 hashcode="+s3.hashCode());
		System.out.println("checking equality between s1 and s2 ="+s1.equals(s2));
		System.out.println("checking equality between s1 and s4 ="+s1.equals(s4));
		System.out.println("checking equality between s3 and s2 ="+s3.equals(s2));

	}
  
  
}
