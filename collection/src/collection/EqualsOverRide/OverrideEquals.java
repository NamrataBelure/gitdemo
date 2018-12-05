package collection.EqualsOverRide;

public class OverrideEquals {
	public static void main(String[] args) {
		Student s1=new Student(1,"anu");
		Student s2=new Student(2,"akash");
		Student s3=new Student(2, "akash");
		Student s4=s1;
		Student s5=new Student(3,"abc");
		
		System.out.println("s1 hashcode="+s1.hashCode());
		System.out.println("s2 hashcode="+s2.hashCode());
		System.out.println("s3 hashcode="+s3.hashCode());
		System.out.println("s5 hashcode="+s5.hashCode());
		System.out.println("checking equality between s4 and s1 ="+s1.equals(s4));
		System.out.println("checking equality between s2 and s3 ="+s2.equals(s3));
		System.out.println("checking equality between s2 and s5 ="+s2.equals(s5));
	}
}
