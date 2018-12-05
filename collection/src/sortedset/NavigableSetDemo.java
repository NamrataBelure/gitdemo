package sortedset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {
	NavigableSet<Integer>ns=new TreeSet<>();
	ns.add(0);
	ns.add(1);
	ns.add(2);
	ns.add(3);
	ns.add(4);
	ns.add(5);
	System.out.println("Normal set:"+ns);
	NavigableSet<Integer>threeOrMore=ns.tailSet(3, true);
	System.out.println("3 or more:"+threeOrMore);
	System.out.println("lower:"+ns.lower(3));
	System.out.println("floor:"+ns.floor(3));
	System.out.println("higher:"+ns.higher(3));
	System.out.println("ceiling"+ns.ceiling(3));
	System.out.println("pollFirst:"+ns.pollFirst());
	System.out.println("pollLast:"+ns.pollLast());
	ns.add(10);
	ns.add(11);
	ns.add(12);
	ns.add(13);
	ns.add(14);
	ns.add(15);
	System.out.println("Normal set:"+ns);
	NavigableSet<Integer>reverseNs=ns.descendingSet();
	System.out.println("Reverse order:"+reverseNs);
	//System.out.println("13 or more:"+threeOrMore);
	System.out.println("lower:"+ns.lower(13));
	System.out.println("floor:"+ns.floor(13));
	System.out.println("higher:"+ns.higher(13));
	System.out.println("ceiling"+ns.ceiling(13));
	System.out.println("pollFirst:"+ns.pollFirst());
	System.out.println("pollLast:"+ns.pollLast()); 
	}

}
