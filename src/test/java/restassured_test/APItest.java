package restassured_test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class APItest {
  @Test
  public void f() {
	  baseURI="https://reqres.in/";
	  
	  Response theresponseoftheapi = get(baseURI+"api/users?page=2");
	  
	  
	  theresponseoftheapi.prettyPrint();
	  int statuscode = theresponseoftheapi.getStatusCode();
	  System.out.println(statuscode);
	  
	
	  
	  
	  SoftAssert satest = new SoftAssert();
	  satest.assertEquals(statuscode,200,"list user api - assert for status code: ");
	  String bodyString = theresponseoftheapi.asString();
	  
	 // Assert.assertTrue(bodyString.toLowerCase().contains("michael.lawson@reqres.in"),"email verification in response: ");
	  
	  
	  Assert.assertEquals(bodyString.toLowerCase().contains("michael.lawson@reqres.in"),true,"email verification in response: ");
	  
	  satest.assertAll();
	  

	  
	  
	  
  }
}
