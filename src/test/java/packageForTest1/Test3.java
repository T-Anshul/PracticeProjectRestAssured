package packageForTest1;

import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Test3 {
	@Test
	public void Bdd_style() {
		String xmlData = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n"
				+ "<Pet>\r\n"
				+ "	<id>0</id>\r\n"
				+ "	<Category>\r\n"
				+ "		<id>0</id>\r\n"
				+ "		<name>string</name>\r\n"
				+ "	</Category>\r\n"
				+ "	<name>doggie</name>\r\n"
				+ "	<photoUrls>\r\n"
				+ "		<photoUrl>string</photoUrl>\r\n"
				+ "	</photoUrls>\r\n"
				+ "	<tags>\r\n"
				+ "		<Tag>\r\n"
				+ "			<id>0</id>\r\n"
				+ "			<name>string</name>\r\n"
				+ "		</Tag>\r\n"
				+ "	</tags>\r\n"
				+ "	<status>available</status>\r\n"
				+ "</Pet>";
		
		String jsonData ="{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"category\": {\r\n"
				+ "    \"id\": 0,\r\n"
				+ "    \"name\": \"string\"\r\n"
				+ "  },\r\n"
				+ "  \"name\": \"doggie\",\r\n"
				+ "  \"photoUrls\": [\r\n"
				+ "    \"string\"\r\n"
				+ "  ],\r\n"
				+ "  \"tags\": [\r\n"
				+ "    {\r\n"
				+ "      \"id\": 0,\r\n"
				+ "      \"name\": \"string\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"status\": \"available\"\r\n"
				+ "}";
//		RequestSpecification reqspec = RestAssured.given();
//		reqspec.baseUri("https://petstore.swagger.io").basePath("/v2/pet").body(jsonData).header("accept","application/json")
//		.header("Content-Type", "application/json");
//		//reqspec.basePath("/v2/pet");
////			JSONObject jsonData=new JSONObject();
////			jsonData.put(reqspec, jsonData)
//		//reqspec.contentType("application/xml");
//		//reqspec.body(jsonData);
//		//reqspec.header("accept","application/json");
//		//reqspec.header("Content-Type", "application/json");
//		
//		Response res=reqspec.post();
//		res.getBody().prettyPrint();
//		//System.out.println("Status Code  " +res.statusCode());
//		Assert.assertEquals(200, res.getStatusCode());  
//		//System.out.println("res.name");
//		Assert.assertEquals(res.body().asString().contains("doggie"), true);
//		JsonPath path = res.jsonPath();
//		System.out.println(path.get("category"));
//		Assert.assertEquals(path.get("name"), "doggie");
//		System.out.println(path.get("id"));
//		res.then().assertThat().body("name", Matchers.equalTo("doggie"));
//		res.then().body("status", Matchers.equalTo("available"));.accept("application/json").header("Content-Type", "application/json")
		given()
			//.baseUri("https://petstore.swagger.io").basePath("/v2/pet").body(xmlData).header("accept","application/json").header("Content-Type", "application/xml")//.contentType(ContentType.JSON)
			.baseUri("https://petstore.swagger.io").basePath("/v2/pet").body(jsonData).header("accept","application/json").contentType(ContentType.JSON)
		
		
		.when()
			.post()
		
		
		.then()
			.statusCode(200)
			.assertThat()
			.body("name", equalTo("doggie"))
			.log().all();
		
		
		
		
	}
}
