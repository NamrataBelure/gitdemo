package collection.HashcodeOverRide;

public class mainTest {

	public static void main(String[] args) {
	 product p1=new product(01,"mobile");
     product p2=new product(02,"laptop");
     product p3=new product(03,"tv");
     product p4=p1;
     product p5=new product(02, "laptop");
     
     System.out.println("p1 hashcode="+p1.hashCode());
     System.out.println("p2 hashcode="+p2.hashCode());
     System.out.println("p3 hashcode="+p3.hashCode());
     System.out.println("p4 hashcode="+p4.hashCode());
     System.out.println("p5 hashcode="+p5.hashCode());
     System.out.println("checking equality p1 and p4 ="+ p1.equals(p4));
     System.out.println("checking equality p2 and p5 ="+ p2.equals(p5));
	}

}
