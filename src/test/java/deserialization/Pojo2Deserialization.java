package deserialization;

public class Pojo2Deserialization {
	public String firstName;
	public String lastName;
	public String age;
	public double salary;
	public int id;
	
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
	public void setid(int id) {
		this.id=id;
	}
	public int getid() {
		return id;
	}
	public String allrecords() {
		return (firstName +"    "+ lastName +"    "+age +"    " + "    " +salary  +"   " +id);
	}
	
	
}
