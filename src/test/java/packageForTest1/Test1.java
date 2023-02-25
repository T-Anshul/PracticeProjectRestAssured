package packageForTest1;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test1 {
	@Test
	public void XmlMethod() {
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
		RequestSpecification reqspec = RestAssured.given();
		reqspec.baseUri("https://petstore.swagger.io");
		reqspec.basePath("/v2/pet");
//			JSONObject jsonData=new JSONObject();
//			jsonData.put(reqspec, jsonData)
		//reqspec.contentType("application/xml");
		reqspec.body(jsonData);
		reqspec.header("accept","application/json");
		reqspec.header("Content-Type", "application/json");
		
		Response res=reqspec.post();
		res.getBody().prettyPrint();
		
		
	}
}
