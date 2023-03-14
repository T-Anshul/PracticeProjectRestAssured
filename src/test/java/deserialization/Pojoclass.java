package deserialization;

import org.testng.annotations.Test;

public class Pojoclass {
	
		/*{
			"firstName": "prerna",
			"lastName": "sharma",
			"age": 28,
			"Salary": 1000.54,
			"IsMarried":true,
			"TechSkill":{
							"programming language": "c++",
							"web automation": "selenium",
							"API testing": "Rest Assured"
						}
							
		}*/
		private String firstName;
		private String lastName;
		private String gender;
		private int age;
		private double salary;
		
		
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setlastName(String lastName) {
			this.lastName= lastName;
		}
		public String getlastName() {
			return lastName;
		}
		public void setGender(String gender) {
			this.gender=gender;
		}
		public String getGender() {
			return gender;
		}
		public void setAge(int age) {
			this.age=age;
		}
		public int getAge() {
			return age;
		}
		public void setDouble(double salary) {
			this.salary=salary;
		}
		public double getSalary() {
			return salary;
		}
		
}
