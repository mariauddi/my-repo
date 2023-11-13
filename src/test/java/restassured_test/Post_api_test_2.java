package restassured_test;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;

public class Post_api_test_2 {
  @Test
  public void f() {
	  File jesonfile = new File("C:\\GITHUB\\maria'github\\AmazonTestNGframework\\Jeson\\Post_api_test_22.json");
	  
	  Response create_response = given().contentType(ContentType.JSON).body(jesonfile).post("https://reqres.in/api/register");
	  
	  create_response.prettyPrint();
	  
	  int statsecode = create_response.getStatusCode();
	  System.out.println(statsecode);
	  
	  
	  
  }
}
