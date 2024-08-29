package Parsing;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import fkm.Rest.POJO.Employee_Library;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Serialization {
@Test
public void serial() throws JsonGenerationException, JsonMappingException, IOException {
	Employee_Library elib = new Employee_Library("Shakti kapoor", "Stree", "BoxOffice Hit", 2);
	File file = new File("./ser.json");
	ObjectMapper omap = new ObjectMapper();
	omap.writeValue(file, elib);
	baseURI="http://localhost";
	port=8084;
	 
	given()
	.body(elib)
	.contentType(ContentType.JSON)
	.when()
	.post("addProject")
	.then().log().all();
}
}
