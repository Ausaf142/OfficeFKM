package Request_Chaining;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.Random;

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
	jobj.put("projectName", "Andbhakt"+random()+"");
	jobj.put("status", "Active");
	jobj.put("teamSize", 1);
	
	Response req = given()
	.contentType(ContentType.JSON)
	.body(jobj)
	.when()
	.post("addProject/");
	String project = req.jsonPath().get("projectId");
	System.out.println(project);
	req.then().log().all();
	
/*Here with the help of pathpara i am getting that particular */	
	given().pathParam("pid", project)
	.when()
	.get("/projects/{pid}")
	.then().log().all();
	
/*Here with the help of pathpara i changing the data that particular */	
	JSONObject jobj1=new JSONObject();
	jobj1.put("createdBy", "Modijee");
	jobj1.put("projectName", "bigFan"+random()+"");
	jobj1.put("status", "Active");
	jobj1.put("teamSize", 1);	
	given()
	.pathParam("pid", project)
	.body(jobj1)
	.contentType(ContentType.JSON)
	.when()
	.put("projects/{pid}")
	.then()
	.log().all();
	
/*Target that project and delete that project*/
	given()
	.pathParam("pid", project)
	.when()
	.delete("projects/{pid}")
	.then().log().all();
	
	
}
public static int random() {
	Random rKey= new Random();
	int Rkey = rKey.nextInt(100);
	return Rkey;
}


}
