package BDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.*;

public class getAll {
public static void main(String[] args) {
	baseURI="http://localhost";
	port=8084;
	
	given()
	.when().get("/projects")
	.then().log().all();
}
}
