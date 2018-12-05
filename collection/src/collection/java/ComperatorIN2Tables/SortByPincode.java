package collection.java.ComperatorIN2Tables;

import java.util.Comparator;

public class SortByPincode implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
	
		return o1.getVendor().getPincode()-o2.getVendor().getPincode();
	}

	
}
