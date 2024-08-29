package fkm.Rest.BasicCRUD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAll {
@Test
public void getall() {
	 Response req = RestAssured.get("http://localhost:8084/projects");
	 System.out.println(req.asPrettyString());
}
}
