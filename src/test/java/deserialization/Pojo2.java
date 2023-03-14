package deserialization;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Pojo2 {
	Pojo1Deserialization obj=new Pojo1Deserialization();
	
	@Test(enabled=false)
	public void pojo1() {
		System.out.println(obj);
		obj.setfirstName("Suresh");
		obj.setlastName("Mehra");
		obj.setage("26");
		obj.setsalary(10000.5454);
		System.out.println(obj.allrecords());
		System.out.println(obj.getid());
		System.out.println(obj.getfirstName());
		
		Response res = RestAssured.given().baseUri("https://reqres.in/api/users")
				.contentType(ContentType.JSON).body(obj).post();
		System.out.println(res.asPrettyString());
		JsonPath jpath = res.jsonPath();
		System.out.println(jpath.get("id"));
		String a= jpath.get("id");
		obj.setid(a);
		String b=obj.getid();
		System.out.println(b);
	}
	
	@Test(priority=0)
	public void getpojo1() throws JsonProcessingException {

		Response res = RestAssured.given().baseUri("http://localhost:3000/posts/4").get();
		System.out.println(res.asPrettyString());
		
		obj= res.as(Pojo1Deserialization.class);
		
		System.out.println(obj.allrecords());
		System.out.println(obj.getfirstName());
		System.out.println(obj.getid());
		System.out.println(obj.getage());
		System.out.println(obj);
	}

	@Test(priority=1)
	public void bb() throws JsonProcessingException {
		
		System.out.println(obj);
		ObjectMapper objofmapper = new ObjectMapper();
		String bb=objofmapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		System.out.println(bb);
	}
	
}
