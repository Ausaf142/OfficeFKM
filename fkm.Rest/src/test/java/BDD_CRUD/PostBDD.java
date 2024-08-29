package BDD_CRUD;

import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
public class PostBDD {
	@Test
	public void post() {
		baseURI="http://localhost/";
		port=8084;
		
		
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Farhan");
		jobj.put("projectName", "Soft Engg");
		jobj.put("status", "Active");
		jobj.put("teamSize", 1);
		
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		.when()
		.post("addProject")
		.then().log().all();
}
}