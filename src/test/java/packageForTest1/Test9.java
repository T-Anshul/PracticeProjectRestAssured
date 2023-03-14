package packageForTest1;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test9 {
	@Test
	public void test7() {
		RequestSpecification reqspec = RestAssured.given().baseUri("https://petstore.swagger.io").basePath("/v2/pet/10/uploadImage");
		File fileA = new File("C:\\Users\\Gyan\\Desktop\\1111\\mpic.jpg");
		//reqspec.multiPart(fileA);
		//reqspec.multiPart("file",fileA);
		
		
		reqspec.multiPart(fileA);
		Response res = reqspec.post();
		
		System.out.println("Status Code   " +res.getStatusCode());
		res.prettyPrint();
	}
}
