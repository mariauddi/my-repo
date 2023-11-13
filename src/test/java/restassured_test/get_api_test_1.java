package restassured_test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class get_api_test_1 {
  @Test
  public void f() {
	  
	  
	  baseURI = "https://reqres.in/";
	  String endpoint = "api/users/2";
	  
	  Response create_responsefile = get(baseURI+endpoint);
	  
	  create_responsefile.prettyPrint();
	  int statuscode = create_responsefile.getStatusCode();
	  System.out.println(statuscode);
	  
	  
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(statuscode,200,"the email is velidate");
	  
	  String stringbody = create_responsefile.asString();
	  Assert.assertEquals(stringbody.contains("janet.weaver@reqres.in"),true,"the email is currect ");
	  
	  sa.assertAll();
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
