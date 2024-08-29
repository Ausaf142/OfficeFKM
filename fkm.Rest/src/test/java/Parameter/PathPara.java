package Parameter;
import static io.restassured.RestAssured.*;

import fkm.Rest.POJO.Employee_Library;
import io.restassured.http.ContentType;

public class PathPara {
public static void main(String[] args) {
	baseURI="http://localhost";
	port=8084;
	Employee_Library emp =new Employee_Library("kdf","fddf","fd",5);
	
	given()
	.pathParam("pid", "TY_PROJ_3002")
	.contentType(ContentType.JSON)
	.body(emp)
	.when().put("projects/{pid}")
	.then().log().all();
}
}
