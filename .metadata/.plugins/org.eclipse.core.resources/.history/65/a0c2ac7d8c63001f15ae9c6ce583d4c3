package BDD_CRUD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Get_Single {
@Test
public void get_Single() {
	baseURI="http://localhost";
	port=8084;
	 when()
	 .get("projects/TY_PROJ_2808")
	 .then().log().all();
	 
}
}
