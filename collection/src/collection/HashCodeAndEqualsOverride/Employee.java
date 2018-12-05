package collection.HashCodeAndEqualsOverride;

public class Employee {
	private String name;
	private int eId;
	private int Salary;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", eId=" + eId + ", Salary=" + Salary + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	/**
	 * @param name
	 * @param eId
	 * @param salary
	 */
	public Employee(String name, int eId, int salary) {
		super();
		this.name = name;
		this.eId = eId;
		this.Salary = salary;
	}
	
	@Override
	public int hashCode() {
		return this.geteId();
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj){
			return true;
		}else if(obj==null){
		return false;
		}
		else if(getClass()!=obj.getClass()){
			return false;
		}
		return true;
	   /*Employee e= null;
		if (obj instanceof Employee) {
			 e=(Employee) obj;	
		}
		
		if (this.geteId()==e.geteId()&&this.name.equals(e.name)) {
			return true;
		}
		else{
			return false;
	     }	
	   */
	
	}
}

