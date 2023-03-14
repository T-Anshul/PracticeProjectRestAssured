package deserializaiton;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import packageForTest1.NewClassforDeserialization;

public class Test18 {
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
		NewClassforDeserialization newvarr= res.as(NewClassforDeserialization.class);
		System.out.println(newvarr.name);
		//System.out.println(newvarr.job);
		System.out.println(newvarr.id);
		System.out.println(newvarr.createdAt);
	}

}
