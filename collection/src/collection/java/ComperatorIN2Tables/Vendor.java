package collection.java.ComperatorIN2Tables;

public class Vendor {
private String city;
private int pincode;
@Override
public String toString() {
	return "\n Vendor [city=" + city + ", pincode=" + pincode + "]";
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
/**
 * @param city
 * @param pincode
 */
public Vendor(String city, int pincode) {
	super();
	this.city = city;
	this.pincode = pincode;
}


}
