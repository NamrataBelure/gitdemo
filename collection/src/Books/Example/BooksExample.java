package Books.Example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

import com.sun.corba.se.impl.presentation.rmi.StubFactoryFactoryStaticImpl;

public class BooksExample {

	public static void main(String[] args) {
		Map<Books, String> booksmap = new HashMap<>();

		Books b1 = new Books(101, "Let", "Yashwant", "BPB", 8);
		Books b2 = new Books(102, "Data", "Forouzan", "Mc", 4);
		Books b3 = new Books(103, "Os", "Galvin", "Wiley", 6);
        Books b4=b3;
        Books b5=b1;
        
		booksmap.put(b1, "x2");
		booksmap.put(b2, "x2");
		booksmap.put(b3, "x3");
		booksmap.put(b4, "x4");
		booksmap.put(b5, "x5");

		List<String> listOfKeys = BooksExample.getAllKeysForValue(booksmap, "x2");
		System.out.println("All keys---- " + listOfKeys);
	}

	static <K, V> List<K> getAllKeysForValue(Map<Books, String> booksmap, String i) {
		List<K> listOfKeys = null;
		if (booksmap.containsValue(i)) {
			listOfKeys = new ArrayList<>();
			for (Entry<Books, String> entry : booksmap.entrySet()) {
				if (entry.getValue().equals(i)) {
					listOfKeys.add((K) entry.getKey());
				}
			}
		}
		return listOfKeys;
	}

}
