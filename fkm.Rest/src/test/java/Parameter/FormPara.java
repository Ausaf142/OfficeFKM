package Parameter;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
public class FormPara {
@Test
public void formPara() {
	baseURI="https://reqres.in";
//	port=8084;
	given()
	.formParam("name", "Avenger")
	.formParam("job", "Thor1")
	.contentType(ContentType.JSON)
	.when()
	.post("/api/users")
	.then().log().all();
	
}
}
