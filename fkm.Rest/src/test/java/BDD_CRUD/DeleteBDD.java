package BDD_CRUD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;

public class DeleteBDD {
	@Test
	public void delProj() {
		baseURI="http://localhost";
		port=8084;
			when()
			.delete("projects/TY_PROJ_2805")
			.then().log().all();
		}
}
