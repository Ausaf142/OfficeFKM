package BDD_CRUD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Post {
@Test
public void post() {
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy", "pradeep");
	jobj.put("projectName", "MIS1");
	jobj.put("status", "Active");
	jobj.put("teamSize", 1);
	
	given()
	.contentType(ContentType.JSON)
	.body(jobj)
	.when()
	.post("http://localhost:8084/addProject/")
	.then().log().all();
	
	
	
	
	
	
}
}
