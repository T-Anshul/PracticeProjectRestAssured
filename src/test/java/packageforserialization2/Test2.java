package packageforserialization2;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import packageforserialization.SerializationClass;

public class Test2 {
	@Test
	public void test2() {
		SerializationClass obj1 = new SerializationClass();
		obj1.setfirstName("himanshu");
		obj1.setlastName("negi");
		obj1.setgender("male");
		obj1.setage(28);
		obj1.setsalary(10000.5454);
		
		SerializationClass obj2 = new SerializationClass();
		obj2.setfirstName("vipin");
		obj2.setlastName("sirohi");
		obj2.setgender("male");
		obj2.setage(35);
		obj2.setsalary(30000.5454);
		
		SerializationClass obj3 = new SerializationClass();
		obj3.setfirstName("vijay");
		obj3.setlastName("tyagi");
		obj3.setgender("male");
		obj3.setage(36);
		obj3.setsalary(20000.5454);
		
//		List objoflist = new ArrayList();
//		objoflist.add(obj1);
//		objoflist.add(obj2);
//		objoflist.add(obj3);
		
		List<SerializationClass> objoflist2 = new ArrayList<SerializationClass>();
		objoflist2.add(obj1);
		objoflist2.add(obj2);
		objoflist2.add(obj3);
		
		Response res = RestAssured.given().baseUri("http://localhost:3000/posts").contentType(ContentType.JSON).body(objoflist2).post();
		System.out.println(res.asPrettyString());
	}

}
