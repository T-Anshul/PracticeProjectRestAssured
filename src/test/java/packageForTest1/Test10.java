package packageForTest1;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test10 {
	@Test
	public void test7() {
		RequestSpecification reqspec = RestAssured.given().baseUri("https://reqres.in").basePath("/api/users").queryParam("page", 2);
		Response res = reqspec.get();
		res.prettyPrint();
		//Assert.assertEquals(JsonSchemaValidator.matchesJsonSchema(new File("C:\\Users\\Gyan\\Desktop\\jschema.json")), null);
		res.then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("C:\\Users\\Gyan\\Desktop\\jschema.json"));
		System.out.println("Status Code ----   "+res.getStatusCode());
	}
}
