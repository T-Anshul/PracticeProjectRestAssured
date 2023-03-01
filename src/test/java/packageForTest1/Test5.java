package packageForTest1;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test5 {
	@Test
	public void validateres() {
		RequestSpecification reqspec = RestAssured.given().baseUri("https://reqres.in").basePath("/api/users")
				.queryParam("page",2);
		Response res = reqspec.get();
		//res.prettyPrint();
//		System.out.println(res.getBody().asString());
//		JsonPath path = new JsonPath(res.asString());
//		Assert.assertEquals(path.get("total") , 12);
//		System.out.println("my name is gentleman");
//		JsonPath path = res.jsonPath();
//		Assert.assertEquals(path.get("total"), 12);
//		System.out.println("my name is modi");
//		res.then().assertThat().body("total", Matchers.equalTo(12));
//		System.out.println("my name is rahul gandhi");
		JsonPath path = res.jsonPath();
		Assert.assertEquals(path.get("data[1].first_name") , "Lindsay");
		System.out.println("my name is mk gandhi");
		JsonPath path2 = new JsonPath(res.asString());
		Assert.assertEquals(path.get("data[4].first_name"), "George");
		System.out.println("my name is sonia gandhi");
		res.then().assertThat().body("data[5].first_name", Matchers.equalTo("Rachel"));
		System.out.println("my name is javahar lal nehru gandhi");
		
	}

}
