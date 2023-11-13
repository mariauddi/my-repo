package restassured_test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;

public class PostAPITest {
  @Test
  public void f() {
	  File jsonFileObFile =  new File("C:\\GITHUB\\maria'github\\AmazonTestNGframework\\createbtn.json");
	  baseURI = "https://reqres.in/";
	  String cretebtn_endpoint="api/users";
	  Response create_respons =given().contentType(ContentType.JSON).body(jsonFileObFile).post(baseURI+cretebtn_endpoint);
	  
	  create_respons.prettyPrint();
	  
	  System.out.println(create_respons.getStatusCode());
	  int create_statuscode = create_respons.getStatusCode();
	  
	 // Assert.assertEquals(create_statuscode,200,"create_status code validation" );
	  
	  
	  SoftAssert sassert = new  SoftAssert();
	  sassert.assertEquals(create_statuscode,200,"create_status code validation" );
	  sassert.assertAll();
	  
	  
	  
  }
}
