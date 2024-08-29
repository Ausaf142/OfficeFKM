package BDD_CRUD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class Get_All {
		@Test
		public void get_Single() {
			baseURI="http://localhost";
			port=8084;
			 when()
			 .get("projects")
			 .then().log().all();
			 
		}
		
}
