package fkm.Rest.BasicCRUD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put {
@Test
public void put() {
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy", "AUSAF");
	jobj.put("projectName", "WOOST");
	jobj.put("status", "Active");
	jobj.put("teamSize", 2);
	
	
	
	
	RequestSpecification req = RestAssured.given();
	req.contentType(ContentType.JSON);
	req.body(jobj);
	Response res = req.put("http://localhost:8084/projects/TY_PROJ_2804");
	System.out.println(res.asPrettyString());
	
	
}
}
