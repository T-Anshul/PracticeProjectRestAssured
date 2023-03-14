package packageForTest1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import io.restassured.response.Response;
import static org.hamcrest.MatcherAssert.assertThat;

public class Test11 {
	@Test
	public void test7() {
		RestAssured.baseURI="https://reqres.in";
		Response res = RestAssured.given().when().get("/api/users?page=2");
		String body = res.getBody().asString();
		assertThat(body, JsonSchemaValidator.matchesJsonSchemaInClasspath("reqresSchema.json"));
		System.out.println(" Status code   "+res.getStatusCode());
		System.out.println(body);
		
		
	}
}
