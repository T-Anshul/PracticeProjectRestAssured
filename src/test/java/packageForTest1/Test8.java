package packageForTest1;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test8 {
	@Test
	public void test7() {
		
		RequestSpecification reqspec = RestAssured.given();
		File fileA = new File("C:/Users/Gyan/Desktop/maneesh ji/Msig.jpg");
		//File fileB = new File("C:\\Users\\Gyan\\Desktop\\1111\\mpic.jpg");
		reqspec.baseUri("http://httpbin.org/post");
		reqspec.multiPart("file",fileA);
		//reqspec.contentType("multipart/form-data");
		//reqspec.multiPart("files",fileB);
		//reqspec.header("Content-Type","multipart/form-data");
		Response res = reqspec.post();
		
		System.out.println(res.getBody().asPrettyString());		
		Assert.assertEquals(res.statusCode(), 200,"check for this pls");	
	}
}
