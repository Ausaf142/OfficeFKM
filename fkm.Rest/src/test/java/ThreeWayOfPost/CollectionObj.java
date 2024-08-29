package ThreeWayOfPost;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class CollectionObj {
@Test
public void collectionObject() {
	baseURI="http://localhost";
	port=8084;
	
	
	HashMap hobj = new HashMap();
	hobj.put("createdBy", "umesh");
	hobj.put("projectName", "Excel");
	hobj.put("status", "deactivated");
	hobj.put("teamSize", 1);
	
	given()
	.body(hobj)
	.contentType(ContentType.JSON)
	.when()
	.post("addProject")
	.then().log().all();
}
}
