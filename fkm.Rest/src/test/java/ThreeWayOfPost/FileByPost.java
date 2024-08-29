package ThreeWayOfPost;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class FileByPost {
@Test	
	public void FilePost() {
	baseURI="http://localhost";
	port=8084;
	File file =new File("./JSON.json");
	given()
	.body(file)
	.contentType(ContentType.JSON)
	.when()
	.post("/addProject")
	.then().log().all();
}
}