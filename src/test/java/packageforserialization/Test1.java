package packageforserialization;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test1 {
	
	@Test
	public void vipin() {
		Response res = RestAssured.given().baseUri("http://localhost:3000/posts/10").get();
		System.out.println(res.asPrettyString());
	}

}
