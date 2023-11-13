package restassured_test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;

public class post_api_teas_1 {
  @Test
  public void f() {
	  
	  File putmethodbodey = new File("C:\\GITHUB\\maria'github\\AmazonTestNGframework\\Jeson\\post_api_test_11.json");
	  
	  baseURI="https://reqres.in/";
	  String endpoint = "api/login";
	  
	  Response postresponse = given().contentType(ContentType.JSON).body(putmethodbodey).post(baseURI+endpoint);
	  
	 postresponse.prettyPrint();
	  
	  int statascode = postresponse.getStatusCode();
	  
	  System.out.println(statascode);
	  
	  
	  
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(statascode,200,"the status code is valid ");
	  sa.assertAll();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
