package packageforserialization;

public class SerializationClass {
	
    
    private String firstName;
	private String lastName;
	private int age;
	private double salary;
	private String gender;
	
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName=firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName=lastName;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age=age;
	}
	public double getsalary() {
		return salary;
	}
	public void setsalary(double slary) {
		this.salary=salary;
	}
	public String getgender() {
		return gender;
	}
	public void setgender(String gender) {
		this.gender = gender;
	}
	public void allmethod() {
		System.out.println(firstName  +"   "  +lastName  +"   " +age   +"   "  +gender  +"   " +salary);
	}
	

}
