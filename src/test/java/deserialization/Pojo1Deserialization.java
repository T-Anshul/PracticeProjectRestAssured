package deserialization;

public class Pojo1Deserialization {
	private String firstName;
	private String lastName;
	private String age;
	private double salary;
	private String id;
	
	public void setfirstName(String fname) {
		firstName=fname;
	}
	public String getfirstName() {
		return firstName;
	}
	public void setlastName(String lname) {
		lastName = lname;
	}
	public String getlastName() {
		return lastName;
	}
	public void setage(String age) {
		this.age=age;
	}
	public String getage() {
		return age;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	public double getsalary() {
		return salary;
	}
	public void setid(String idd) {
		id=idd;
	}
	public String getid() {
		return id;
	}
	public String allrecords() {
		return (firstName +"    "+ lastName +"    "+age +"   "
				+ " " + "    " +salary  +"   " +id);
	}
	
	
}
