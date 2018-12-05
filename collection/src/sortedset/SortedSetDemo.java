package sortedset;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
	
	public static void main(String[] args) {
	SortedSet<String>sets=new TreeSet<>();
	sets.add("java");
	sets.add("C#");
	sets.add("c");
	
	System.out.println("Sorted set is:"+sets);
	System.out.println("First Element is:"+sets.first());
	System.out.println("Last Element is:"+sets.last());

	SortedSet<String>beforeCode=sets.headSet("Quiz");
	System.out.println(beforeCode);
	
	SortedSet<String>betweenCodeAndQuiz=sets.subSet("code","partices");
	System.out.println(betweenCodeAndQuiz);
	
	SortedSet<String>afterCode=sets.tailSet("code");
	System.out.println(afterCode);
	}

}
