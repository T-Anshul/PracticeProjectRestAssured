package packageForTest1;

import java.io.File;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test6 {
	@Test
	public void validateres() {
		File file1 = new File("C:\\Users\\Gyan\\Desktop\\maneesh ji\\b.COM f.jpg");
		
//		Response res = RestAssured.given().baseUri("https://petstore.swagger.io").basePath("/v2/pet/10/uploadImage")//.header("accept", "application/json")//
//				.header("Content-Type", "multipart/form-data").post();
//		System.out.println(res.getBody().asString());
//		
		RequestSpecification reqspec = RestAssured.given().baseUri("https://petstore.swagger.io").basePath("/v2/pet/10/uploadImage");
		reqspec.multiPart("file",file1);
		Response res = reqspec.post();
		res.prettyPrint();
		System.out.println("my name is nehru");
		
	}

}
