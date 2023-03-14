package packageForSerializationAndDeserialization;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test17 {
	@Test
	public void test15() {
//		given().baseUri("https://reqres.in").basePath("/api/users?page=2")
//		
//		.when().get()
//		
//		//.then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("reqresSchema.json")).log().all();
//		.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(new File("C:\\Users\\Gyan\\Desktop\\jschema.json"))).log().all();
		
//		JSONObject user1 = new JSONObject();
//		user1.put("name", "prachi");
//		user1.put("lastName", "gupta");
//		user1.put("age", 28);
//		user1.put("Salary", 10000.56);
//		JSONObject user2 = new JSONObject();
//		user2.put("name", "prerna");
//		user2.put("lastName", "gupta");
//		user2.put("age", 24);
//		user2.put("Salary", 20000.56);
//		JSONObject user3 = new JSONObject();
//		user3.put("name", "preety");
//		user3.put("lastName", "sharma");
//		user3.put("age", 18.5);
//		user3.put("Salary", 40000.56);
//		//ArrayList<Object> arr = new ArrayList<Object>();
//		JSONArray arr = new JSONArray();
//		arr.add(user1);
//		arr.add(user2);
//		arr.add(user3);
//		System.out.println(arr);
//		Response res = RestAssured.given().baseUri("https://reqres.in/api/users").contentType(ContentType.JSON).body(arr).post();
//		res.prettyPrint();
//		Assert.assertEquals(res.getStatusCode(), 201,"comments");
//		res.then().assertThat().statusCode(201);
//		
//		Map<String,Object> user1 = new HashMap<String,Object>();
//		user1.put("name", "prachi");
//		user1.put("lastName", "gupta");
//		user1.put("age", 28);
//		user1.put("Salary", 10000.56);
//		Map<String,Object> user2 = new HashMap<String,Object>();
//		user2.put("name", "prerna");
//		user2.put("lastName", "gupta");
//		user2.put("age", 24);
//		user2.put("Salary", 20000.56);
//		Map<String,Object> user3 = new HashMap<String,Object>();
//		user3.put("name", "preety");
//		user3.put("lastName", "sharma");
//		user3.put("age", 18.5);
//		user3.put("Salary", 40000.56);
		//JSONArray arr = new JSONArray();
		//ArrayList arr = new ArrayList();
//		//List<Map<String, Object>> arr = new ArrayList<Map<String,Object>>();
//		arr.add(user3);
//		arr.add(user2);
//		arr.add(user1);
//		System.out.println(user1 +"\n");
//		//String aa = "{\r\n"
//				+ "    \"lastName\": \"gupta\",\r\n"
//				+ "    \"Salary\": 20000.56,\r\n"
//				+ "    \"name\": \"prerna\",\r\n"
//				+ "    \"age\": 24,\r\n"
//				+ "    \"id\": \"613\",\r\n"
//				+ "    \"createdAt\": \"2023-03-07T09:56:44.655Z\"\r\n"
//				+ "}";
//		ArrayList list = new ArrayList();
//		//List<Map<String,Object>> list = new ArrayList();
//		
//		list.add(user1);
//		list.add(user2);
//		list.add(user3);
//		System.out.println(list);
//		Response res = RestAssured.given().baseUri("https://reqres.in/api/users").contentType(ContentType.JSON).body(list).post();
//		res.prettyPrint();
		//.header("Content-Type","application/json")
		RequestSpecification reqspec = RestAssured.given();
		reqspec.baseUri("https://reqres.in/").basePath("/api");
		HashMap<String,String> data = new HashMap<String,String>();
		data.put("name", "morpheos");
		data.put("job", "QA");
		Response res = reqspec.contentType(ContentType.JSON).body(data).post("/users");
		res.prettyPrint();
		res.then().assertThat().statusCode(201);
		//ResponseBody responsebody = res.getBody();
//		ObjectClassForDeserialzation varr = responsebody.as(ObjectClassForDeserialzation.class);
//		Assert.assertEquals(varr.name, "morpheos", "CHECK FOR NAME");
//		Assert.assertEquals(varr.job,  "QA" , "CHECK FOR JOB");
//		System.out.println(varr.name);
//		System.out.println(varr.job);
		ObjectClassForDeserialzation varr = res.as(ObjectClassForDeserialzation.class);
		Assert.assertEquals(varr.name, "morpheos", "CHECK FOR NAME");
		Assert.assertEquals(varr.job,  "QA" , "CHECK FOR JOB");
		System.out.println(varr.name);
		System.out.println(varr.job);
		System.out.println(res.asPrettyString());  
		
		
		
		
		
	}
}
