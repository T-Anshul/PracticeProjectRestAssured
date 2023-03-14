package packageForTest1;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test15 {
	@Test
	public void test15() {
//		given().baseUri("https://reqres.in").basePath("/api/users?page=2")
//		
//		.when().get()
//		
//		//.then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("reqresSchema.json")).log().all();
//		.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(new File("C:\\Users\\Gyan\\Desktop\\jschema.json"))).log().all();
		
		JSONObject user1 = new JSONObject();
		user1.put("name", "prachi");
		user1.put("lastName", "gupta");
		user1.put("age", 28);
		user1.put("Salary", 10000.56);
		JSONObject user2 = new JSONObject();
		user2.put("name", "prerna");
		user2.put("lastName", "gupta");
		user2.put("age", 24);
		user2.put("Salary", 20000.56);
		JSONObject user3 = new JSONObject();
		user3.put("name", "preety");
		user3.put("lastName", "sharma");
		user3.put("age", 18.5);
		user3.put("Salary", 40000.56);
		//ArrayList<Object> arr = new ArrayList<Object>();
		JSONArray arr = new JSONArray();
		arr.add(user1);
		arr.add(user2);
		arr.add(user3);
		System.out.println(arr);
		Response res = RestAssured.given().baseUri("https://reqres.in/api/users").contentType(ContentType.JSON).body(arr).post();
		res.prettyPrint();
		Assert.assertEquals(res.getStatusCode(), 201,"comments");
		res.then().assertThat().statusCode(201);
		
		
		
	}
}
