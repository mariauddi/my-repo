package restassured_test;

import java.io.File;

import org.openqa.selenium.json.Json;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PutMethodTest {
  @Test
  public void f() {
	  
	  
	  File putmethodbody = new File("C:\\GITHUB\\maria'github\\AmazonTestNGframework\\Jeson\\putbtn.json");
	  
	  Response putendpointfullresponse = given().contentType(ContentType.JSON).body(putmethodbody).put("https://reqres.in/api/users/2");
	  
	  putendpointfullresponse.prettyPrint();
	  
	  int statuscodeofmethodupdate = putendpointfullresponse.getStatusCode();
	  
	  System.out.println(statuscodeofmethodupdate);
	  
	  
	 // Assert.assertEquals(statuscodeofmethodupdate,200,"verification code" );
	  
	  
	  SoftAssert sater = new SoftAssert();
	  sater.assertEquals(statuscodeofmethodupdate,200,"verification code ");
	  sater.assertAll();
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
