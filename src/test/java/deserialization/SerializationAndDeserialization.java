package deserialization;

import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SerializationAndDeserialization {
	@Test	
	public void CreateJsonObjectFromClassObject() throws IOException {
		Pojoclass objofpojo = new Pojoclass();
		objofpojo.setFirstName("suresh");
		objofpojo.setlastName("mehra");
		objofpojo.setGender("female");
		objofpojo.setAge(24);
		objofpojo.setDouble(10000.5454);
		System.out.println(objofpojo.getFirstName());
		System.out.println(objofpojo);
		
//		ObjectMapper objofObjectmapper = new ObjectMapper();
//		//String var = objofObjectmapper.writeValueAsString(objofpojo);
//		//System.out.println(var);
//		//System.out.println(objofObjectmapper.writeValueAsString(objofpojo));
//		//System.out.println(objofObjectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(objofpojo));
//		System.out.println(objofObjectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(objofpojo));
		System.out.println("--------------------below is Response------------------");
		
		Response res = RestAssured.given().baseUri("https://reqres.in/api/users").contentType(ContentType.JSON).body(objofpojo).post();
		res.prettyPrint();
		//System.out.println(res.getHeaders());
		System.out.println("--------------------below is 2ndResponse------------------");
//		Pojoclass secondobj = new Pojoclass();
//		secondobj = objofpojo;
		
//		Response res2 = RestAssured.given().baseUri("https://reqres.in/api/users").contentType(ContentType.JSON).body(secondobj).post();
//		res2.prettyPrint();
		ObjectMapper objmap = new ObjectMapper();
		String str= objmap.writeValueAsString(objofpojo);
		System.out.println(str);
		Pojoclass secondobj = objmap.readValue(str, Pojoclass.class);
		System.out.println(secondobj.getFirstName());
	}
}
