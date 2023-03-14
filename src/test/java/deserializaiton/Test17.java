package deserializaiton;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test17 {
	@Test
	public void test17() {
		String body = "{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		RequestSpecification reqspec = RestAssured.given().baseUri("https://reqres.in/").basePath("/api/users");
		reqspec.contentType(ContentType.JSON).body(body);
		Response res = reqspec.post();
		res.prettyPrint();
		res.then().assertThat().statusCode(201);
		ClassForDeserialization varr= res.as(ClassForDeserialization.class);
		System.out.println(varr.name);
		System.out.println(varr.job);
		System.out.println(varr.id);
		System.out.println(varr.createdAt);
	}

}
