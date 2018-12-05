package collection.HashcodeOverRide;

public class product {
private int pId;
private String name;
@Override
public String toString() {
	return "product [pId=" + pId + ", name=" + name + "]";
}
public int getpId() {
	return pId;
}
public void setpId(int pId) {
	this.pId = pId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
/**
 * @param pId
 * @param name
 */
public product(int pId, String name) {
	super();
	this.pId = pId;
	this.name = name;
}
@Override
public int hashCode() {
	return this.getpId();
}
}
