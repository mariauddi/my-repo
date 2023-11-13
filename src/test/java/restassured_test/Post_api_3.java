package restassured_test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;

public class Post_api_3 {
  @Test
  public void f() {
	  
	  File jsonfile = new File("C:\\GITHUB\\maria'github\\AmazonTestNGframework\\Jeson\\Post_api_3.json");
	  
	  Response create_responsfile = given().contentType(ContentType.JSON).body(jsonfile).post("https://reqres.in/api/register");
	  
	  create_responsfile.prettyPrint();
	  int statuscode = create_responsfile.getStatusCode();
	  System.out.println(statuscode); 
	  
	  
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(statuscode,200,"create status code is verified");
	  sa.assertAll();
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
