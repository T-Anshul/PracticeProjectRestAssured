package deserialization;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Pojo1 {
	Pojo1Deserialization obj=new Pojo1Deserialization();
	
	@Test(enabled=false)
	public void pojo1() {
		obj.setfirstName("Suresh");
		obj.setlastName("Mehra");
		obj.setage("26");
		obj.setsalary(10000.5454);
		System.out.println(obj.allrecords());
		System.out.println();
		
		
		Response res = RestAssured.given().baseUri("https://reqres.in/api/users").contentType(ContentType.JSON).body(obj).post();
		System.out.println(res.asPrettyString());
	}
	
	@Test
	public void getpojo1() throws JsonProcessingException {
//		Response res =RestAssured.given().baseUri("http://localhost:3000/posts/3").get();
//		System.out.println(res.asPrettyString());
//		res.as(Pojo1Deserialization.class);
//		Pojo1Deserialization obj2 = new Pojo1Deserialization();
//		System.out.println(obj2.allrecords());
//		System.out.println(obj2.getfirstName());
//		System.out.println(obj.getfirstName());
		
		Response res = RestAssured.given().baseUri("http://localhost:3000/posts/4").get();
		System.out.println(res.asPrettyString());
		Pojo1Deserialization obj4 = new Pojo1Deserialization();
		obj4= res.as(Pojo1Deserialization.class);
		System.out.println(obj4.allrecords());
		System.out.println(obj4.getfirstName());
		System.out.println(obj4.getid());
		
		ObjectMapper obj5 = new ObjectMapper();
		String employeeJson = obj5.writerWithDefaultPrettyPrinter().writeValueAsString(obj4);
		System.out.println(employeeJson); 
//		Pojo1Deserialization obj3 = RestAssured.given().baseUri("http://localhost:3000/posts/3").get().as(Pojo1Deserialization.class);
//		System.out.println(obj3.allrecords());
	}
}
