package packageforserialization;

import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test1 {
	
	@Test
	public void vipin() throws IOException {
		Response res = RestAssured.given().baseUri("http://localhost:3000/posts/2").get();
		System.out.println(res.asPrettyString());
		String ressss=res.asString();
		System.out.println(ressss);
		System.out.println("-------------response----------");
		SClass objofSClass = new SClass();
		//objofSClass = res.as(SClass.class);
//		System.out.println(objofSClass.firstName);
//		System.out.println(objofSClass.lastName);
//		System.out.println(objofSClass.age);
//		System.out.println(objofSClass.salary);
//		System.out.println(objofSClass.id)
//		ObjectMapper objofMapper = new ObjectMapper();
//		String ress = objofMapper.writerWithDefaultPrettyPrinter().writeValueAsString(objofSClass);
//		System.out.println(ress);
		System.out.println(objofSClass);
		ObjectMapper objofMapper = new ObjectMapper();
		objofSClass = objofMapper.readValue(ressss, SClass.class);
		System.out.println(objofSClass.firstName);
		
	}

}
