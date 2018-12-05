package collection.java.ComperatorIN2Tables;

public class Product {
private int id;
private String name;
private Vendor vendor;
@Override
public String toString() {
	return "\nProduct [id=" + id + ", name=" + name + ", vendor=" + vendor + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Vendor getVendor() {
	return vendor;
}
public void setVendor(Vendor vendor) {
	this.vendor = vendor;
}
/**
 * @param id
 * @param name
 * @param vendor
 */
public Product(int id, String name, Vendor vendor) {
	super();
	this.id = id;
	this.name = name;
	this.vendor = vendor;
}


}
