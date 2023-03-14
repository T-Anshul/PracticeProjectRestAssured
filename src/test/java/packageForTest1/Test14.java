package packageForTest1;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test14 {
	@Test
	public void test7() {
//		given().baseUri("https://reqres.in").basePath("/api/users?page=2")
//		
//		.when().get()
//		
//		//.then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("reqresSchema.json")).log().all();
//		.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(new File("C:\\Users\\Gyan\\Desktop\\jschema.json"))).log().all();
		JSONObject var1 = new JSONObject();
		var1.put("name", "anshul");
		Map<String,String> var2 = new HashMap<String,String>();
		var2.put("lastName", "tyagi");
		HashMap<String,Object> var3 = new HashMap<String,Object>();
		var3.put("age", 24.5);
		List<Object> var4 = new ArrayList<Object>();
		var4.add(var1);
		var4.add(var2);
		var4.add(var3);
		ArrayList<Object> var5 = new ArrayList<Object>();
		var5.add(var1);
		var5.add(var2);
		var5.add(var3);
		System.out.println(var4);
		System.out.println(var5);
		
		
	}
}
