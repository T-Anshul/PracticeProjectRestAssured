package packageForTest1;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test7 {
	@Test
	public void test7() {
		File fileA = new File("C:/Users/Gyan/Desktop/maneesh ji/Msig.jpg");
		RequestSpecification reqspec = RestAssured.given();
		reqspec.baseUri("http://httpbin.org/post");
		reqspec.multiPart("file",fileA);
		Response res = reqspec.post();
		System.out.println(res.getBody().asPrettyString());		
		Assert.assertEquals(res.statusCode(), 200,"check for this pls");
		
		
		
	}

}
