package collection.java.ComperatorIN2Tables;

import java.util.Comparator;

public class SortByCity implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
	return o1.getVendor().getCity().compareTo(o2.getVendor().getCity());
	}
}
