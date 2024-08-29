package fkm.Rest.BasicCRUD;

import org.bouncycastle.cert.ocsp.Req;
import org.json.simple.JSONObject;
import org.openqa.selenium.json.Json;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_Single {
@Test
public void post() {
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy", "practiceOffice");
	jobj.put("projectName", "Interview2");
	jobj.put("status", "Active");
	jobj.put("teamSize", 1);
	
	RequestSpecification req = RestAssured.given();
	req.contentType(ContentType.JSON);
	req.body(jobj);
	Response res = req.post("http://localhost:8084/addProject");
	System.out.println(res.asPrettyString());
	
	
	
}
}
