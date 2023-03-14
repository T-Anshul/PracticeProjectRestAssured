package deserializaiton;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Test19Jacksonapi {
	@Test
	public void createuser() {
		/*{
	"firstName": "prerna",
	"lastName": "sharma",
	"age": 28,
	"Salary": 1000.54,
	"IsMarried":true,
	"TechSkill":{
					"programming language": "c++",
					"web automation": "selenium",
					"API testing": "Rest Assured"
				}
					
}*/
		ObjectMapper name = new ObjectMapper();
		ObjectNode nodeby = name.createObjectNode();
		nodeby.put("firstName", "prerna");
		nodeby.put("lastName", "sharma");
		nodeby.put("age", 28);
		nodeby.put("Salary", "10000.54");
		nodeby.put("IsMarried", true);
		
		ObjectNode nodyby2 = name.createObjectNode();
		nodyby2.put("programming language", "C++");
		nodyby2.put("web automation", "Selenium");
		nodyby2.put("API testing", "Rest assured");
		
		nodeby.put("TechSkill", nodyby2);
		//System.out.println(nodeby);
		//String str = nodeby.asText();
		//System.out.println(str);
		String strr;
		try {
			strr = name.writerWithDefaultPrettyPrinter().writeValueAsString(nodeby);
			System.out.println(strr);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
	}	
		
}

