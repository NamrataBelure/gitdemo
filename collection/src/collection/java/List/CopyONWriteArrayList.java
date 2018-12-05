package collection.java.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;
  public class CopyONWriteArrayList extends Thread{
   
	  static CopyOnWriteArrayList l = new CopyOnWriteArrayList();
		
		public static void main(String[] args) 
					throws InterruptedException
		{
			l.add("A");
			l.add("B");
			l.add("C");
			Iterator itr = l.iterator();
			
			while (itr.hasNext())
			{
				String s = (String)itr.next();
				System.out.println(s);
				
				if (s.equals("B"))
				{
					// Throws RuntimeException
					itr.remove();
				}
				Thread.sleep(1000);
			}
			System.out.println(l);
		}
	}