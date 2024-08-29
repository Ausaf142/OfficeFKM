package ThreeWayOfPost;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;




public class JsonObj {
@Test
public void jsonObj() {
	baseURI="http://localhost";
	port=8084;
	JSONObject Jobj= new JSONObject();
	Jobj.put("createdBy", "practiceOffice");
	Jobj.put("projectName", "Interview2");
	Jobj.put("status", "Active");
	Jobj.put("teamSize", 1);
	
	given()
	.body(Jobj)
	.contentType(ContentType.JSON)
	.when()
	.post("addProject")
	.then().log().all();
	
	
}
}
