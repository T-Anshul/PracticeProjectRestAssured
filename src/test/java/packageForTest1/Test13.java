package packageForTest1;

import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

import static io.restassured.RestAssured.*;

import java.io.File;

public class Test13 {
	@Test
	public void test7() {
		given().baseUri("https://reqres.in").basePath("/api/users?page=2")
		
		.when().get()
		
		//.then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("reqresSchema.json")).log().all();
		.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(new File("C:\\Users\\Gyan\\Desktop\\jschema.json"))).log().all();
	}
}
