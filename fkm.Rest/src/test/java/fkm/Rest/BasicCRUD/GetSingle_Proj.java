package fkm.Rest.BasicCRUD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;

public class GetSingle_Proj {
@Test
public void getSingle() {
	 Response req = RestAssured.get("http://localhost:8084/projects/TY_PROJ_2802");
	 System.out.println(req.asPrettyString());
	 
}
}
