package Request_Chaining;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Chain {
@Test
public void methodChaining() {
	baseURI="http://localhost";
	port=8084;

	JSONObject jobj=new JSONObject();
	jobj.put("createdBy", "Modijee");
	jobj.put("projectName", "Andbhakt1");
	jobj.put("status", "Active");
	jobj.put("teamSize", 1);
	
	Response req = given()
	.contentType(ContentType.JSON)
	.body(jobj)
	.when()
	.post("addProject/");
	
	String project = req.jsonPath().get("projectId");
	System.out.println(project);
	
	

	
	
	
	
	
	
	
	
	
	
	
}
}
