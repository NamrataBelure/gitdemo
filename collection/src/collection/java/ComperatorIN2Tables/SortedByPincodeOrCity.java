package collection.java.ComperatorIN2Tables;

import java.util.Comparator;

public class SortedByPincodeOrCity implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		int i=o1.getVendor().getPincode()-o2.getVendor().getPincode();
		if (i==0) {
			return o1.getVendor().getCity().compareTo(o2.getVendor().getCity());
		}
		return i;
	}

}
