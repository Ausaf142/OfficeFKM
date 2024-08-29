package fkm.Rest.BasicCRUD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;

public class Delete {
	@Test
	public void delProj() {
		RequestSender req = RestAssured.when();
		Response res = req.delete("http://localhost:8084/projects/TY_PROJ_2806");
		System.out.println(res.asPrettyString());
		}
		
}
